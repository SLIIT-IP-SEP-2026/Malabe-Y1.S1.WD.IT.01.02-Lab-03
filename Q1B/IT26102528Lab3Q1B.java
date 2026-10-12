import java.util.Scanner;

public class IT26102528Lab3Q1B {

    public static void main(String[] args) {

        // Create Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Get the price of 1 kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        // Get the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        // Calculate the total amount before discount
        double totalAmount = price * kilograms;

        // Calculate 10% discount
        double discount = totalAmount * 10 / 100;

        // Calculate the amount after discount
        double finalAmount = totalAmount - discount;

        // Display the final amount
        System.out.println();
        System.out.println("The total amount with 10% discount is: " + finalAmount);

        // Close Scanner
        input.close();
    }
}