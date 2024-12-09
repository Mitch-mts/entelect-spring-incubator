package entelect.training.incubator.spring.bookingservice.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Flight implements Serializable {
    private Integer id;

    private String flightNumber;

    private String origin;

    private String destination;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private Integer seatsAvailable;

    private Float seatCost;
}
