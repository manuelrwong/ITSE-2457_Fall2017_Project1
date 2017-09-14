package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentUtility
{

	public static void start()
	{   
		ArrayList<Student> student = new ArrayList<Student>();
		createList(student);
		displayList(student);
		

	} 
 
	
	public static void createList(ArrayList<Student> student)
	{
		File file = new File( "data.txt" );
		Scanner scan = null;
		try {
			scan = new Scanner( file );
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		while( scan.hasNextLine() )
		{
			String name = scan.nextLine();
			String address = scan.nextLine();
			String city = scan.nextLine();
			String state = scan.nextLine();
			long zipcode =  Long.parseLong( scan.nextLine() );
			String address2 = scan.nextLine();
			String city2 = scan.nextLine();
			String state2 = scan.nextLine();
			long zipcode2 =  Long.parseLong( scan.nextLine() );
			
			String[] nameFields = name.split(" ");
			Student s = new Student( nameFields[0], nameFields[1], nameFields[2], address, city, state, zipcode, address2, city2, state2, zipcode2 );
			student.add(s);
		}
		

	} 
 
	
	public static void displayList(ArrayList<Student> student)
	{
		for( int i = 0 ; i < student.size() ; i++ )
		{
			System.out.println( student.get(i) );
		}
	}
} 