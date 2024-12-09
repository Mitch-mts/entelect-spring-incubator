package entelect.training.incubator.spring.bookingservice.service;

import entelect.training.incubator.spring.bookingservice.dto.BookingRequest;
import entelect.training.incubator.spring.bookingservice.model.Booking;
import entelect.training.incubator.spring.bookingservice.respository.BookingRepository;
import entelect.training.incubator.spring.bookingservice.rest.BookingClientService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final BookingClientService bookingClientService;


    public BookingServiceImpl(BookingRepository bookingRepository, BookingClientService bookingClientService) {
        this.bookingRepository = bookingRepository;
        this.bookingClientService = bookingClientService;
    }

    @Override
    public Booking create(BookingRequest request) {
        var customerExists = bookingClientService.checkIfCustomerExists(request.getCustomerId());
        var flightExists = bookingClientService.checkIfFlightExists(request.getFlightId());

        if (customerExists == null || flightExists == null) {
            throw new RuntimeException("Booking could not be saved, Flight or Customer details not found");
        }

        Booking booking = Booking.builder()
                .customerId(request.getCustomerId())
                .flightId(request.getFlightId())
                .referenceNumber(generateUniqueId())
                .dateCreated(LocalDateTime.now())
                .build();

        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAll() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }

    @Override
    public List<Booking> getAllCustomerBookings(String customerId) {
        return bookingRepository.findAllByCustomerId(customerId);
    }

    @Override
    public List<Booking> getAllFlightBookings(String flightId) {
        return bookingRepository.findAllByFlightId(flightId);
    }

    protected static String generateUniqueId() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder uniqueId = new StringBuilder(7);
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            int index = random.nextInt(characters.length());
            uniqueId.append(characters.charAt(index));
        }

        return uniqueId.toString();
    }
}
