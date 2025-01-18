package arrays;
import java.util.Random;

class Answer {

    static BingoCard getBingoCard() {

        // Generate each column with the appropriate ranges
        int[] b = generateColumn(1, 15);
        int[] i = generateColumn(16, 30);
        int[] n = generateColumn(31, 45);
        int[] g = generateColumn(46, 60);
        int[] o = generateColumn(61, 75);

        // Adjust the 'N' column to have only 4 numbers (middle free space)
        n[2] = 0; // Free space

        // Create and return the BingoCard
        return new BingoCard(b, i, n, g, o);
    }

    private static int[] generateColumn(int min, int max) {
        Random random = new Random();
        int[] column = new int[5];
        int count = 0;

        while (count < column.length) {
            int number = random.nextInt(max - min + 1) + min; // Generate number in range

            if (!elementExists(column, number)) {
                column[count] = number; // Add unique number to column
                count++;
            }
        }
        return column;
    }

    // Check if an element exists in the array
    private static boolean elementExists(int[] array, int element) {
        for (int num : array) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }
}

public class BingoCard {
    private int[] b, i, n, g, o;

    public BingoCard(int[] b, int[] i, int[] n, int[] g, int[] o) {
        setB(b);
        setI(i);
        setN(n);
        setG(g);
        setO(o);
    }

    public void setB(int[] numbers) {
        b = numbers;
    }

    public void setI(int[] numbers) {
        i = numbers;
    }

    public void setN(int[] numbers) {
        n = numbers;
    }

    public void setG(int[] numbers) {
        g = numbers;
    }

    public void setO(int[] numbers) {
        o = numbers;
    }

    public int[] getB() {
        return b;
    }

    public int[] getI() {
        return i;
    }

    public int[] getN() {
        return n;
    }

    public int[] getG() {
        return g;
    }

    public int[] getO() {
        return o;
    }

    public void printCard() {
        System.out.println(" B  I  N  G  O");
        for (int row = 0; row < 5; row++) {
            System.out.printf("%2d %2d %2d %2d %2d%n",
                    b[row], i[row], (row == 2 ? 0 : n[row]), g[row], o[row]);
        }
    }
}

class Main {
    public static void main(String[] args) {
        BingoCard result = Answer.getBingoCard();
        result.printCard(); // Print the Bingo card
    }
}
