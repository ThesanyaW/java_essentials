package objects;

import java.util.Scanner;

import static objects.HomeAreaCalculatorWithMethods.calculateTotalArea;

public class HomeAreaCalculator2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Rectangle bedRoom = getRoom();
        Rectangle diningRoom = getRoom();

        double totalArea = calculateTotalArea(bedRoom, diningRoom);
        System.out.println("The total area is " + totalArea);

        scanner.close();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }
}
