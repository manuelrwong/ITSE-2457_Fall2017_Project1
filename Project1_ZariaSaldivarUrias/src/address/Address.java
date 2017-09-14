//======================================================================================================
//
// Name : Zaira Lizeth Saldivar Urias.
//
// Date : September 9th, 2017.
//
//======================================================================================================

package address;

//======================================================================================================
public class Address {

    //Contains an string of the street.
    private String street;

    //Contains an string of the city.
    private String city;

    //Contains an string of the state.
    private String state;

    //Contains a number of the zip code.
    private long zipCode;

    //Constructs a new address with a default street name, city, state, and zip code.
    public Address() {
        this("", "", "", 0);
    }

    //Constructs a new address with a street, city, state, and zip code.
     
    public Address(String street, String city, String state, long zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

//======================================================================================================

    //Returns the street.
    public String getStreet() {
        return street;
    }

    //Changes the street.
    public void setStreet(String street) {
        this.street = street;
    }

//======================================================================================================

    //Returns the city.
    public String getCity() {
        return city;
    }

    //Change the city.
    public void setCity(String city) {
        this.city = city;
    }

//======================================================================================================

    //Returns the state.
    public String getState() {
        return state;
    }

    //Changes the state.
    public void setState(String state) {
        this.state = state;
    }

//======================================================================================================

    //Returns the zip code.
    public long getZipCode() {
        return zipCode;
    }

    //Changes the zip code.
    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

//======================================================================================================

    //Returns the full Address as a string.
    public String toString() {
        return getClass().getSimpleName() + ":" + this.street + "\n" + this.city + ", " + this.state + "  " + this.zipCode;
    }

//======================================================================================================
//Indicates if this address is "equal to" some other object. If some other
//object is not a address, return false to indicate "not equal to"
//relationship. If some other object is a address, they are equal if their
//street, city, state and zip code are equal. 
    
    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }

        Address other = (Address) obj;
        return this.street.equalsIgnoreCase(other.street) && this.city.equalsIgnoreCase(other.city)
                && this.state.equalsIgnoreCase(other.state) && this.zipCode == other.zipCode;
    }

}
