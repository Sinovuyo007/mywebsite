package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.util.Helper;

import java.util.Random;

public class HomeAdressFactory {
    public static HomeAddress createHomeAddress(
             //long addressId,
     String streetNumber,
     String streetName,
     String surburb,
     String city,
     String province,
     String country,
     int postalCode) {
        long addressID = new Random().nextLong();
        if(Helper.isNullOrEmpty(streetNumber)
                ||Helper.isNullOrEmpty(streetName)
                ||Helper.isNullOrEmpty(surburb)
                ||Helper.isNullOrEmpty(city)
                ||Helper.isNullOrEmpty(province)
                ||Helper.isNullOrEmpty(country)
                ||Helper.isValidPostalCode(postalCode)){
            return null;
        }
        return new HomeAddress.Builder()
                .setAddressId(addressID)
                .setAddressId(addressID)
                .setStreetName(streetName)
                .setStreetNumber(streetNumber)
                .setSurburb(surburb)
                .setCity(city)
                .setProvince(province)
                .setCountry(country)
                .build();
    }
}
