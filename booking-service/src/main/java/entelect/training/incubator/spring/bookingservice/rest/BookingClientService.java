package entelect.training.incubator.spring.bookingservice.rest;

import entelect.training.incubator.spring.bookingservice.dto.Customer;
import entelect.training.incubator.spring.bookingservice.dto.Flight;

public interface BookingClientService {
    Flight checkIfFlightExists(String flightId);
    Customer checkIfCustomerExists(String customerId);
}
