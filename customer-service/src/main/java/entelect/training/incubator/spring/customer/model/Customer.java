package entelect.training.incubator.spring.customer.model;

import entelect.training.incubator.spring.customer.dto.CustomerRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String username;
    
    private String firstName;
    
    private String lastName;
    
    private String passportNumber;
    
    private String email;
    
    private String phoneNumber;

    public static Customer customerBuilder(CustomerRequest request) {
        return Customer.builder()
                .email(request.getEmail())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .phoneNumber(request.getPhoneNumber())
                .username(request.getUsername())
                .passportNumber(request.getPassportNumber())
                .build();
    }
}
