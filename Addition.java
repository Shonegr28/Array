import java.util.Scanner; 
public class Addition {
	
	public static void main(String[] args) { 
	
	int firstNumber=0;
	int SecondNumber=0;
	int SumofNumbers=0;
	Scanner input = new Scanner(System.in); 

	System.out.println("Enter a number:");
	firstNumber=input.nextInt();
	
	System.out.println("Enter an another number:");
	SecondNumber=input.nextInt();
	
	
	SumofNumbers= firstNumber+SecondNumber;
	System.out.println( firstNumber+" + " + SecondNumber + " = " + SumofNumbers);
	
	
	
	}
}
