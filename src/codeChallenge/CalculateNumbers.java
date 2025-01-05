package codeChallenge;
import java.util.Scanner;

public class CalculateNumbers {

    static double result = 0;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();

        result = add(firstNumber, secondNumber);
        result = subtract(result, secondNumber);
        result = multiply(result, firstNumber);
        result = divide(result, secondNumber);
        displayResult(result);

    }

    public static double add(int num1, int num2){
        return num1 + num2;
    }

    public static double subtract(double result, int num2){
        return result - num2;
    }

    public static double multiply(double result, int num1){
        return result * num1;
    }

    public static double divide(double result, int num2){
        return result / num2;
    }

    public static void displayResult(double result){
        System.out.println("Result is " + result);
    }
}
