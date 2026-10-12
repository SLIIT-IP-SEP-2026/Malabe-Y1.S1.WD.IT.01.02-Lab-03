import java.util.Scanner;

public class IT26102492Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		double percentage = 10;
		double price;
		double weight;
		double total;

        System.out.print("Enter the price of 1kg of rice: ");
        price = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        weight = input.nextDouble();

        total = price*weight*(100-percentage)/100;
        

        System.out.println("The total amount with 10% discount:" +total);

        
    }
}
