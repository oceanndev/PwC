package entities;

public class Upper {
	  public static String capitaç(String text) {
	        StringBuilder result = new StringBuilder();

	        // Define a primeira letra como maiúscula
	        boolean first = true;

	        // Percorre a string
	        for (char c : text.toCharArray()) {
	            // Se é o início de uma nova frase, coloca a letra em maiúscula
	            if (first && Character.isLetter(c)) {
	                result.append(Character.toUpperCase(c));
	                first = false;
	            } else {
	                result.append(c);
	            }

	            // Verifica se é o fim de uma frase
	            if (c == '.' || c == '?' || c == '!') {
	                first = true;
	            }
	        }

	        return result.toString();
	}
	}

