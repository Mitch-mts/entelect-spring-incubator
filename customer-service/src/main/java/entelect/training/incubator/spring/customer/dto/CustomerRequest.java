package entelect.training.incubator.spring.customer.dto;

import entelect.training.incubator.spring.customer.model.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerRequest {
    private String username;

    private String firstName;

    private String lastName;

    private String passportNumber;

    private String email;

    private String phoneNumber;
}
