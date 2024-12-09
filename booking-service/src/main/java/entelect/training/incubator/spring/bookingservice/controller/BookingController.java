package entelect.training.incubator.spring.bookingservice.controller;

import entelect.training.incubator.spring.bookingservice.dto.BookingRequest;
import entelect.training.incubator.spring.bookingservice.model.Booking;
import entelect.training.incubator.spring.bookingservice.service.BookingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "bookings")
@Slf4j
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Booking> createBooking(@RequestBody BookingRequest request) {
        return new ResponseEntity<>(bookingService.create(request), HttpStatus.CREATED);
    }

    @GetMapping(value = "/booking-list")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return new ResponseEntity<>(bookingService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customer-id/{customerId}")
    public ResponseEntity<List<Booking>> getAllCustomerBookings(@PathVariable String customerId) {
        return new ResponseEntity<>(bookingService.getAllCustomerBookings(customerId), HttpStatus.OK);
    }

    @GetMapping(value = "/flight-id/{flightId}")
    public ResponseEntity<List<Booking>> getAllFlightBookings(@PathVariable String flightId) {
        return new ResponseEntity<>(bookingService.getAllFlightBookings(flightId), HttpStatus.OK);
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<Booking> getAllById(@PathVariable Long id) {
        return new ResponseEntity<>(bookingService.getById(id), HttpStatus.OK);
    }
}
