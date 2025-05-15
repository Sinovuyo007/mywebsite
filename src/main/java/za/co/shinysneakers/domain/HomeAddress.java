package za.co.shinysneakers.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HomeAddress {
    @Id
    private long addresId;
    private String streetNumber;
    private String streetName;
    private String city;
    private String province;
    private String country;
    private int postalCode;

    protected HomeAddress() {}

    private HomeAddress(Builder builder) {
        this.addresId = builder.addresId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.city = builder.city;
        this.province = builder.province;
        this.country = builder.country;
        this.postalCode = builder.postalCode;
    }
    public long getAddresId() {
        return addresId;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
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
        private long addresId;
        private String streetNumber;
        private String streetName;
        private String city;
        private String province;
        private String country;
        private int postalCode;
        public Builder setAddresId(long addresId) {
            this.addresId = addresId;
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
            this.addresId = homeAddress.addresId;
            this.streetNumber = homeAddress.streetNumber;
            this.streetName = homeAddress.streetName;
            this.city = homeAddress.city;
            this.province = homeAddress.province;
            this.country = homeAddress.country;
            this.postalCode = homeAddress.postalCode;
            return this;
        }

        public HomeAddress build() {return new HomeAddress(this);}
    }
}
