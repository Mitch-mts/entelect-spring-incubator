package entelect.training.incubator.spring.bookingservice.service;

import entelect.training.incubator.spring.bookingservice.dto.BookingRequest;
import entelect.training.incubator.spring.bookingservice.model.Booking;

import java.util.List;

public interface BookingService {
    Booking create(BookingRequest request);
    List<Booking> getAll();
    Booking getById(Long id);
    List<Booking> getAllCustomerBookings(String customerId);
    List<Booking> getAllFlightBookings(String flightId);
}
