package student;

public class Address{
	
	 private String street;
	
	 private String city;
	
	 private String state;

	 private long zipCode;

	
	 public Address (){
		this("", "", "", 0);
	 }
	
	
	 public Address (String street, String city, String state, long zipCode){
	    this.street = street;
	    this.city = city;
	    this.state = state;
	    this.zipCode = zipCode;
	 }
	 public void setStreet(String street){
		 this.street = street;
	 }

	 
	 public String getStreet(){
		 return this.street;
	 }


	
	public String getCity() {
		return this.city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return this.state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public long getZipCode() {
		return this.zipCode;
	}


	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}


	 public String toString(){
	   return  getClass().getSimpleName() + ":" + this.street + "\n" +  this.city + ", " + this.state + "  " + this.zipCode;
	 }

	
	 public boolean equals(Object obj){
		 if(!(obj instanceof Address)){
			 return false;
		 }

		 Address other = (Address)obj;
		 return this.street.equalsIgnoreCase(other.street) && this.city.equalsIgnoreCase(other.city) &&
				 this.state.equalsIgnoreCase(other.state) && this.zipCode == other.zipCode;
	 }
}

