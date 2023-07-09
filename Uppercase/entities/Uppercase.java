package entities;
public class Uppercase {
	   public static String Uppers(String texto) {
	        StringBuilder result = new StringBuilder();

	        boolean first = true;

	        for (char c : text.toCharArray()) {
	            if (first && Character.isLetter(c)) {
	                result.append(Character.toUpperCase(c));
	                first = false;
	            } else {
	                result.append(c);
	            }

	            if (c == '.' || c == '?' || c == '!') {
	                first = true;
	            }
	        }

	        return resultado.toString();
	    }
	}

}
