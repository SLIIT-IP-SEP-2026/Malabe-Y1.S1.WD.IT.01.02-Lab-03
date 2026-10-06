import java.util.Scanner;
public class IT26102557Lab3Q4{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
			System.out.println("Enter the 5 digit number ");
			int Digit =input.nextInt();
			
			int a=Digit/10000;
			Digit=Digit%10000;
			System.out.print(a+" ");
			
			int b=Digit/1000;
			Digit=Digit%1000;
			System.out.print(b+" ");
			
			int c=Digit/100;
			Digit=Digit%100;
			System.out.print(c+" ");
			
			int d=Digit/10;
			Digit=Digit%10;
			System.out.print(d+" ");
			
			int e=Digit/1;
			Digit=Digit%1;
			System.out.print(e+" ");
	}
}