package entities;

public class reverseWords {
    public reverseWords() {
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(int i = words.length - 1; i >= 0; --i) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }
}
