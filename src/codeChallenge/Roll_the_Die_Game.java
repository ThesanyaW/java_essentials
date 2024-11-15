package codeChallenge;

import java.util.Random;

public class Roll_the_Die_Game {

    public static void main(String[] args){

        String result = Answer.playGame();
        System.out.println(result);
    }
}

class Answer {

    static String playGame(){

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";

        for(int i=0; i<maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            if(currentSpace == lastSpace){
                return String.format(justRight, currentSpace);
            }
        }

        if(currentSpace < lastSpace){
            return String.format(tooLow, currentSpace);
        }
        else{
            return String.format(tooHigh, lastSpace);
        }
    }
}
