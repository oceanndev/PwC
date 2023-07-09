package entities;

import java.util.LinkedHashSet;

public class textw {
    public static String textw(String text) {
        LinkedHashSet<Character> caracteresj = new LinkedHashSet<>();

        for (int i = 0; i < text.length(); i++) {
            caracteresj.add(text.charAt(i));
        }

        StringBuilder textowr = new StringBuilder();
        for (Character c : caracteresj) {
            textowr.append(c);
        }

        return textowr.toString();
    }
}