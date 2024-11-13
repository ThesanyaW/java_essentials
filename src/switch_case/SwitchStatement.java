package switch_case;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){

        String message;
        String grade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your grade: ");
        grade = scanner.next();

        scanner.close();

        switch (grade){
            case "A":
               message = "Excellent job!";
               break;
            case "B":
                message = "Good job!";
                break;
            case "C":
                message = "You are pass!";
                break;
            case "F":
                message = "Oops you got fail!";
                break;
            default:
                message = "Invalid input!";
        }

        System.out.println("Your grade is " + grade + "\n" + message);
    }
}
