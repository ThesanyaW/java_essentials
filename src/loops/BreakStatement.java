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

            char currentLetter = text.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'A'){
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
