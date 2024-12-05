package entelect.training.incubator.spring.customer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entelect.training.incubator.spring.customer.dto.CustomerRequest;
import entelect.training.incubator.spring.customer.model.Customer;
import entelect.training.incubator.spring.customer.dto.CustomerSearchRequest;
import entelect.training.incubator.spring.customer.service.CustomersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static entelect.training.incubator.spring.customer.model.Customer.customerBuilder;

@RestController
@RequestMapping("customers")
public class CustomersController {

    /*
    * Both Logger LOGGER = LoggerFactory.getLogger(ClassName.class);
    * and the @Slf4j annotation serve the purpose of enabling logging in your classes,
    * but they differ in terms of convenience, readability, and usage.
    * You can make use of Logger when lombok is not allowed or not in use */
    private final Logger LOGGER = LoggerFactory.getLogger(CustomersController.class);

    private final CustomersService customersService;

    public CustomersController(CustomersService customersService) {
        this.customersService = customersService;
    }

    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody CustomerRequest customer) throws JsonProcessingException {
        LOGGER.info("Processing customer creation request for customer={}", prettyPrintJson(customer));

        final Customer savedCustomer = customersService.createCustomer(customer);

        LOGGER.trace("Customer created");
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getCustomers() {
        LOGGER.info("Fetching all customers");
        List<Customer> customers = customersService.getCustomers();

        if (!customers.isEmpty()) {
            LOGGER.trace("Found customers");
            return new ResponseEntity<>(customers, HttpStatus.OK);
        }

        LOGGER.info("No customers could be found");
        return ResponseEntity.notFound().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getCustomerById(@PathVariable Integer id) {
        LOGGER.info("Processing customer search request for customer id={}", id);
        Customer customer = this.customersService.getCustomer(id);

        if (customer != null) {
            LOGGER.trace("Found customer");
            return new ResponseEntity<>(customer, HttpStatus.OK);
        }

        LOGGER.trace("Customer not found");
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/search")
    public ResponseEntity<?> searchCustomers(@RequestBody CustomerSearchRequest searchRequest) {
        LOGGER.info("Processing customer search request for request {}", searchRequest);

        Customer customer = customersService.searchCustomers(searchRequest);

        if (customer != null) {
            return ResponseEntity.ok(customer);
        }

        LOGGER.trace("Customer not found");
        return ResponseEntity.notFound().build();
    }

    public static String prettyPrintJson(Object o) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }
}