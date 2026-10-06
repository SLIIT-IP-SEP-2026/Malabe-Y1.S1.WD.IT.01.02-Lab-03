import java.util.Scanner;
public class IT26102395Lab3Q1B{
	public static void main(String[] args){
		
		Scanner ok= new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice:");
		double rice=ok.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy:");
		int no=ok.nextInt();
		
		System.out.println();
		Double dis=0.1;
		
		Double Total= rice*no;
		double dis_prize=Total*dis;
		double final_bill=Total-dis_prize;
		
		System.out.println("The total amount with 10% discount:"+final_bill);
		
		
		
		
		
	}
}