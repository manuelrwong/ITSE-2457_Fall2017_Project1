/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name;

/**
 *
 * @author Carla 
 */
public class Name {

    //Name. 
    private String name;
    //Middle Name.
    private String middle;
    //Last Name.
    private String last;

    /**
     * Constructs a name with a name, a middle name, an a last name.
     *
     * @param The Name
     * @param middle The Middle Name
     * @param last The Last Name
     */
    public Name(String name, String middle, String last) {
        this.name = name;
        this.middle = middle;
        this.last = last;
    }

    //Creates complete Name (Name, Middle Name and Last Name).
    public Name() {
        this("", "", "");
    }

    //Return a String with the Name.
    public String getName() {
        return name;
    }

    //Changes Name.
    public void setName(String name) {
        this.name = name;
    }

    //Return a String Middle Name.
    public String getMiddle() {
        return middle;
    }

    //Changes Middle Name.
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    //Return a String Last Name.
    public String getLast() {
        return last;
    }

    //Changes Last Name.
    public void setLast(String last) {
        this.last = last;
    }

    //Returns a String initials in upper case.
    public String initials() {
        if (this.middle.isEmpty()) {
            return (this.name.substring(0, 1) + this.last.substring(0, 1)).toUpperCase();
        } else {
            return (this.name.substring(0, 1) + this.middle.substring(0, 1)
                    + this.last.substring(0, 1)).toUpperCase();
        }
    }

    //Returns the length of the all name.
    public int length() {
        return this.name.length() + this.middle.length() + this.last.length();
    }

    //Returns a String inicials of the all Name.
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
     * Indicate if is equal to object.
     */
    public boolean equals(Object Obj) {
        if (!(Obj instanceof Name)) {
            return false;
        }
        //Compare one name with other name.
        Name other = (Name) Obj;

        //Compare all name.
        return this.name.equalsIgnoreCase(other.name)
                && this.middle.equalsIgnoreCase(other.middle)
                && this.last.equalsIgnoreCase(other.last);
    }

}