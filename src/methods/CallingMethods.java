package methods;

import java.util.Scanner;

public class CallingMethods {

    public static void main(String[] args){
        greetingUser();
    }

    public static void greetingUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hi there, " + name);
    }
}
