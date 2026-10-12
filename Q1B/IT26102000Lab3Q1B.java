import java.util.Scanner;

 public class IT26102000Lab3Q1B{
 
 public static void main(String[] args){
 
 double priceOf1kg, quantity, totalPrice, discountRate, discount, finalPrice;
  
   Scanner input = new Scanner(System.in);
   
   System.out.print(" Price of 1kg = ");
    priceOf1kg = input.nextDouble();
   
   System.out.print(" Quantity = ");
    quantity = input.nextDouble();
   
   totalPrice = priceOf1kg*quantity;
   
   discountRate = 10.0/100.0;
   
   discount = totalPrice*discountRate;
   
   finalPrice = totalPrice - discount;
   
   System.out.print("Final Price = " + finalPrice);
   
   
 }
 }