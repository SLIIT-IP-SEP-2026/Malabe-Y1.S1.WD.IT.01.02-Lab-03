import java.util.Scanner;

public class IT26102528Lab3Q3 {

    public static void main(String[] args) {

        // Create Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Get the rupee amount
        System.out.print("Enter the Rupee amount: ");
        int amount = input.nextInt();

        // Find the number of 5000 notes
        int notes5000 = amount / 5000;
        amount = amount % 5000;

        // Find the number of 1000 notes
        int notes1000 = amount / 1000;
        amount = amount % 1000;

        // Find the number of 500 notes
        int notes500 = amount / 500;
        amount = amount % 500;

        // Find the number of 200 notes
        int notes200 = amount / 200;
        amount = amount % 200;

        // Find the number of 100 notes
        int notes100 = amount / 100;
        amount = amount % 100;

        // Find the number of 50 notes
        int notes50 = amount / 50;
        amount = amount % 50;

        // Find the number of 20 notes
        int notes20 = amount / 20;
        amount = amount % 20;

        // Find the number of 10 notes
        int notes10 = amount / 10;
        amount = amount % 10;

        // Find the number of 5 coins
        int coins5 = amount / 5;
        amount = amount % 5;

        // Find the number of 2 coins
        int coins2 = amount / 2;
        amount = amount % 2;

        // Find the number of 1 coins
        int coins1 = amount / 1;

        // Display the result
        System.out.println();
        System.out.println("5000 Notes - " + notes5000);
        System.out.println("1000 Notes - " + notes1000);
        System.out.println("500 Notes - " + notes500);
        System.out.println("200 Notes - " + notes200);
        System.out.println("100 Notes - " + notes100);
        System.out.println("50 Notes - " + notes50);
        System.out.println("20 Notes - " + notes20);
        System.out.println("10 Notes - " + notes10);
        System.out.println("05 Coins - " + coins5);
        System.out.println("02 Coins - " + coins2);
        System.out.println("01 Coins - " + coins1);

        // Close Scanner
        input.close();
    }
}