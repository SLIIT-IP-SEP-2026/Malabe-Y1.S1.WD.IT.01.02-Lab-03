import java.util.Scanner;

public class IT26102421Lab3Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of 1kg: ");
        double price = sc.nextDouble();

        System.out.print("Enter the number of kg: ");
        double number_of_kg = sc.nextDouble();

        double amount = price * number_of_kg;

        System.out.print("The total amount is: " + amount);
    }
}