import java.util.Scanner;
public class IT26102477Lab3Q2 {
   public static void main (String[] args)
    {   
	
	double otAmount, totalSalary; 
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter OT hours: ");
	double otHours = input.nextDouble();
	  
	System.out.println("Enter OT hourly rate: ");
	double otHourlyRate = input.nextDouble();  
	
	otAmount = otHours * otHourlyRate;
	
	System.out.println("Enter Monthly Salary : ");
	double monthlySalary  = input.nextDouble();  
	
	totalSalary = monthlySalary + otAmount;
	
	System.out.println("Total Salary : " + totalSalary );

	}
}	