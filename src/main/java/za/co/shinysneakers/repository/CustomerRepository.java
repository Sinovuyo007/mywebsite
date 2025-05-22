package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.Customer;

import java.util.Optional;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>  {
    @Query("select u from Customer u where u.email = ?1")
    Optional<Customer> findByEmail(String email);
    @Query("select u from Customer u where u.mobile = ?1")
    Optional<Customer> findByMobile(String mobile);
}
