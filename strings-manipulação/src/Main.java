import java.util.Scanner;
import entities.reverseWords;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String input = sc.nextLine();
        String reversed = reverseWords.reverseWords(input);
        System.out.println(reversed);
        sc.close();
    }
}
