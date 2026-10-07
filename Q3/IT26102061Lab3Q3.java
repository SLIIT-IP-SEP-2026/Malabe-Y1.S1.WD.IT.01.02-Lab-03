import java.util.Scanner;

public class   IT26102061Lab3Q3{
	public static void main(String[] args){
		//Declare the variables
		int amount;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the Rupee amount:");
		amount=input.nextInt();
		
		int notes5000 = 0;
		int notes1000 = 0;
		int notes500 = 0;
		int notes200 = 0;
		int notes100 = 0;
		int notes50 = 0;
		int notes20 = 0;
		int notes10 = 0;
		int notes05 = 0;
		int notes02 = 0;
		int notes01 = 0;
		
		notes5000=amount/5000;
		amount= amount % 5000;
		
		notes1000=amount/1000;
		amount= amount % 1000;
		
		notes500=amount/500;
		amount= amount % 500;
		
		notes200=amount/200;
		amount= amount % 200;
		
		notes100=amount/100;
		amount= amount % 100;
		
		notes50=amount/50;
		amount= amount % 50;
		
		notes20=amount/20;
		amount= amount % 20;
		
		notes10=amount/10;
		amount= amount % 10;
		
		notes05=amount/05;
		amount= amount % 05;
		
		notes02=amount/02;
		amount= amount % 02;
		
		notes01=amount/01;
		amount= amount % 01;
		
		
		
		System.out.println();
		System.out.println("5000 Notes - "+notes5000);
		System.out.println("1000 Notes - "+notes1000);
		System.out.println(" 500 Notes - "+notes500);
		System.out.println(" 200 Notes - "+notes200);
		System.out.println(" 100 Notes - "+notes100);
		System.out.println("  50 Notes - "+notes50);
		System.out.println("  20 Notes - "+notes20);
		System.out.println("  10 Notes - "+notes10);
		System.out.println("  05 Notes - "+notes05);
		System.out.println("  02 Notes - "+notes02);
		System.out.println("  01 Notes - "+notes01);
				
	}
}