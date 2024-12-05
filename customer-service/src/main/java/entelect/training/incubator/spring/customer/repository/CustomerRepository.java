package entelect.training.incubator.spring.customer.repository;

import entelect.training.incubator.spring.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/*
* In Spring Data, both the CrudRepository and JpaRepository interfaces provide functionality to interact with a database
* the CrudRepository interface provides the CRUD operations (create, read, update, delete). It is best suited for apps where only basic CRUD
* functionality is required
* the JpaRepository extends both the CrudRepository and PagingAndSortingRepository to provide additional JPA specific functionality
* and pagination and sortin. It is ideal for apps that need advanced JPA specific use cases such as batch processing
* pagination and sorting */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
    Optional<Customer> findByFirstNameAndLastName(String firstName, String lastName);

    Optional<Customer> findByPassportNumber(String passportNumber);
    
    Optional<Customer> findByUsername(String username);
}
