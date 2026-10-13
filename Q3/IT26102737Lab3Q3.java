import java.util.Scanner;
public class IT26102737Lab3Q3
{
     public static void main(String[] args)
	 {
	       int Notes5000 = 0:
		   int Notes1000 = 0;
		   int Notes500 = 0;
		   int Notes200 = 0;
		   int Notes100 = 0;
		   int Notes50 = 0;
		   int Notes20 = 0;
		   int Notes10 = 0;
		   int Notes5 = 0;
		   int Notes2 = 0;
		   int Notes1 = 0;
		   
		   Scanner  money = new Scanner(System.in);
		   
		   System.out.print("Enter the Amount: ");
		   int amount = money.nextInt();
		   
		   Notes5000 = amount / 5000;
		   amount = amount % 5000;
		   
		   Notes1000 = amount / 1000;
		   amount = amount % 1000;
		   
		   Notes500 = amount / 500;
		   amount = amount % 500;
		   
		   Notes200 = amount / 200;
		   amount = amount % 200;
		   
		   Notes100 = amount / 100;
		   amount = amount % 100;
		   
		   Notes50 = amount / 50;
		   amount = amount % 50;
		   
		   Notes20 = amount / 20;
		   amount = amount % 20;
		   
		   Notes10 = amount / 10;
		   amount = amount % 10;
		   
		   Notes5 = amount / 5;
		   amount = amount % 5;
		   
		   Notes2 = amount / 2;
		   amount = amount % 2;
		   
		   Notes1 = amount / 1;
		   amount = amount % 1;
		   
		   System.out.println("5000 Notes = " + Notes5000);
		   System.out.println("1000 Notes = " + Notes1000);
		   System.out.println("500 Notes = " + Notes500);
		   System.out.println("200 Notes = " + Notes200);
		   System.out.println("100 Notes = " + Notes100);
		   System.out.println("50 Notes = " + Notes50);
		   System.out.println("20 Notes = " + Notes20);
		   System.out.println("10 Notes = " + Notes10);
		   System.out.println("5 Notes = " + Notes5);
		   System.out.println("2 Notes = " + Notes2);
		   System.out.println("1 Notes = " + Notes1);
		   
		}  
}		 













