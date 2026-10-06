import java.util.Scanner;
public class IT26102395Lab3Q4{
	public static void main(String[] args){
		
		Scanner ok= new Scanner(System.in);
		
		System.out.print("Enter the Rupee amount:");
		int number= ok.nextInt();
		
		int digital1=number/10000;
		number=number%10000;
		
		int digital2=number/1000;
		number=number%1000;
		
		int digital3=number/100;
		number=number%100;
		
		int digital4=number/10;
		number=number%10;
		
		int digital5 = number;
		
		System.out.println();
		System.out.print(digital1 + " ");
		System.out.print(digital2 + " ");
		System.out.print(digital3 + " ");
		System.out.print(digital4 + " ");
		System.out.print(digital5);
		System.out.println();
		
		
		
		
		
	}
}