package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.util.Helper;

import java.util.Random;

public class CustomerFactory {
    public static Customer createCustomer(
            String firstName,
            String lastName,
            String email,
            String mobile,
            HomeAddress homeAddress) {
        String customerID = Helper.generateID();

        //long addressID = new Random().nextLong();
        if(Helper.isNullOrEmpty(customerID)
                ||Helper.isNullOrEmpty(firstName)
                ||Helper.isNullOrEmpty(lastName)
        ||Helper.isNullOrEmpty(email)
        ||Helper.isValidMobile(mobile)){
            return null;
        }
        return new Customer.Builder()
                .setCustomerId(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setMobile(mobile)
                .setAddress(homeAddress)
                .build();
    }
}
