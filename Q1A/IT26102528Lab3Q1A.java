import java.util.Scanner;

public class IT26102528Lab3Q1A {

    public static void main(String[] args) {

        // Create Scanner object to get input from the keyboard
        Scanner input = new Scanner(System.in);

        // Get the price of 1 kg of rice
        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        // Get the number of kilograms
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        // Calculate the total amount
        double totalAmount = price * kilograms;

        // Display the total amount
        System.out.println();
        System.out.println("The total amount is: " + totalAmount);

        // Close Scanner
        input.close();
    }
}