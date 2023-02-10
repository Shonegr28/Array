import java.util.Scanner;

/**
 * Author:      CM Punk
 * Date:        xx/xx/xx
 * File:        OddEvenInteger.java
 * Description: Description of the program here
 */


public class OddEvenInteger {
	public static void main(String[] args) {
		
		int userInput =0;
		Scanner input = new Scanner(System.in); 
		do {
	
		
		System.out.println("Enter Even Number: ");
		userInput = input.nextInt();
		} while(userInput % 2== 0) ;
		
		System.out.println("Goodbye!");	
		
	}
}
