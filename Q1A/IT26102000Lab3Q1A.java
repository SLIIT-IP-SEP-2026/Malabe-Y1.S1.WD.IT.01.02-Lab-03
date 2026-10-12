import java.util.Scanner;

public class IT26102000Lab3Q1A {

 public static void main(String[] args){
  
  double priceOf1kg, quantity, totalPrice;
  
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Price of 1kg = ");
    priceOf1kg = input.nextDouble();
   
   System.out.print(" Quantity = ");
    quantity = input.nextDouble();
   
   totalPrice = priceOf1kg*quantity;
   
   System.out.print("Toatal price = " +totalPrice);
 
 } 
 }
 
 