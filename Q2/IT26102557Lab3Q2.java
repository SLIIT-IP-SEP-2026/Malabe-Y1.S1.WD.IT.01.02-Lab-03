import java.util.Scanner;
public class IT26102557Lab3Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly salary");
        double salary =input.nextDouble();
        System.out.println("Enter the number of OT hours");
        double othours = input.nextDouble();
        System.out.println("Enter the OT hourly rate");
        double otrate = input.nextDouble();

        double totalsalary;
       
        totalsalary=salary+otrate*othours;
        System.out.println("The total salary is "+totalsalary);
    }
}
