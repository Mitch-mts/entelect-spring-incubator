package entelect.training.incubator.spring.bookingservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer implements Serializable {
    private Integer id;

    private String username;

    private String firstName;

    private String lastName;

    private String passportNumber;

    private String email;

    private String phoneNumber;
}
