package Student;

/**
 * Represents a name with first name, middle name and last name.
 *
 * @author Qi Wang
 * @version 1.1
 *
 */

public class Name {
	/**
	 *  The first name of this name
	 */
	private String first;
    /**
     * The middle name of this name
     */
	private String middle;
	/**
	 * The last name of this name
	 */
	private String last;
		/**
	 * Constructs a name with a first name, a middle name, an a last name.
	 *
	 * @param first The first name of this name
	 * @param middle The middle name of this name
	 * @param last The last name of of this name
	 */
	public Name(String first, String middle, String last ){
		this.first = first.trim();
		this.middle = middle.trim();
		this.last = last.trim();
	}
		/**
	 * Constructs a name with a default first name, a default middle name, and a default last name.
	 */
	public Name(){
		this("","","");
	}
	/**
	 * Returns the first name of this name.
	 *
	 * @return A String literal specifying the first name of this name
	 */
	public String getFirst(){
		return this.first;
	}
	/**
	 * Changes the first name of this name.
	 *
	 * @param first The first name of this name
	 */
	public void setFirst(String first){
		this.first = first;
	}
	/**
	 * Returns the middle name of the name.
	 * @return A String literal specifying the middle name of the name
	 */
	public String getMiddle(){
		return this.middle;
	}
	/**
	 * Changes the middle name of this name.
	 *
	 * @param middle The middle name of this name
	 */
	public void setMiddle(String middle){
		this.middle = middle;
	}
	/**
	 * Returns the last name of this name.
	 *
	 * @return A String literal specifying the last name of the name
	 */
	public String getLast(){
		return this.last;
	}
		/**
	 * Changes the last name of this name.
	 *
	 * @param last The last name of this name
	 */
	public void setLast(String last){
		this.last = last;
	}
		/**
	 * Returns the initials in upper case.
	 *
	 * @return A string literal specifying the initials in upper case
	 */
	public String initials(){
		if (this.middle.isEmpty()){
			return (this.first.substring(0,1) +   this.last.substring(0,1)).toUpperCase();
		}else{
		   return (this.first.substring(0,1) + this.middle.substring(0,1) +
		           this.last.substring(0,1)).toUpperCase();
		}
	}
	/**
	 * Returns the length of the full name.
	 *
	 * @return A integer specifying the length of this name
	 */
	public int length(){
		return this.first.length() + this.middle.length() + this.last.length();
	}
		/**
	 * Returns a String representation of this name.
	 *
	 * @return A String with a name's last name, first name, and middle name initial
	 */
	public String toString(){
		if (this.middle.isEmpty()){
			return	getClass().getSimpleName() + ": " +
					this.last + ","  +  this.first;
	   }else{
		   return	getClass().getSimpleName() + ": " +
					this.last + ","  +  this.first  +   " " +  this.middle.substring(0,1) + ".";
	   }
	}
		/**
	 * Indicates if this name is "equal to" some other object. If some other object is not a name, return false
	 * to indicate "not equal to" relationship. If some other object is a name, they are equal if their last name,
	 * first name, and middle names are equal.
	 *
	 * @param Obj A reference to some other object
	 * @return A boolean value specifying if this name is "equal to" some other object
	 */
	public boolean equals(Object Obj){
		if (!(Obj instanceof Name)){
			return false;
		}
		//compare this name with other name
		Name other = (Name)Obj;
			//compare three parts individually
		return this.first.equalsIgnoreCase(other.first) &&
		       this.middle.equalsIgnoreCase(other.middle) &&
		       this.last.equalsIgnoreCase(other.last);
    }

	}
