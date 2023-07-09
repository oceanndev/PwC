package Application;
	import java.util.HashMap;
	import java.util.Map;
	import entities.anadromo;

	public class Main {
	    public static void main(String[] args) {
	        String text = "madam I madam";
	        boolean anagram = anadromo.anadromo(text);
	        System.out.println(text);
	        System.out.println(anagram);
	    }
	}