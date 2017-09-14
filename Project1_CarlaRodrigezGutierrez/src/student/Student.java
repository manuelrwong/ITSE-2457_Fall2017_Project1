/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import name.Name;
import address.Address;

/**
 *
 * @author Carla
 */
public class Student {

    //Name.
    private Name name;
    //Home Address.
    private Address homeAddress;
    //School Address.
    private Address schoolAddress;

    
    
    
    /* Constructs a new Student with a  name, a home Address and a school Address.
     * @param name The name of student
     * @param homeAddress The home address of student 
     * @param schoolAddress The school address of student
    
     */
    
    public Student() {
        this.name = new Name();
        this.homeAddress = new Address();
        this.schoolAddress = new Address();
    }

    ////Constructs a new Student with a default Name, default Home Address and a default School Address
    public Student(String first, String middle, String last, String address, String city, String state, long zipcode) {
        this.name = new Name(first, middle, last);
        this.homeAddress = new Address(address, city, state, zipcode);
        this.schoolAddress = new Address(address, city, state, zipcode);
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAddress(Address address) {
        this.homeAddress = address;
    }
    
    public Address getSchoolAddress() {
        return this.schoolAddress;
    }

    public void setSchoolAddress(Address address) {
        this.schoolAddress = address;
    }

    public String toString() {
        return this.name.toString() + "\n" + homeAddress.toString() + "\n" + schoolAddress.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }

        Student other = (Student) obj;

        return this.name.equals(other.name) && this.homeAddress.equals(other.homeAddress)&& this.schoolAddress.equals(other.schoolAddress);
    }
}