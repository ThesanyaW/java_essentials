package if_else;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){

        int quota = 10;
        int count = 1;
        Scanner scanner = new Scanner(System.in);

        while(count <= 10) {
            System.out.println("How many sales did you make this week?");
            int sales = scanner.nextInt();

            if (sales > quota) {
                System.out.println("Congrats! You've met your quota.");
            }
            else {
                int salesShort = quota - sales;
                System.out.println("You did not make the quota. You were " + salesShort + " sales short.");
            }
            count ++;
        }
        scanner.close();
    }
}
