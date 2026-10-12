
import java.util.Scanner;

 public class IT26102000Lab3Q2{
 
 public static void main (String[] args){
 
 double monthlySalary, numberOfOT_Hours, hourlyRate, totalSalary, OT_Amount; 
 
  Scanner input = new Scanner(System.in);
   
   System.out.print("Monthly salary =");
   monthlySalary = input.nextDouble();
   
   System.out.print("Number of OT hours = ");
   numberOfOT_Hours = input.nextDouble();
   
   System.out.print("OT hourly rate = ");
   hourlyRate = input.nextDouble();
   
   OT_Amount = numberOfOT_Hours*hourlyRate;
   totalSalary =  monthlySalary + OT_Amount;
   
   System.out.print(" Total Salary = " + totalSalary);
   
 
 }
 }
 
 