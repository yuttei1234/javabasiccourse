package javabasiccourse;

public class IfTest4 {
	public static void main(String[] args) {
		int myAge = 50;
		String myBloodType = "AB";
		if(myAge == 35 || myBloodType.equals("B")) {
			System.out.println("私の年齢は35歳又は血液型はB型です。");
		} else if(myAge == 35 || myBloodType.equals("A")) {
			System.out.println("私の年齢は35歳又は血液型はA型です。");
		} else if(myAge == 40 || myBloodType.equals("O")) {
			System.out.println("私の年齢は35歳又は血液型は0型です。");
		} else {
			System.out.println("私の年齢や血液型はあなたの考えと違います。");
		}
		System.out.println("私の出身地は...");
	}
}