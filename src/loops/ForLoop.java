package loops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args){

        int i, quantity;
        double price, total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the item quantity: ");
        quantity = scanner.nextInt();

        for(i=0; i<quantity; i++){

            System.out.println("Please enter the item price: ");
            price = scanner.nextDouble();

            total = total + price;
        }
        scanner.close();

        System.out.println("Total cost is " + total + "$");
    }
}
