package firstJava;


public class Calcul {
	 int number1;
     int number2;
     int totalNumbers;
     
	
	public void addition() {
		totalNumbers = number1 + number2;
		 System.out.println( "Your result is "+ totalNumbers + ".");
	}
	
	public void substraction() {
		totalNumbers = number1 - number2;
		 System.out.println( "Your result is "+ totalNumbers + ".");
	}
	public void multiplication () {
		totalNumbers = number1 * number2;
		System.out.println( "Your result is "+ totalNumbers + "." );
	}
	public void division () {
		totalNumbers = number1 / number2;
		 System.out.println( "Your result is "+ totalNumbers + ".");
	
	}
	
//	void ask() {
//		   while (true){ 
//		   String comp ="f";
//		   boolean valid = (comp.equals("+") || comp.equals("-") || comp.equals("*") || comp.equals("/"));     
//		   if (valid) System.out.println(comp);     
//		   System.out.println("Invalid answer. Please enter A, B, C, D, or E."); break;	
//		}	
	
}


