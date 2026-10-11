import java.util.Scanner;

public class IT26102589Lab3Q1B {
    public static void main(String[] args) {
        Scanner DP = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double price = DP.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kg = DP.nextDouble();

        double total = price * kg;
        double discount = total * 10 / 100;
        double finalAmount = total - discount;

        System.out.println("Total bill: " + total);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Amount to pay after discount: " + finalAmount);
    }
}