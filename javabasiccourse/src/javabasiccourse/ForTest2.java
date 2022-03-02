package javabasiccourse;

public class ForTest2 {
	public static void main(String[] args) {
		for(int i =1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("次のループ(周)に進む");
				continue;
			}
			System.out.println("for繰り返し："+ i + "回目");
		}
		int k = 1;
		int l = 5;
		System.out.println("kの初期値:" + k );
		while(k <= 5) {
			System.out.println("while繰り返し:" + k+ "周目。lの値:" + l);
			k++;
		}
		System.out.println("プログラムを抜けた後のlの値:" + l);
		System.out.println("プログラム終了！");
		System.out.println("kの終了値:" + l);
	}
}
