package arrays;

public class Varargs {

    public static void calculateSum(int ...numbers){
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){

        calculateSum();
        calculateSum(2,3);
        calculateSum(2,3,5);
        calculateSum(new int[] {5,6,4,10});
    }
}

