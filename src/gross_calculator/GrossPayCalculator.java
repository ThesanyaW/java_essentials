package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){

        //Get worked hours
        int hours=0;
        System.out.println("Enter the no of worked hours:");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //Get pay rate
        double payRate=0.00;
        System.out.println("Enter the hourly rate:");
        payRate = scanner.nextDouble();

        scanner.close();

        //Multiply hours by pay rate
        double grossPay=hours*payRate;

        //Display results
        System.out.println("Gross pay: "+grossPay+"$");
    }
}
