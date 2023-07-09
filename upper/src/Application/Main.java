package Application;
import entities.Upper;

public class Main {
    public static void main(String[] args) {
        String text = "hello. how are you? i'm fine, thank you.";
        String capital = Upper.capitaç(text);
        System.out.println(text);
        System.out.println(capital);
    }
}