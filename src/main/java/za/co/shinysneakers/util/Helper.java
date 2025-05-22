package za.co.shinysneakers.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
    public static boolean isValidMobile(String mobile) {
        return mobile == null || mobile.isEmpty() || mobile.matches("^[0-9]{10}$");
    }
    public static String generateID(){return UUID.randomUUID().toString();}

    // Todo: isValidPostalCode method - 4 digits with range 1000 to 9999
    public static boolean isValidPostalCode(int postalCode) {
        if (postalCode < 1000 || postalCode > 9999) {
            return false;
        }
        return true;
    }

    // Todo: isValidStreetNumber method - 1 to 5 digits with range 1 to 99999
    public static boolean isValidStreetNumber(short streetNumber) {
        if (streetNumber < 1 || streetNumber > 99999) {
            return false;
        }
        return true;
    }


    // Todo: isValidErfNumber method - 1 to 5 digits with range 1 to 99999
    public static boolean isValidErfNumber(int erfNumber) {
        if (erfNumber < 1 || erfNumber > 99999) {
            return false;
        }
        return true;
    }

    // Todo: isValidUnitNumber method - 1 to 5 digits with range 1 to 99999
    public static boolean isValidUnitNumber(short unitNumber) {
        if (unitNumber < 1 || unitNumber > 99999) {
            return false;
        }
        return true;
    }
}
