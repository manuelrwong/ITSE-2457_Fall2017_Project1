package Student;

public class Student 
{		
	
	private Name name;
	private Address homeAddress;
	private Address schooladdress;
		
	public Student()
		{
			this.name = new Name();
			this.homeAddress = new Address();			
			this.schooladdress = new Address();
		}
		
	public Student( String first, String middle, String last, String address, String city, String state, long zipcode, String address2, String city2, String state2, long zipcode2  )
		{
			this.name = new Name( first, middle, last );
			this.homeAddress = new Address( address, city, state, zipcode );
			this.schooladdress = new Address( address2, city2, state2, zipcode2 );
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
		
	public Address getAddress2()
		{
			return this.schooladdress;
		}
	
	public void setAddress2( Address address )
		{
			this.schooladdress = address;
		}
	
	public String toString()
		{
			return this.name.toString() + "\n" + homeAddress.toString() + "\n" + schooladdress.toString();
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