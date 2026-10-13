import java.util.Scanner;

public class IT26102641Lab{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Rupee Amount: ");
		int amount = input.nextInt();
		
		int remaining = amount;
		
		int n5000 = remaining / 5000;
		remaining = remaining % 5000;
		
		int n1000 = remaining / 1000;
		remaining = remaining % 1000;
		
		int n500 = remaining / 500;
		remaining = remaining % 500;
		
		int n200 = remaining / 200;
		remaining = remaining % 200;
		
		int n100 = remaining / 100;
		remaining = remaining % 100;
		
		int n50 = remaining / 50;
		remaining = remaining % 50;
		
		int n20 = remaining / 20;
		remaining = remaining % 20;
		
		int n10 = remaining / 10;
		remaining = remaining % 10;
		
		int n5 = remaining / 5;
		remaining = remaining % 5;
		
		int n2 = remaining / 2;
		remaining = remaining % 2;
		
		int n1 = remaining;
		
		System.out.println("");
		System.out.println("5000 notes - " + n5000);
		System.out.println("1000 notes - " + n1000);
		System.out.println("500 notes - " + n500);
		System.out.println("200 notes - " + n200);
		System.out.println("100 notes - " + n100);
		System.out.println("50 notes - " + n50);
		System.out.println("20 notes - " + n20);
		System.out.println("10 notes - " + n10);
		System.out.println("5 notes - " + n5);
		System.out.println("2 notes - " + n2);
		System.out.println("1 notes - " + n1);
	}
}