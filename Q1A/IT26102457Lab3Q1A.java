import java.util.Scanner;
public class IT26102457Lab3Q1A
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);

System.out.print("Enter the price of 1kg of rice:");
double price=input.nextDouble();

System.out.print("Enter the number of kilogrames you want to buy:");
double number=input.nextDouble();
double totalamount;
totalamount=price*number;

System.out.println("The total amount is:"+totalamount);
}
}
