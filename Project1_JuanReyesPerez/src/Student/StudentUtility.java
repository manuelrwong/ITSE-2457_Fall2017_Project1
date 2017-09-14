package Student;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class StudentUtility
{
	// uses the methods to create the list of students ad print them
    
	public static void start()
	{   
		ArrayList<Student> student = new ArrayList<Student>();
		createList( student );
		displayList( student );
		
	} 
 
       
        // creates new data file and takes the information field by field
	public static void createList(ArrayList<Student> student)
	{
                // Create new file to storage the information
		File file = new File ( "data.txt" );
		Scanner scan = null;
		try {
			scan = new Scanner( file );
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
                // Takes the information
		while( scan.hasNextLine() )
		{
			String name = scan.nextLine();
			String address = scan.nextLine();
			String city = scan.nextLine();
			String state = scan.nextLine();
			long zipcode =  Long.parseLong( scan.nextLine() );
                        String schoolAddress = scan.nextLine();
			
			String[] nameFields = name.split(" ");
			Student e = new Student( nameFields[0], nameFields[1], nameFields[2], address, city, state, zipcode, schoolAddress );
			student.add(e);
		}
		
	} 
 
	// Shows the list of students
	public static void displayList(ArrayList<Student> student)
	{
		for( int i = 0 ; i < student.size() ; i++ )
		{
			System.out.println( student.get(i) );
		}
	}
} 