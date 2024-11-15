package loops;

import java.util.Scanner;

public class BreakStatement {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some text:");
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < text.length(); i++){

            char currentletter = text.charAt(i);
            if (currentletter == 'a' || currentletter == 'A'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("The letter 'a' or 'A' was found.");
        }
        else{
            System.out.println("The letter 'a' or 'A' was not found.");
        }
    }
}
