import java.util.Scanner;	//To import Scanner
import javax.swing.JOptionPane;		//To import a utility window
import java.util.Random;	//To import the random class

public class Part1 {
	public static void main(String[] args) {
		

		
		{
		//**********************************PRINT STATEMENTS***********************************//
		/*
		 * For multiple line comment
		 * XD
		 */
		//-------------------------------------------------------------------------------------//
		System.out.print("Morning");		//Prints and keeps the cursor in the same line
		System.out.println("Afternoon");	//Prints and moves the cursor to the next line
		//-------------------------------------------------------------------------------------//		
		// print("\n")		To next line																
		// print("\" \"")	To quotes																	
		// print("\t")		To tab
		//print("\\ \\") 	To backslash
		//-------------------------------------------------------------------------------------//
		}
	






		{//************************************VARIABLES***************************************//
		//boolean		true or false			boolean c = true;
		//byte			1 byte					
		//short			2 bytes					
		//int			4 bytes					
		//long			8 bytes							use L at the end of the number
		
		//float			4 bytes with decimals			use F at the end of the number
		//double		8 bytes with decimals
			
		//char			single characters
		//String		sequence of characters
		//-------------------------------------------------------------------------------------//
		int x;			//Declaration without values (variable cannot be used unless is assigned a value)
		int y = 123;	//Declaration and assignation of value
		y = 12;			//Can then be modified without stating its data type
		
		double q;
		boolean w = true;
		char i = 'C';
		String name = " Holaaaa ";
		}
		





		{//************************************VARIABLE SWAP***************************************//
		String name1 = "Matias";
		String name2= "Tom";
		String temp;
		
		temp = name1;
		name1 = name2;
		name2 = temp;
		
		//Same applies to any data type
		}






		
		{//************************************SCANNER**********************************************//
		Scanner input = new Scanner(System.in);	//Declaration of scanner object
		String storage;
		int number;
		double number1;
		
		System.out.println("Say something");
		storage = input.nextLine();				//receives all next input as String
		System.out.println("Put a number");
		number = input.nextInt();				//receives the next integer
		input.nextLine();//<<<<<<<<<< fix used after nextInts 
		System.out.println("Give a double");
		number1 = input.nextDouble();			//receives the next double
		}
		




		{/************************************OPERATORS***************************************/ int x =0;
		//Operators + - * / %
		
		x++; x--;		//Shortcut to add or subtract one 
		x +=1; x*=2;	//Shortcut to operate
		}





		
		{/************************************JOptionPane**********************************************/
			
		
		String name = JOptionPane.showInputDialog("Enter your name");	//To show an input message and store it on a String variable (It always stores it as a string)
		JOptionPane.showMessageDialog(null, "Hello "+name);				//To show a message 
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));	//Same as the last one but it converts from text to integer
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");			//To show a message
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));	//Same as the last one but converting to double
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");						//Shows a message
			
		}
		
		



		{/************************************MATH METHODS**********************************************/
		double x = 12;
		double c= 11;
		
		Math.max(x,c);		//Looks for the value with the highest value
		Math.min(x, c);		//Looks for the value of lower value
		Math.sqrt(x);		//Square roots
		Math.abs(c);		//Absolute value
		Math.round(c);		//Rounds value
		Math.ceil(c); 		//Rounds up
		Math.floor(c);		//Rounds down
		}
		
		



		{/************************************RANDOM VALUES**********************************************/
		Random random = new Random();			//To create a random object
		
		int x = random.nextInt(6)+1;			//To generate a random integer from 1 to 6 (Without the +1 it would be from 0 to 5)
		double y = random.nextDouble();			//Generate a random double
		boolean q = random.nextBoolean();		//Generate a random boolean
		}
		
		
		
		
		
		
		{/************************************If statements**********************************************/
			int age = 75;
			
			if(age==75) {
				System.out.println("Ok Boomer!");			
			}
			else if(age>=18) {
				System.out.println("You are an adult!");
			}
			else {
				System.out.println("You are not an adult!");
			}
			
			// (==, <, >, <=, >=, or !=)	  Operators to compare values in if else statements  ( && , || , !) can be used between comparisons to use as AND , OR , NOT
			boolean x = (5 > 2);			//You van use thin in comparisons
		}
		
		
		
		
		
		
		{/************************************SWITCH**********************************************/
			String day = "Friday";
			
			switch(day) {
				case "Sunday": 
					System.out.println("It is Sunday!");
				break;
				case "Monday": 
					System.out.println("It is Monday!");
				break;
				case "Tuesday": 
					System.out.println("It is Tuesday!");
				break;
				case "Wednesday": 
					System.out.println("It is Wednesday!");
				break;
				case "Thursday":
				case "Friday":
				case "Saturday": 
					System.out.println("It is Saturday!");				//You can stack them if there are several cases in which you want a certain outcome.
				break;													//Always use a break statement after you finish with a case
				
				default: 
					System.out.println("That is not a day!"); 			//If nothing is true it executes this statement
			}
		}

}
}
