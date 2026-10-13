import java.util.Scanner;

public class IT26101493Lab3Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double monthlySalary;
        double otHours;
        double otHourlyRate;
        double otAmount;
        double totalSalary;

        System.out.print("Enter monthly salary: ");
        monthlySalary = input.nextDouble();

        System.out.print("Enter OT hours: ");
        otHours = input.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        otHourlyRate = input.nextDouble();

        otAmount = otHours * otHourlyRate;
        totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount = " + otAmount);
        System.out.println("Total Salary = " + totalSalary);

        input.close();
    }
}