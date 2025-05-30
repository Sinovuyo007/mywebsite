package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.domain.HomeAddress;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {
    private static HomeAddress homeAddress = HomeAdressFactory.createHomeAddress(
            "71"
            ,"Dickens drive"
            ,"Mandalay"
            ,"Mithcells Plain"
            ,"Western Cape"
            ,"South Africa"
            ,7140
    );
    private static Customer customer = CustomerFactory.createCustomer("Sinovuyo"
    ,"Mathungana"
    ,"mathungana@gmail.com"
    ,"0987654321"
    ,homeAddress);
    @Test
    void createCustomer() {
        assertNotNull(homeAddress);
        assertNotNull(customer);
        System.out.println(customer.toString());
    }
}