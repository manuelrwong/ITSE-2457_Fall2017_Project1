//======================================================================================================
//
// Name : Zaira Lizeth Saldivar Urias.
//
// Date : September 9th, 2017.
//
//======================================================================================================

package student;

import name.Name;
import address.Address;

//======================================================================================================

public class Student {

    //Student's Name
    private Name name;
    //Student's Home Address
    private Address homeAddress;
    //Student's School Address
    private Address schoolAddress;

    //Constructs a new Student with a default Name, default Home Address and a default School Address
    public Student(String first, String middle, String last, String address, String city, String state, long zipcode, String haddress, String hcity, String hstate, long hzipcode) {
        this.name = new Name(first, middle, last);
        this.homeAddress = new Address(address, city, state, zipcode);
        this.schoolAddress = new Address(haddress, hcity, hstate, hzipcode);
    }
    
    
    //Constructs a new Student with a  name, a home Address and a school Address.
    public Student() {
        this.name = new Name();
        this.homeAddress = new Address();
        this.schoolAddress = new Address();
    }


//======================================================================================================

    //Returns the student name.
    public Name getName() {
        return this.name;
    }
    
    //Changes the student name.
    public void setName(Name name) {
        this.name = name;
    }

//======================================================================================================
	
    //Returns the student home address.
    public Address getHomeAddress() {
        return this.homeAddress;
    }

    //Changes the student home address.
    public void setHomeAddress(Address address) {
        this.homeAddress = address;
    }
    
//======================================================================================================
	
    //Returns the student school address.
    public Address getSchoolAddress() {
        return this.schoolAddress;
    }

    //Changes the student school address.
    public void setSchoolAddress(Address address) {
        this.schoolAddress = address;
    }

//======================================================================================================
	
    //Returns the student full information as a string.
    public String toString() {
        return this.name.toString() + "\n" + homeAddress.toString() + "\n" + schoolAddress.toString();
    }

//======================================================================================================
//Indicates if this student is "equal to" some other object. If some other
//object is not a student, return false to indicate "not equal to"
//relationship. If some other object is a student, they are equal if their
//name, home address and school address are equal.

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return this.name.equals(other.name) && this.homeAddress.equals(other.homeAddress)&& this.schoolAddress.equals(other.schoolAddress);
    }
}
