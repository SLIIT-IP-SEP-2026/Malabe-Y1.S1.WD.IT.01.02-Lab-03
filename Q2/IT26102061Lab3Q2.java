import java.util.Scanner;

public class  IT26102061Lab3Q2{
	public static void main(String[] args){
		//Declare the variables
		double salary,ot_hours,ot_rate,total_salary;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:");
		salary=input.nextDouble();
		
		System.out.print("Enter the number of OT hours:");
		ot_hours=input.nextDouble();
		
		System.out.print("Enter the OT hourly rate:");
		ot_rate=input.nextDouble();
		
		total_salary=salary+(ot_hours*ot_rate);
		
		System.out.println("\nThe total salary including OT is:"+total_salary);
	}
}