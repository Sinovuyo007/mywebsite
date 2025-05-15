package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.shinysneakers.domain.Customer;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,String>  {

    Optional<Customer> findByEmail(String email);
    Optional<Customer> findByMobile(String mobile);
}
