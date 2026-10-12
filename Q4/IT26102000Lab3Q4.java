import java.util.Scanner;

 public class IT26102000Lab3Q4{

 public static void main (String[] args){
 
 int number = 0;
 
 int count10000 = 0;
 int count1000 = 0;
 int count100 = 0;
 int count10 = 0;
 int count1 = 0;
 
 Scanner input = new Scanner(System.in);
 
   System.out.print("Number = ");
   number = input.nextInt();
   
   count10000 = number/10000;
   number = number%10000;
   System.out.print(count10000);
   
   count1000 = number/1000;
   number = number%1000;
   System.out.print(" "+count1000);
   
   count100 = number/100;
   number = number%100;
   System.out.print(" "+count100);
   
   count10 = number/10;
   number = number%10;
   System.out.print(" "+count10);
   
   count1 = number;
   System.out.print(" "+count1);
   
   
   }
}