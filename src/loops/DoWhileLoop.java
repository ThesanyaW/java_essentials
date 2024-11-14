package loops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args){

        int runAgain = 0;
        int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);
         do{

             System.out.println("Enter the number 1: ");
             num1 = scanner.nextInt();
             System.out.println("Enter the number 2: ");
             num2 = scanner.nextInt();

             sum = num1 + num2;

             System.out.println(num1 + " + " + num2 + " = " + sum);

             System.out.println("Do you want start over this. If yes, enter 1. If no, enter 0: ");
             runAgain = scanner.nextInt();
         }while(runAgain == 1);

         scanner.close();
    }
}
