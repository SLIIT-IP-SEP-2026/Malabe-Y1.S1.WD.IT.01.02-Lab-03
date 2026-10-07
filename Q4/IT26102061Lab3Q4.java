import java.util.Scanner;

public class   IT26102061Lab3Q4{
	public static void main(String[] args){
		//Declare the variables
		int number,number1,number2,number3,number4,number5;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a five-digit number :");
		number=input.nextInt();
		
		number1=0;
		number2=0;
		number3=0;
		number4=0;
		number5=0;
		
		number1=number/10000;
		number=number%10000;
		
		number2=number/1000;
		number=number%1000;
		
		number3=number/100;
		number=number%100;
		
		number4=number/10;
		number=number%10;
		
		number5=number;
		
		
		
		System.out.println();
		System.out.print(number1+" ");
		System.out.print(number2+" ");
		System.out.print(number3+" ");
		System.out.print(number4+" ");
		System.out.print(number5);
		
		
				
	}
}