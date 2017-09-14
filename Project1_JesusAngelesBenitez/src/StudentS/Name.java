package StudentS;

public class Name {
	
	private String first;

	private String middle;

	private String last;

	
	public Name(String first, String middle, String last ){
		this.first = first.trim();
		this.middle = middle.trim();
		this.last = last.trim();
	}

	
	public Name(){
		this("","","");
	}

	
	public String getFirst(){
		return this.first;
	}


	public void setFirst(String first){
		this.first = first;
	}

	
	public String getMiddle(){
		return this.middle;
	}

	
	public void setMiddle(String middle){
		this.middle = middle;
	}

	
	public String getLast(){
		return this.last;
	}

	
	public void setLast(String last){
		this.last = last;
	}

	
	public String initials(){
		if (this.middle.isEmpty()){
			return (this.first.substring(0,1) +   this.last.substring(0,1)).toUpperCase();
		}else{
		   return (this.first.substring(0,1) + this.middle.substring(0,1) +
		           this.last.substring(0,1)).toUpperCase();
		}
	}
	
	public int length(){
		return this.first.length() + this.middle.length() + this.last.length();
	}

	
	public String toString(){
		if (this.middle.isEmpty()){
			return	getClass().getSimpleName() + ": " +
					this.last + ","  +  this.first;
	   }else{
		   return	getClass().getSimpleName() + ": " +
					this.last + ","  +  this.first  +   " " +  this.middle.substring(0,1) + ".";
	   }
	}

	
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
