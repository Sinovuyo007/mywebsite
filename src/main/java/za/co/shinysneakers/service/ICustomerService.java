package za.co.shinysneakers.service;

import za.co.shinysneakers.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService extends IService<Customer,String> {
    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByMobile(String mobile);
    List<Customer> getAll();
}
