package students;


public class Address{
	 /**
	  * The street of this address
	  */
	 private String street;
	 /**
	  * The city of this address
	  */
	 private String city;
	 /**
	  * The state of this address
	  */
	 private String state;
	 /**
	  * The zip code of this address
	  */
	 private long zipCode;

	 /**
	  * Constructs a new address with a default street name, a default city, a default state, and a default zip code.
	  */
         private String add2;
         
       
	 public Address (){
		this ("", "", "", 0, "");
	 }
	 /**
	  * Constructs a new address with a street name, a city, a state, and a zip code.
	  * @param street The street of this address
	  * @param city The city of this address
	  * @param state The state of this address
	  * @param zipCode The zip code of this address
	  */
	 public Address (String street, String city, String state, long zipCode, String add2){
	    this.street = street;
	    this.city = city;
	    this.state = state;
	    this.zipCode = zipCode;
            this.add2 = add2;
	 }

	 /**
	  * Changes the street of this address.
	  * @param street A string literal specifying the street of this address
	  */
	 public void setStreet(String street){
		 this.street = street;
	 }

	 /**
	  * Returns the street of this address.
	  * @return A string literal specifying the street of this address
	  */
	 public String getStreet(){
		 return this.street;
	 }


	 /**
	  * Returns the city of this address.
	  * @return A string literal specifying the city of this address
	  */
	public String getCity() {
		return this.city;
	}

	/**
	 * Changes the city of this address.
	 * @param city  A string literal specifying the city of this address
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Returns the state of this address
	 * @return A string literal specifying the state of this address
	 */
	public String getState() {
		return this.state;
	}

	/**
	 * Changes the state of this address.
	 * @param state  A string literal specifying the state of this address
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Returns the zip code of this address.
	 * @return A long number specifying the zip code of this address
	 */
	public long getZipCode() {
		return this.zipCode;
	}

	/**
	 * Changes the zip code of this address.
	 * @param zipCode  A number specifying the zip code of this address
	 */
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
        
        public String getAdd2()
        {
            return this.add2;
        }
        
        public void setAdd2 (String add2)
        {
            this.add2 = add2;
        }

	/**
	  * Returns a string representation of this Address.
	  * @return A string literal specifying this address
	  */
	 public String toString(){
	   return  getClass().getSimpleName() + ":" + this.street + "\n" +  this.city + ", " + this.state + "  " + this.zipCode  + "\n" + this.add2 + " \n ";
	 }

	 /**
	  * Indicates if this address is "equal to" some other object. If some other object is not an address,
	  * return false to indicate not equal to relationship. If some other object is an address, they are equal
	  * objects if their streets, cities, states, and zip codes are equal.
	  * @param obj A reference to some other object
	  * @return A boolean specifying if this address is "equal to" some other object
	  */
	 public boolean equals(Object obj){
		 if(!(obj instanceof Address)){
			 return false;
		 }

		 Address other = (Address)obj;
		 return this.street.equalsIgnoreCase(other.street) && this.city.equalsIgnoreCase(other.city) &&
				 this.state.equalsIgnoreCase(other.state) && this.zipCode == other.zipCode;
	 }
}

