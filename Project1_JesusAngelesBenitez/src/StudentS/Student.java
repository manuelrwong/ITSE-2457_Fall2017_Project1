package StudentS;

public class Student {
	private Name name;
	private Address homeAddress;
	private Address SCHAddress;
	public Student()
	{
		this.name = new Name();
		this.homeAddress = new Address();
		this.SCHAddress= new Address();
	}
	
	public Student( String first, String middle, String last, String address, String city, String state, long zipcode, String SCHaddress, String SCHcity, String SCHstate, long SCHzipcode  )
	{
		this.name = new Name( first, middle, last );
		this.homeAddress = new Address( address, city, state, zipcode );
		this.SCHAddress = new Address( SCHaddress, SCHcity,  SCHstate,  SCHzipcode );
	}
	
	public Name getName()
	{
		return this.name;
	}
	
	public void setName( Name name )
	{
		this.name = name;
	}
	
	public Address getAddress()
	{
		return this.homeAddress;
	}
	
	public void setAddress( Address address )
	{
		this.homeAddress = address;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	//here is where the information about the school address is declared
	
	public Address getSCHAddress()
	{
		return this.SCHAddress;
	}
	public void setSCHAddress( Address address)
	{
		this.SCHAddress= address;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////7
	
	public String toString()
	{
		return this.name.toString() + "\n" + homeAddress.toString() + "\n" + SCHAddress.toString() ;
	}
	
	public boolean equals( Object obj )
	{
		if( !(obj instanceof Student) )
		{
			return false;
		}
		
		Student other = (Student)obj;
		
		return this.name.equals( other.name ) && this.homeAddress.equals( other.homeAddress );
	//----------------------------------------------------------------------------------------------------------------------------------------------//

}
}
