 import java.util.Scanner;

public class IT26102597Lab3Q2{
   public static void main (String [] args) {
   
   
   //create scanner object
   Scanner sc  = new Scanner(System.in);
   
   System.out.println("Enter the Monthly Salary");
   double monthlySalary = sc.nextDouble();
   
   System.out.println("Enter the number of OT hours");
   double otHours = sc.nextDouble();
   
   System.out.println("Enter the OT hourly rate");
   double otHourltyRate = sc.nextDouble();
   
   //Calculate OTamount
   double otAmount = (otHours * otHourltyRate);
   
   //Calculate TotalSalary
   double totalSalary = (monthlySalary + otAmount);
   
   // Display the total Salary
   System.out.println( "The total salary including OT is:" + totalSalary);
	  
    }
}	  
   
   
   