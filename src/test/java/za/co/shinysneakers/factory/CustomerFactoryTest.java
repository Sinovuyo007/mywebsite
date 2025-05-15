package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {
    private Customer customer = CustomerFactory.createCustomer();
    @Test
    void createCustomer() {
    }
}