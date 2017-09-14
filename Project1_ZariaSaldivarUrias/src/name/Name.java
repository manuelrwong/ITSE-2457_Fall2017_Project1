//======================================================================================================
//
// Name : Zaira Lizeth Saldivar Urias.
//
// Date : September 9th, 2017.
//
//======================================================================================================

package name;

//======================================================================================================

public class Name {

    //Contains the firts name.
    private String name;
    //Contains the middle name.
    private String middle;
    //Contains the lastname.
    private String last;

    // Creates a default Full Name (Name, Middle Name and Last Name).
    public Name() {
        this( "", "", "" );
    }

    //Constructs a name with a first name, middle name and last name.
     
    public Name( String name, String middle, String last ) {
        this.name = name;
        this.middle = middle;
        this.last = last;
    }

//======================================================================================================

    //Return the first name.
    public String getName() {
        return name;
    }

    //Changes the firts name.
    public void setName( String name ) {
        this.name = name;
    }

//======================================================================================================

    //Return the middle name.
    public String getMiddle() {
        return middle;
    }

    //Changes the middle name
    public void setMiddle( String middle ) {
        this.middle = middle;
    }

//======================================================================================================

    //Return a String with the Last Name
    public String getLast() {
        return last;
    }

    //Changes the Last Name
    public void setLast( String last) {
        this.last = last;
    }

//======================================================================================================

    //Returns a String with the initials in upper case
    public String initials() {
        if (this.middle.isEmpty()) {
            return ( this.name.substring(0, 1) + this.last.substring(0, 1)).toUpperCase();
        } else {
            return ( this.name.substring(0, 1) + this.middle.substring(0, 1)
                    + this.last.substring(0, 1)).toUpperCase();
        }
    }

//======================================================================================================

    //Returns the full name as a string.
    public int length() {
        return this.name.length() + this.middle.length() + this.last.length();
    }

    //Returns the order of the name. It depends of the middle name.
    public String toString() {
        if (this.middle.isEmpty()) {
            return getClass().getSimpleName() + ": "
                    + this.last + "," + this.name;
        } else {
            return getClass().getSimpleName() + ": "
                    + this.last + "," + this.name + " " + this.middle.substring(0, 1) + ".";
        }
    }


//======================================================================================================
//Indicates if this name is "equal to" some other object. If some other
//object is not a name, return false to indicate "not equal to"
//relationship. If some other object is a name, they are equal if their
//last name, first name, and middle names are equal.
 
    public boolean equals(Object Obj) {
        if (!(Obj instanceof Name)) {
            return false;
        }
        //compare this name with other name
        Name other = (Name) Obj;

        //compare three parts individually
        return this.name.equalsIgnoreCase(other.name)
                && this.middle.equalsIgnoreCase(other.middle)
                && this.last.equalsIgnoreCase(other.last);
    }

}
