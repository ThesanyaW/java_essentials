package switch_case;

import java.util.Scanner;

public class SwitchExpression {

    public static void main(String[] args){

        String message;
        String grade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your grade: ");
        grade = scanner.next();

        scanner.close();

        message = switch (grade){
            case "A" -> "Excellent job!";
            case "B" -> "Good job!";
            case "C" -> "You are pass!";
            case "F" -> "oops you got fail!";
            default -> "Invalid input!";
        };

        System.out.println("Your grade is " + grade + "\n" + message);
    }
}
