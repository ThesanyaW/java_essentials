package methods;

import java.util.Scanner;

public class CreatingMethods {
    public static void main(String[] args){

        int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        num2 = scanner.nextInt();

        CreatingMethods sum1 = new CreatingMethods();
        sum = sum1.calculateSum(num1, num2);
        sum1.displaySum(sum);
    }

    public int calculateSum(int num1, int num2){

        return num1 + num2;
    }

    public void displaySum(int sum){
        System.out.println("Sum is " + sum);
    }
}
