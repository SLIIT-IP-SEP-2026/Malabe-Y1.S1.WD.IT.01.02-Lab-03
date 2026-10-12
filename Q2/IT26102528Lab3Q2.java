import java.util.Scanner;

public class IT26102528Lab3Q2 {

    public static void main(String[] args) {

        // Create Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Get the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();

        // Get the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = input.nextDouble();

        // Get the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otRate = input.nextDouble();

        // Calculate the OT amount
        double otAmount = otHours * otRate;

        // Calculate the total salary
        double totalSalary = monthlySalary + otAmount;

        // Display the total salary
        System.out.println();
        System.out.println("The total salary including OT is: " + totalSalary);

        // Close Scanner
        input.close();
    }
}