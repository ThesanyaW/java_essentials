package textProcessing;

public class StringExamples {
    public static void main(String[] args) {
        // Example 1: Count words in a string
        String text = "I love Java";
        countWords(text);

        // Example 2: Reverse a string
        String reverseText = "stop";
        reverseString(reverseText);
    }

    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
        System.out.println();
    }

    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }
}
