import java.util.Scanner;

public class IT26102589Lab3Q1A {
    public static void main(String[] args) {
        Scanner RK = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double price = RK.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kg = RK.nextDouble();

        double total = price * kg;

        System.out.println("Total amount to pay: " + total);
    }
}