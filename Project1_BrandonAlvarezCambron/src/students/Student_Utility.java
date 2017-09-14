package students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student_Utility
{
	/**    * Creates a list of students, and prints them in order.   */ 
	public static void start()
	{   
		ArrayList<Student> student = new ArrayList<Student>();
		createList(student);
		displayList(student);
		
//		System.out.println( student.get(1).equals( student.get(2) ) );
	} 
 
	/**    * Creates a list of students.   * @param students A reference to a list of students   */
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
                        String add2 = scan.nextLine();
			
			String[] nameFields = name.split(" ");
			Student e = new Student( nameFields[0], nameFields[1], nameFields[2], address, city, state, zipcode ,add2);
			student.add(e);
		}
		
//		Employee e1 = new Employee();
//		employee.add(e1);
//		Employee e2 = new Employee( "John", "A", "Smith", "3535 N Ellison Dr", "San Antonio", "Texas", 78251 );
//		employee.add(e2);
//		Employee e3 = new Employee( "John", "A", "Smith", "3535 N Ellison Dr", "San Antonio", "Texas", 78251 );
//		employee.add(e3);
	} 
 
	/**    * Displays a list of students.   * @param students A reference to a list of students   */
	public static void displayList(ArrayList<Student> student)
	{
		for( int i = 0 ; i < student.size() ; i++ )
		{
			System.out.println( student.get(i) );
		}
	}
} 