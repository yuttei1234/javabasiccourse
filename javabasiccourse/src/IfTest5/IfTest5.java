package IfTest5;

public class IfTest5 {
	public static void main(String[] args) {
		int a =5;
		int b =11;
		a++;
		b--;
		if (a == 6 && b == 10) {
			System.out.println("条件成立！");
			System.out.println("a:" + a);
			System.out.println("b:" + b);
		} else {
			System.out.println("不条件成立！");
			System.out.println("a:" + a);
			System.out.println("b:" + b);
		}
	}
}