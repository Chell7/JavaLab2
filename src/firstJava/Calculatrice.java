package firstJava;
import java.util.Scanner;  // Program uses class Scanner
// Creation of a calculator
// Object oriented

public class Calculatrice {																													
	public static void main(String[] args) {
		Calcul cal1= new Calcul();
		Scanner input= new Scanner(System.in);
	    System.out.println("What do you want to do with these numbers? Type + for addition, - for substraction, * for multiplication, / for division");
		String comp;
		comp = input.nextLine();
		
		
		while (true) {
		if (!(comp=="+") ||(comp=="-")||(comp=="*")||(comp=="/")) 
			 System.out.println("Invalid answer. Please enter +, -, *, /"); break;
		}
	
		
//		if (comp!=("+")&comp!=("-")&comp!=("*")&comp!=("/"))
//			 System.out.println("Invalid answer. Please enter +, -, *, /");
		
//		
////		while (true) {
//			if (comp!=("+")||comp!=("-")||comp!=("*")||comp!=("/"))
//			 System.out.println("Invalid answer. Please enter +, -, *, /");
//		break;
//		};
//                
//			
		System.out.println("Enter the first integer:");
		cal1.number1 = input.nextInt(); 
		
	
		 System.out.println("Enter the second integer:");
		 cal1.number2 = input.nextInt(); 
		 
		
		switch (comp) {
		case "+":
		cal1.addition();
		break;
					
		case "-":
		cal1.substraction();
		break;
						
		case "*":
		cal1.multiplication();
		break;
					
		case "/":
		cal1.division();
		break;
			
	}		
}
}
			


