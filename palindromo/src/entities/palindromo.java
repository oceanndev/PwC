package entities;

public class palindromo {
	 public static String palindromo(String text) {
	        if (text == null || text.length() < 2) {
	            return text;
	        }

	        String palindromo = "";

	        for (int i = 0; i < text.length(); i++) {
	            String palindromoA = expC(text, i, i);
	            if (palindromoA.length() > palindromo.length()) {
	                palindromo = palindromoA;
	            }

	            palindromoA = expC(text, i, i + 1);
	            if (palindromoA.length() > palindromo.length()) {
	                palindromo = palindromoA;
	            }
	        }

	        return palindromo;
	    }

	    private static String expC(String text, int left, int right) {
	        while (left >= 0 && right < text.length() && text.charAt(left) == text.charAt(right)) {
	            left--;
	            right++;
	        }
	        return text.substring(left + 1, right);
	    }
	}