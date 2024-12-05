package entelect.training.incubator.spring.customer.service;

import entelect.training.incubator.spring.customer.dto.CustomerRequest;
import entelect.training.incubator.spring.customer.model.Customer;
import entelect.training.incubator.spring.customer.dto.CustomerSearchRequest;

import java.util.List;

/*
* using an interface to define methods when making calls from controller to the business logic is a best practice in software dev
* this approach adheres to the key principles of OOP
* making use of interface for defining implementation methods for business logic has the below advantages
* 1. Abstraction and loose coupling - this enhances flexibility and maintainability
* 2. Testability - simplifies unit testing
* 3. Adherence to SOLID principles
* 4. Separation of concerns
* 5. Scalability*/
public interface CustomersService {
    Customer createCustomer(CustomerRequest customer);
    Customer searchCustomers(CustomerSearchRequest searchRequest);
    Customer getCustomer(Integer id);
    List<Customer> getCustomers();
}
