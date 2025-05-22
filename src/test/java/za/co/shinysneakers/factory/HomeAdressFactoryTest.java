package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.HomeAddress;

import static org.junit.jupiter.api.Assertions.*;

class HomeAdressFactoryTest {
    private static HomeAddress homeAddress = HomeAdressFactory.createHomeAddress(
            "71"
            ,"Dickens drive"
            ,"Mandalay"
            ,"Mithcells Plain"
            ,"Western Cape"
            ,"South Africa"
            ,7140
    );
    @Test
    void createHomeAddress() {
        assertNotNull(homeAddress);
        System.out.println(homeAddress);
    }
}