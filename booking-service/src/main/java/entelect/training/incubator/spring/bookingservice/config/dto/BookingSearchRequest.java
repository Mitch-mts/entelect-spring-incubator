package entelect.training.incubator.spring.bookingservice.config.dto;

import lombok.Data;

@Data
public class BookingSearchRequest {
    private SearchType searchType;
    private String flightId;
    private String customerId;
    private String referenceNumber;
}
