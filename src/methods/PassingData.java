package methods;

import java.util.Scanner;

public class PassingData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Credit Score: ");
        int creditScore = scanner.nextInt();
        System.out.println("Enter your Salary: ");
        double salary = scanner.nextDouble();
        scanner.close();
        isUserQualified(creditScore, salary);
    }

     public static void isUserQualified(int creditScore, double salary){
        int requiredCreditScore = 700;
        double requiredSalary = 25000;

        if(creditScore > requiredCreditScore && salary > requiredSalary){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry, you've been declined.");
        }
     }
}
