package loops;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args){

        int numOfStudents = 2;
        int numOfTests = 3;

        Scanner scanner = new Scanner(System.in);

        for(int i= 1; i <= numOfStudents; i++){

            int total = 0;

            for(int j = 1; j <= numOfTests; j++){

                 System.out.println("Enter the score of test " + j + ":");
                 int score = scanner.nextInt();

                 total = total + score;
            }

            double avg = total / numOfTests;
            System.out.println("Student " + i + " average score is " + avg);
        }
    }
}
