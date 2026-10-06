import java.util.Scanner;
public class IT26102480Lab3Q4{
	public static void main (String[]args){
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter a five-digit number:");
		int fiveDigits = input.nextInt();
		
		int value1,value2,value3,value4,value5,remind;
		
		
		value1 = fiveDigits/10000;
		remind= fiveDigits % 10000;
		
		value2 = remind/1000;
		remind = remind % 1000;
		
		value3 = remind/100;
		remind = remind % 100;
		
		value4 = remind/10;
		remind = remind % 10;
		
		value5 = remind/1;
		remind = remind % 1;
		
		System.out.print(value1 + " " + value2 + " " +value3 + " " + value4 + " " + value5);
		
		
		
		


}
}
