import java.util.Scanner;

public class IT26102687Lab3Q2{
   
   public static void main(String[]args){
	   Scanner input=new Scanner(System.in);
	   
	   System.out.print("Enter the monthly salary:");
	   int monthlySalary = input.nextInt();
	   
	   System.out.print("Enter the number of OT hours:");
	   int otHours = input.nextInt();
	   
	   System.out.print("Enter the OT hourly rate: ");
	   int otHourlyRate = input.nextInt();
	   
	   int otAmount = otHours * otHourlyRate;
	   
	   int totalsalary = monthlySalary + otAmount;
	   
	   System.out.println();
	   System.out.println("The total salary including OT is :" + totalsalary);
	   
	   
	   
	   
   }



}