import java.util.Scanner;
public class IT26102480Lab3Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Ente the monthly salary:");
		double monthlySalary= input.nextDouble();

		System.out.print("Enter the number of OT hours:");
		double otHours = input.nextDouble();

		System.out.print("Enter the OT hourly rate :");
		double otHourRate = input.nextDouble();

		double totalSalary= monthlySalary + ( otHours*otHourRate);
		System.out.print("the total salary including OT is:" + totalSalary);







	}

}