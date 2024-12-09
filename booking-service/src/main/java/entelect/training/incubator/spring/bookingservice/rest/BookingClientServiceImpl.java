package entelect.training.incubator.spring.bookingservice.rest;

import entelect.training.incubator.spring.bookingservice.dto.Customer;
import entelect.training.incubator.spring.bookingservice.dto.Flight;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.temporal.ChronoUnit;

@Service
@Slf4j
public class BookingClientServiceImpl implements BookingClientService {
    private final RestTemplate restTemplate;

    private final String FLIGHT_URL = "/flights/";
    private final String CUSTOMER_URL = "/customers/";

    public BookingClientServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Flight checkIfFlightExists(String flightId) {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<String> httpEntity = new HttpEntity<>("", httpHeaders);

            log.info("flight httpEntity: {}", httpEntity);

            var response = restTemplate.exchange(
                    FLIGHT_URL,
                    HttpMethod.GET,
                    httpEntity,
                    new ParameterizedTypeReference<Flight>() {
                    }
            ).getBody();

            log.info("flight response: {}", response);

            return response;

        } catch (Exception e) {
            log.error("flight error: {}", e.getMessage());
            throw new RuntimeException("Failed to get Flight details");
        }

    }

    @Override
    public Customer checkIfCustomerExists(String customerId) {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<String> httpEntity = new HttpEntity<>("", httpHeaders);

            log.info("customer httpEntity: {}", httpEntity);

            var response = restTemplate.exchange(
                    CUSTOMER_URL,
                    HttpMethod.GET,
                    httpEntity,
                    new ParameterizedTypeReference<Customer>() {
                    }
            ).getBody();

            log.info("customer response: {}", response);

            return response;

        } catch (Exception e) {
            log.error("customer error: {}", e.getMessage());
            throw new RuntimeException("Failed to get Customer details");
        }
    }
}
