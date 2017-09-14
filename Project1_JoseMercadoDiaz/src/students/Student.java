package students;


public class Student 
{

	private Name name;
	private Address homeAddress;
	private Address schoolAddress;
	
	public Student()
	{
		this.name = new Name();
		this.homeAddress = new Address();
		this.schoolAddress = new Address();
	}
	
	public Student( String first, String middle, String last, String address, String city, String state, long zipcode, String saddress, String scity, String sstate, long szipcode )
	{
		this.name = new Name( first, middle, last );
		this.homeAddress = new Address( address, city, state, zipcode );
		this.schoolAddress = new Address ( saddress, scity, sstate, szipcode );
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
	
	public Address getSAddress()
	{
		return this.schoolAddress;
	}
	
	public void setSAddress( Address address )
	{
		this.schoolAddress = address;
	}
	
	public String toString()
	{
		return this.name.toString() + "\n" + homeAddress.toString() + "\n" + schoolAddress.toString();
	}
	
	public boolean equals( Object obj )
	{
		if( !(obj instanceof Student) )
		{
			return false;
		}
		
		Student other = (Student)obj;
		
		return this.name.equals( other.name ) && this.homeAddress.equals( other.homeAddress );
	}
	
}
