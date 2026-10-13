import java.util.Scanner;
public class IT26102737Lab3Q2
{
    public static void main(String[] args)
	{
	       Scanner salary = new Scanner(System.in);
	    
		   System.out.print("Enter the monthly salary: ");
		   double MonthlySalary = salary.nextDouble();
			   
		   System.out.print("Enter the number of OT hours:");
		   double OtHours = salary.nextDouble();
			   
		   System.out.print("Enter the OT hourly rate: ");
		   double  OtRate = salary.nextDouble();
			   
		   double OtAmount = OtHours * OtRate;
		   double TotalSalary = MonthlySalary + OtAmount;
			   
		   System.out.println("The total salary with the OT is: " + TotalSalary);
		   
	}
}	