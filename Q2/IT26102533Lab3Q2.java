import java.util.Scanner;

public class IT26102533Lab3Q2 {
	
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary : ");
		double salaryM = scanner.nextDouble();
		
		System.out.print("Enter the number of OT hours : ");
		double otH = scanner.nextDouble();
		
		
		System.out.print("Enter the OT hourly rate : ");
		double otrate = scanner.nextDouble();
		
		double OTamount = otH * otrate;
		double totsalary = salaryM + OTamount;
		
		
		System.out.println("Total salary including OT : "+totsalary);
		
		

		
	}
	
}
