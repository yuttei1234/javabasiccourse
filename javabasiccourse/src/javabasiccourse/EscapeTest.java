package javabasiccourse;

public class EscapeTest {
	public static void main(String[] args) {
		System.out.println("Hello!!");
		System.out.println("Double Quote(\") is displayed.");
		char c ='\'';
		System.out.println(c);
		System.out.println("\\ is displayed.");
		
		System.out.println("Hello!\nWorld!!");
		System.out.println("Hello!\tWorld!!");		
		
		String str = null;
		
		boolean test = true;
		if (test == true) {
			str = "Hello!\nWorld!!";
		} else {
			str = "Hello! World!!";
		}
		System.out.println(str);
	}
}