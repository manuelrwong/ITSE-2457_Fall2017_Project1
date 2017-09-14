/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Carla
 */
public class Address {

    //Street
    private String street;

    //City.
    private String city;

    //State.
    private String state;

    //Zip code.
    private long zipCode;

    //Constructs a new address with a default street name, a default city, a default state, and a default zip code.
    public Address() {
        this("", "", "", 0);
    }

    /* Constructs a new address with a street name, a city, a state, and a zip code.
     * @param street The street
     * @param city The city 
     * @param state The state 
     * @param zipCode The zip code 
     */
    public Address(String street, String city, String state, long zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    //Returns a String to street.
    public String getStreet() {
        return street;
    }

    //Changes street.
    public void setStreet(String street) {
        this.street = street;
    }

    //Returns a String to city.
    public String getCity() {
        return city;
    }

    //Change city.
    public void setCity(String city) {
        this.city = city;
    }

    //Returns a String to state.
    public String getState() {
        return state;
    }

    //Changes state.
    public void setState(String state) {
        this.state = state;
    }

    //Returns a String to zip code.
    public long getZipCode() {
        return zipCode;
    }

    //Changes zip code.
    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    //Returns a String the Address.
    public String toString() {
        return getClass().getSimpleName() + ":" + this.street + "\n" + this.city + ", " + this.state + "  " + this.zipCode;
    }

    // Indicate if the address is equal to other address
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }

        Address other = (Address) obj;
        return this.street.equalsIgnoreCase(other.street) && this.city.equalsIgnoreCase(other.city)
                && this.state.equalsIgnoreCase(other.state) && this.zipCode == other.zipCode;
    }

}