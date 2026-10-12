import java.util.Scanner;

public class IT26102686Lab3Q2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double monthlySalary;
		int OThours;
		double OThourlyrate;
		double totalSalary;
		double OTamount;
		
		System.out.print("Enter the monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours:	");
		OThours = input.nextInt();
	
		System.out.print("Enter the OT hourly rate: ");
		OThourlyrate = input.nextDouble();
		
		OTamount = OThours * OThourlyrate;
		
		totalSalary = monthlySalary + OTamount;
		
		System.out.println("Total salary including OT is : "+ totalSalary);
	}
}	