/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Monica
 */
public class Address {

    //The street of the address
    private String street;

    // The city of the address
    private String city;

    // The state of the address
    private String state;

    // The zip code of the address
    private long zipCode;

    //Constructs a new address with a default street name, a default city, a default state, and a default zip code.
    public Address() {
        this("", "", "", 0);
    }
   

    /*   Constructs a new address with a street name, a city, a state, and a zip code.
     * @param street The street of this address
     * @param city The city of this address
     * @param state The state of this address
     * @param zipCode The zip code of this address
     */
    public Address(String street, String city, String state, long zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //Returns a String with the street
    public String getStreet() {
        return street;
    }

    //Changes the street
    public void setStreet(String street) {
        this.street = street;
    }

    //Returns a String with the city
    public String getCity() {
        return city;
    }

    //Change the city
    public void setCity(String city) {
        this.city = city;
    }

    //Returns a String with the state
    public String getState() {
        return state;
    }

    //Changes the state
    public void setState(String state) {
        this.state = state;
    }

    //Returns a String with the zip code
    public long getZipCode() {
        return zipCode;
    }

    //Changes the zip code
    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    //Returns a String representation of the Address.
    public String toString() {
        return getClass().getSimpleName() + ":" + this.street + "\n" + this.city + ", " + this.state + "  " + this.zipCode;
    }

    // Indicates if the address is "equal to" some other object. 
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }

        Address other = (Address) obj;
        return this.street.equalsIgnoreCase(other.street) && this.city.equalsIgnoreCase(other.city)
                && this.state.equalsIgnoreCase(other.state) && this.zipCode == other.zipCode;
    }

}
