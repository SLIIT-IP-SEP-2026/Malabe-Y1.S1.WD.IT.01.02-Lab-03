import java.util.Scanner;
public class IT26102737Lab3Q4
{
     public staic void main(String[] args)
	 {
	       int number , Digit1,Digit2,Digit3,Digit4,Digit5;
		   
		   Scanner digits = new Scanner(System.in);
		   
		   System.out.print("Enter a five_digit number: ");
		   number = digits.nextInt();
		   
		   Digit1= number / 10000;
		   number = number % 10000;
		   
		   Digit2= number / 1000;
		   number = number % 1000;
		   
		   Digit3= number / 100;
		   number = number % 100;
		   
		   Digit4= number / 10;
		   number = number % 10;
		   
		   Digit5= number / 1;
		   number = number % 1;
		   
		   System.out.println();
		   System.out.print(digits1 + "");
		   System.out.print(digits2 + "");
		   System.out.print(digits3 + "");
		   System.out.print(digits4 + "");
		   System.out.print(digits5 + "");
		   System.out.println();
	}
]	