import java.util.Scanner;

public class IT26102589Lab3Q2 {
    public static void main(String[] args) {
        Scanner OT = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double salary = OT.nextDouble();

        System.out.print("Enter number of OT hours: ");
        double otHours = OT.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        double otRate = OT.nextDouble();

        double otAmount = otHours * otRate;
        double totalSalary = salary + otAmount;

        System.out.println("OT amount: " + otAmount);
        System.out.println("Total salary: " + totalSalary);
    }
}