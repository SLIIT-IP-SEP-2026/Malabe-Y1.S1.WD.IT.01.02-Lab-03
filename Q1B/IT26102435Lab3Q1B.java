import java.util.Scanner;
public class IT26102435Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the price of 1kg rice ");
    double kg1prc = input.nextDouble();
    System.out.println("Enter the number of kilograms you want ");
    double kilocount = input.nextDouble();

    double payment = kg1prc*kilocount*0.9;
    System.out.println("Your paying amount is " + payment);
    }
}
