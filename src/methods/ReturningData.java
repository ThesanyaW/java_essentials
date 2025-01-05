package methods;

import java.util.Scanner;

public class ReturningData {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Credit Score: ");
        int creditScore = scanner.nextInt();
        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();
        scanner.close();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(int creditScore, double salary){
        int requiredCreditScore = 700;
        double requiredSalary = 25000;

        if(creditScore > requiredCreditScore && salary > requiredSalary){
            return true;
        }
        else{
           return false;
        }
    }

    public static void notifyUser(boolean qualified){

        if(qualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry, you've been declined.");
        }
    }
}
