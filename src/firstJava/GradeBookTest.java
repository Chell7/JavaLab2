package firstJava;
//Create GradeBook object and pass a String to
//its displayMessage method.
import java.util.Scanner; // program uses Scanner

public class GradeBookTest {
	static String theName;

	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming");
		
		myGradeBook.displayMessage(); // display welcome message
		myGradeBook.inputGrades(); // read grades from user
		myGradeBook.displayGradeReport(); // display report based on grades
	
//		// create GradeBook object
//		GradeBook gradeBook1 = new GradeBook(
//		"CS101 Introduction to Java Programming" );
//		GradeBook gradeBook2 = new GradeBook(
//		"CS102 Data Structures in Java" );
		
		// display initial value of courseName
//		System.out.printf( "Initial course name is: %s\n\n",
//		myGradeBook1.getCourseName() );
		
//		// prompt for and input course name
//		System.out.println( "Please enter the courses names: \n" );
//		String nameOfCourse = input.nextLine(); // read a line of text
//		String nameCourse = input.nextLine(); // read a line of text
//		myGradeBook1.setCourseName(nameOfCourse); // set the course name
//		myGradeBook.setCourseName(nameCourse); // set the course name
//		System.out.println(); // outputs a blank line
//		
//		// call myGradeBook's displayMessage method
//		myGradeBook1.displayMessage();
//		myGradeBook.displayMessage();
////		myGradeBook.displayMessage();

	}// end main

}// end class GradeBookTest
