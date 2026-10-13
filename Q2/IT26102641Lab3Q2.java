import java.util.Scanner;

public class IT26102641Lab3Q2 {
	public static void main(String[] args){
		
		
		double monthlysalary, othours, otrate;
		double otamount, totalSalary;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthlysalary: ");
		monthlysalary = input.nextDouble();
		
		System.out.print("Enter the number of OThours: ");
		othours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		otrate = input.nextDouble();
		
		otamount = othours * otrate;
		totalSalary = monthlysalary + otamount;
		
		System.out.println("");
		System.out.println("The total salary including OT is: "+ totalSalary);
	}
}
		
		