package arrays;

public class Arrays {

    String[] players = new String[3];

    String[] students = {"Thesanya", "Thejitha", "Kaveesha"};

    public Arrays(){
        players[0] = "Thes";
        players[1] = "Theji";
        players[2] = "Kavee";
    }

    public void printData() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Player " + (i+1) + " is " + players[i]);
        }

        for(int i = 0; i<players.length; i++){
            if(players[i].equals("Thes")){
                System.out.println("Thes found!");
            }
        }

        System.out.println("\n-----------------------\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Student " + (i + 1) + " is " + students[i]);
        }
    }

    public static void main(String[] args){

        Arrays arrayExample = new Arrays();
        arrayExample.printData();
    }
}
