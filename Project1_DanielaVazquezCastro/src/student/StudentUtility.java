/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class StudentUtility {

    /**
     * * Creates a list of students, and prints them in order.
     */
    public static void start() {
        ArrayList<Student> student = new ArrayList<Student>();
        createList(student);
        displayList(student);

    }

    //Creates a list of students.
    public static void createList(ArrayList<Student> student) {
        File file = new File("data.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        while (scan.hasNextLine()) {
            String name = scan.nextLine();
            String address = scan.nextLine();
            String city = scan.nextLine();
            String state = scan.nextLine();
            long zipcode = Long.parseLong(scan.nextLine());

            String[] nameFields = name.split(" ");
            Student s = new Student(nameFields[0], nameFields[1], nameFields[2], address, city, state, zipcode);
            student.add(s);
        }
    }

    //Displays a list of students.   
    public static void displayList(ArrayList<Student> student) {
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }
    }

}