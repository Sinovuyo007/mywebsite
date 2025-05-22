package za.co.shinysneakers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.repository.CustomerRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {this.customerRepository = customerRepository;}
    @Override
    public Customer create(Customer t) {
        return customerRepository.save(t);
    }

    @Override
    public Customer read(String id) {
        return customerRepository.getReferenceById(id);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public Optional<Customer> findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    @Override
    public Optional<Customer> findByMobile(String mobile) {
        return customerRepository.findByMobile(mobile);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
