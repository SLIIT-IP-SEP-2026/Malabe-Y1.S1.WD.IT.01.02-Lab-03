import java.util.Scanner;

public class IT26102528Lab3Q4 {

    public static void main(String[] args) {

        // Create Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Get a five-digit number
        System.out.print("Enter a five digit number: ");
        int number = input.nextInt();

        // Extract the first digit
        int digit1 = number / 10000;

        // Remove the first digit
        number = number % 10000;

        // Extract the second digit
        int digit2 = number / 1000;

        // Remove the second digit
        number = number % 1000;

        // Extract the third digit
        int digit3 = number / 100;

        // Remove the third digit
        number = number % 100;

        // Extract the fourth digit
        int digit4 = number / 10;

        // Extract the last digit
        int digit5 = number % 10;

        // Display the digits separated by spaces
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

        // Close Scanner
        input.close();
    }
}