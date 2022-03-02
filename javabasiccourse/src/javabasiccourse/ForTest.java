package javabasiccourse;

public class ForTest {
	public static void main(String[] args) {
		for(int i =1; i <= 10; i++) {
			
			if (i == 5) {
				continue; 
			}
			System.out.println("繰り返し："+ i + "回目");	
		}
	}
}
