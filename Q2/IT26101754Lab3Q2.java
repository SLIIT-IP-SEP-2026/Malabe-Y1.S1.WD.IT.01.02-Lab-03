import java.util.Scanner; 

public class IT26101754Lab3Q2 {

    public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("Enter your monthly salary : ");
       double monthlySalary = input.nextDouble();

       System.out.print("Enter your number of OT hours : ");
       int OThours = input.nextInt();

       System.out.print("Enter the OT hourly rate : ");
       double OTrate = input.nextDouble();

       //calculating the OTamount ...
       double OTamount = OThours * OTrate;

       //calculating the total salary...
       double totalSalary = monthlySalary + OTamount;

       System.out.println("your total salary is : Rs." + totalSalary);

	}
}	