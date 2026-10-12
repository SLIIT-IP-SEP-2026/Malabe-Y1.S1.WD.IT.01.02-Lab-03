import java.util.Scanner;
public class  IT26102425Lab3Q3{
        public static void main(String[]args) {
		
		int amount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter the Rupee amount:");
		amount = input.nextInt();
		
		int num1 = amount / 5000;
		int remainder = amount % 5000;
		
		int num2 = amount / 1000;
	    remainder = amount % 1000;
		
		int num3 = amount / 500;
		remainder = amount % 500;
		
		int num4 = amount / 200;
	    remainder = amount % 200;
		
		int num5 = amount / 100;
	    remainder = amount % 100;
		
		int num6 = amount / 50;
	    remainder = amount % 50;
		
		int num7 = amount / 20;
	    remainder = amount % 20;
		
		int num8 = amount / 10;
	    remainder = amount % 10;
		
		int num9 = amount / 5;
	    remainder = amount % 5;
		
		int num10 = amount / 2;
	    remainder = amount % 2;
		
		int num11 = remainder;
		
		System.out.println("\n5000 Notes - " + num1);
		
		System.out.println("1000 Notes - " + num2);
		
		System.out.println("500 Notes - " + num3);
		
		System.out.println("200 Notes - " + num4);
		
		System.out.println("100 Notes - " + num5);
		
		System.out.println("50 Notes - " + num6);
		
		System.out.println("20 Notes - " + num7);
		
		System.out.println("10 Coins - " + num8);
		
		System.out.println("05 Coins - " + num9);
		
		System.out.println("02 Coins - " + num10);
		
		System.out.println("01 Coins - " + num11);
		
		
	}
	
}