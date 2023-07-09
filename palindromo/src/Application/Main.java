package Application;
import entities.palindromo;

public class Main {
    public static void main(String[] args) {
        String textr = "babad";
        String Palindromica = palindromo.palindromo(textr);
        System.out.println(textr);
        System.out.println(Palindromica);
    }
}