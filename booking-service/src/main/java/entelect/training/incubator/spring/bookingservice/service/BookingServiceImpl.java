package entelect.training.incubator.spring.bookingservice.service;

import entelect.training.incubator.spring.bookingservice.config.dto.BookingRequest;
import entelect.training.incubator.spring.bookingservice.config.model.Booking;
import entelect.training.incubator.spring.bookingservice.respository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking create(BookingRequest request) {
        return null;
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
}
