import java.util.Scanner;
public class IT26102462LAB3Q2
 {
     public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter the monthly salary:");
		 double monthlysalary = input.nextDouble();
		 
		 System.out.print("Enter the number of OT hours:");
		 double Othours = input.nextDouble();
		 
		 System.out.print("Enter the OT hourly rate:");
		 double hourlyratate = input.nextDouble();
		 
		 double OtAmount = Othours*hourlyratate;
		 double totalAmount = monthlysalary + OtAmount;
		 
		 System.out.println();
		 System.out.println("the total salary ingloding Ot is: "+totalAmount);
		 
		 
       }
 
 }