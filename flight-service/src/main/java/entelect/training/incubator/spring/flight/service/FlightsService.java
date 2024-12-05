package entelect.training.incubator.spring.flight.service;

import entelect.training.incubator.spring.flight.model.Flight;
import entelect.training.incubator.spring.flight.model.FlightsSearchRequest;

import java.util.List;

public interface FlightsService {
    Flight createFlight(Flight flight);
    List<Flight> getFlights();
    Flight getFlight(Integer id);
    List<Flight> getDiscountedFlights();
    List<Flight> searchFlights(FlightsSearchRequest searchRequest);
}
