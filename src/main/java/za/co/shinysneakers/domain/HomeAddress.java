package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HomeAddress {
    @Id
    private long addressId;
    private String streetNumber;
    private String streetName;
    private String surburb;
    private String city;
    private String province;
    private String country;
    private int postalCode;

    protected HomeAddress() {}

    private HomeAddress(Builder builder) {
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.surburb = builder.surburb;
        this.city = builder.city;
        this.province = builder.province;
        this.country = builder.country;
        this.postalCode = builder.postalCode;
    }
    public long getAddressId() {
        return addressId;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getSurburb() {
        return surburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public int getPostalCode() {
        return postalCode;
    }
    public static class Builder {
        private long addressId;
        private String streetNumber;
        private String streetName;
        private String surburb;
        private String city;
        private String province;
        private String country;
        private int postalCode;
        public Builder setAddressId(long addressId) {
            this.addressId = addressId;
            return this;
        }
        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }
        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }
        public Builder setSurburb(String surburb) {
            this.surburb = surburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder copy(HomeAddress homeAddress) {
            this.addressId = homeAddress.addressId;
            this.streetNumber = homeAddress.streetNumber;
            this.streetName = homeAddress.streetName;
            this.surburb = homeAddress.surburb;
            this.city = homeAddress.city;
            this.province = homeAddress.province;
            this.country = homeAddress.country;
            this.postalCode = homeAddress.postalCode;
            return this;
        }

        public HomeAddress build() {return new HomeAddress(this);}
    }
}
