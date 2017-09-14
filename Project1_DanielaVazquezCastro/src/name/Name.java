/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

/**
 *
 * @author Daniela 
 */
public class Name {

    //First Name. 
    private String name;
    //Middle Name.
    private String middle;
    //Last Name.
    private String last;

    /**
     * Constructs a name with a first name, a middle name, an a last name.
     *
     * @param first The First Name
     * @param middle The Middle Name
     * @param last The Last Name
     */
    public Name(String name, String middle, String last) {
        this.name = name;
        this.middle = middle;
        this.last = last;
    }

    //Creates a default Full Name (Name, Middle Name and Last Name).
    public Name() {
        this("", "", "");
    }

    //Return a String with the First Name.
    public String getName() {
        return name;
    }

    //Changes the Name.
    public void setName(String name) {
        this.name = name;
    }

    //Return a String with the Middle Name.
    public String getMiddle() {
        return middle;
    }

    //Changes the Middle Name.
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    //Return a String with the Last Name.
    public String getLast() {
        return last;
    }

    //Changes the Last Name.
    public void setLast(String last) {
        this.last = last;
    }

    //Returns a String with the initials in upper case.
    public String initials() {
        if (this.middle.isEmpty()) {
            return (this.name.substring(0, 1) + this.last.substring(0, 1)).toUpperCase();
        } else {
            return (this.name.substring(0, 1) + this.middle.substring(0, 1)
                    + this.last.substring(0, 1)).toUpperCase();
        }
    }

    //Returns the length of the full name.
    public int length() {
        return this.name.length() + this.middle.length() + this.last.length();
    }

    //Returns a String with the inicials of the Full Name.
    public String toString() {
        if (this.middle.isEmpty()) {
            return getClass().getSimpleName() + ": "
                    + this.last + "," + this.name;
        } else {
            return getClass().getSimpleName() + ": "
                    + this.last + "," + this.name + " " + this.middle.substring(0, 1) + ".";
        }
    }

    /**
     * Indicates if this name is "equal to" some other object. If some other
     * object is not a name, return false to indicate "not equal to"
     * relationship. If some other object is a name, they are equal if their
     * last name, first name, and middle names are equal.
     */
    public boolean equals(Object Obj) {
        if (!(Obj instanceof Name)) {
            return false;
        }
        //Compare this name with other name.
        Name other = (Name) Obj;

        //Compare three parts individually.
        return this.name.equalsIgnoreCase(other.name)
                && this.middle.equalsIgnoreCase(other.middle)
                && this.last.equalsIgnoreCase(other.last);
    }

}