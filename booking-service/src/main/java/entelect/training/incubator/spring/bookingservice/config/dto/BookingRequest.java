package entelect.training.incubator.spring.bookingservice.config.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class BookingRequest {
    private String flightId;
    private String customerId;
}
