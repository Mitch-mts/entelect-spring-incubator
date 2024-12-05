package entelect.training.incubator.spring.customer.service;

import entelect.training.incubator.spring.customer.dto.CustomerRequest;
import entelect.training.incubator.spring.customer.model.Customer;
import entelect.training.incubator.spring.customer.dto.CustomerSearchRequest;
import entelect.training.incubator.spring.customer.dto.SearchType;
import entelect.training.incubator.spring.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Supplier;

import static entelect.training.incubator.spring.customer.model.Customer.customerBuilder;

@Service
public class CustomersServiceImpl implements CustomersService {

    private final CustomerRepository customerRepository;

    public CustomersServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(CustomerRequest customer) {
        return customerRepository.save(customerBuilder(customer));
    }

    @Override
    public List<Customer> getCustomers() {
        List<Customer> customerIterable = customerRepository.findAll();
        return new ArrayList<>(customerIterable);
    }

    @Override
    public Customer getCustomer(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer searchCustomers(CustomerSearchRequest searchRequest) {
        Map<SearchType, Supplier<Optional<Customer>>> searchStrategies = new HashMap<>();

        searchStrategies.put(SearchType.NAME_SEARCH, () -> customerRepository.findByFirstNameAndLastName(searchRequest.getFirstName(), searchRequest.getLastName()));
        searchStrategies.put(SearchType.PASSPORT_SEARCH, () -> customerRepository.findByPassportNumber(searchRequest.getPassport()));
        searchStrategies.put(SearchType.USER_SEARCH, () -> customerRepository.findByUsername(searchRequest.getUsername()));

        Optional<Customer> customerOptional = searchStrategies.get(searchRequest.getSearchType()).get();

        return customerOptional.orElse(null);
    }
}
