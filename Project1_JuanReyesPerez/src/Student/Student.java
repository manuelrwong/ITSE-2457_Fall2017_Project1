package Student;

public class Student {
	
        // Creation of the getters, setters and variables
    
	private Name name;
	private Address homeAddress;
	
	// Constructor of the class student with no parameters
        public Student()
	{
		this.name = new Name();
		this.homeAddress = new Address();
	}
	// Contructor of the class with parameters
	public Student( String first, String middle, String last, String address, String city, String state, long zipcode, String schoolAddress )
	{
		this.name = new Name( first, middle, last );
		this.homeAddress = new Address( address, city, state, zipcode, schoolAddress );
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
	
	public String toString()
	{
		return this.name.toString() + "\n" + homeAddress.toString();
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