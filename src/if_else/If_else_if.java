package if_else;

import java.util.Scanner;

public class If_else_if {

    public static void main(String[] args) {

        int score;
        char grade;

        System.out.println("Enter your score: ");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        scanner.close();

        if(score < 60){
            grade = 'F';
        }
        else if(score < 70){
            grade = 'C';
        }
        else if(score < 80){
            grade = 'B';
        }
        else{
            grade = 'A';
        }

        System.out.println("Your Grade is " + grade);
    }
}
