import java.util.Scanner;
public class IT26102395Lab3Q2{
	public static void main(String[] args){
		
		Scanner ok= new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:");
		int salary=ok.nextInt();
		
		System.out.print("Enter the number of OT hours:");
		double  no_OT=ok.nextDouble();
		
		System.out.print("Enter the OT hourly rate:");
		double ot_Rate=ok.nextDouble();
		
		double OT_amount=no_OT*ot_Rate;
		double total_Salary=salary+OT_amount;
		
		
		
		
		System.out.println("The total salary including OT is:"+total_Salary);
		
		
		
		
		
	}
}