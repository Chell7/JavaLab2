package firstJava;
import java.util.Scanner;
//Class declaration with one method that has a parameter.

public class GradeBook {
	private String courseName; // course name for this GradeBook
	private int total; 
	private int gradeCounter; 
	private int aCount;
	private int bCount; 
	private int cCount; 
	private int dCount;
	private int fCount; 
	
	public GradeBook( String name ) 
	{
	courseName = name; 
	} 

	public void setCourseName( String name )
	{
	courseName = name; 
	} 
	
	public String getCourseName()
	{
	return courseName;
	} 
	
  public void displayMessage() {
	  System.out.printf( "Welcome to the gradebook for\n%s!\n", courseName ); getCourseName();
  }
  
  public void inputGrades()
  {
  Scanner input = new Scanner( System.in );
  int grade; // grade entered by user
  System.out.printf( "%s\n%s\n%s\n%s\n",
  "Enter the integer grades in the range 0-100.",
  "Type the end-of-file indicator to terminate input:",
  "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
  "On Windows type <Ctrl> z then press Enter" );
  
  while ( input.hasNext() )
  {
    grade = input.nextInt(); // read grade
    total += grade; // add grade to total
    ++gradeCounter; // increment number of grades
  // call method to increment appropriate counter
    incrementLetterGradeCounter( grade );
  }
  }
  
  private void incrementLetterGradeCounter( int grade )
  {
	  switch ( grade / 10 )
	  {
	  case 9: // grade was between 90
	  case 10: // and 100, inclusive
	  ++aCount; // increment aCount
	  break; // necessary to exit switch
	  case 8: // grade was between 80 and 89
	  ++bCount; // increment bCount
	  break; // exit switch
	  case 7: // grade was between 70 and 79
	  ++cCount; // increment cCount
	  break; // exit switch
	  case 6: // grade was between 60 and 69
	  ++dCount; // increment dCount
	  break; // exit switch
	  default: // grade was less than 60
	  ++fCount; // increment fCount
	  break; // optional; will exit switch anyway
  }
  
  }
  
  public void displayGradeReport()

  {
  System.out.println( "\nGrade Report:" );
      if ( gradeCounter != 0 )

	  {
	  double average = (double) total / gradeCounter;
  
        System.out.printf( "Total of the %d grades entered is %d\n",
	
		  gradeCounter, total );
	
		  System.out.printf( "Class average is %.2f\n", average );
		
		  System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
	
		  "Number of students who received each grade:",
		
		  "A: ", aCount,
		  // display number of A grades
	
		  "B: ", bCount,
		  // display number of B grades
	
		  "C: ", cCount,
		  // display number of C grades
	
		  "D: ", dCount,
		  // display number of D grades
		
		  "F: ", fCount ); // display number of F grades
		
		  } // end if
	
        	else // no grades were entered, so output appropriate message
	
		  System.out.println( "No grades were entered" );
		
		  } // end method displayGradeReport
  
}


