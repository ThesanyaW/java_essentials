package codeChallenge;

public class DollarGame {

    public static void main(String[] args){

        int numOfPennies = 10;
        int numOfNickels = 3;
        int numOfDimes = 5;
        int numOfQuarters = 1;
        boolean result = DollarGame.isADollar(numOfPennies, numOfNickels, numOfDimes, numOfQuarters);
        if (result) {
            System.out.println("Congratulations! The total is exactly one dollar.");
        } else {
            System.out.println("Sorry, the total is not one dollar.");
        }

    }

    static boolean isADollar(int numOfPennies, int numOfNickels, int numOfDimes, int numOfQuarters) {

        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;

        boolean won = false;

        double totalValue = ((numOfPennies * penny) + (numOfNickels * nickel) + (numOfDimes * dime) + (numOfQuarters * quarter));

        if (totalValue == dollar){
            won = true;
        }

        return won;
    }

}
