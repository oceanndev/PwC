package entities;
public class anadromo {
	    public static boolean anadromo(String text) {
	        int[] charCount = new int[128];

	        for (char c : text.toCharArray()) {
	            charCount[c]++;
	        }
	        
	        int oddCount = 0;

	        for (int count : charCount) {
	            if (count % 2 != 0) {
	                oddCount++;
	                if (oddCount > 1) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }
	}
