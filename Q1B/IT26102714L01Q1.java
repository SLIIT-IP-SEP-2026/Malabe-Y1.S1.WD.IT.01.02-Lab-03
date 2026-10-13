import java.util.Scanner;

public class IT26102714L01Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kg = input.nextDouble();

        double total = price * kg;
        double discount = total * 0.10;
        double amountToPay = total - discount;

        System.out.println();
        System.out.println("The total amount with 10% discount is: " + amountToPay);

        input.close();
    }
}