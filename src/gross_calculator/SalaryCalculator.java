package gross_calculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){

        double salary = 1000.00;
        int bonus = 100;
        int quota = 10;

        System.out.println("Enter the no of sales: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota){
            salary = salary + bonus;
        }

        System.out.println("Your salary is " + salary + "$");
    }
}
