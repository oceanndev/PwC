package Application;
import entities.Uppercase;
public class Main {
	public class Upper {
	    public static void main(String[] args) {
	        String texto = "hello. how are you? i'm fine, thank you";
	        String upper = Uppercase.uppers(text);
	        System.out.println(texto);
	        System.out.println(upper);
	    }
}
