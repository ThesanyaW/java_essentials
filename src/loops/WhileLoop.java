package loops;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args){

        int weekendHours;
        int maxHours = 40;
        int payRate = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the worked hours:");
        weekendHours = scanner.nextInt();

        while (weekendHours > maxHours){
            System.out.println("Invalid input!");
            System.out.println("Please enter the worked hours:");
            weekendHours = scanner.nextInt();
        }
        scanner.close();

        int grossSalary = weekendHours * payRate;
        System.out.println("Your gross salary is " + grossSalary + "$");
    }
}
