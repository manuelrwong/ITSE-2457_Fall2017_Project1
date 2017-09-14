package Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentUtility 
{
	
	/* 		method to scan and print the information in the document named "Alumnos" 	 */
	
	public static void start()
		{   
			ArrayList<Student> Student = new ArrayList<Student>();
			createList(Student);
			displayList(Student);
		} 
	
	/*	  create an array where save the student's data
	 * 	  include and try and catch in case of some error happens	 	*/
	
	public static void createList(ArrayList<Student> Student)
		{
			File file = new File("Alumnos.txt");
			Scanner scan = null;
		try {
			scan = new Scanner( file );
			} 
		catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			
		while( scan.hasNextLine() )
			{
				String name = scan.nextLine();
				String address = scan.nextLine();
				String city = scan.nextLine();
				String state = scan.nextLine();
				long zipcode =  Long.parseLong( scan.nextLine());
				String address2 = scan.nextLine();
				String city2 = scan.nextLine();
				String state2 = scan.nextLine();
				long zipcode2 =  Long.parseLong( scan.nextLine());
				
				String[] nameFields = name.split(" ");
				Student e = new Student( nameFields[0], nameFields[1], nameFields[2], address, city, state, zipcode, address2, city2, state2, zipcode2);
				Student.add(e);
			}
			

		} 
	 
	/*		show the arraylist in order  	 */
		public static void displayList(ArrayList<Student> Student)
		{
			for( int i = 0 ; i < Student.size() ; i++ )
			{
				System.out.println( Student.get(i) );
			}
		}
} 

