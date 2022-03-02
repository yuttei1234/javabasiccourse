package javabasiccourse;

public class WhileTest {
	public static void main(String[] args) {
		System.out.println("多い番号順から点呼取ります");
		int number = 11;
		while(number <= 10 && number >= 1) {
			System.out.println(number + "!!");
			number--;
		}
	}
}