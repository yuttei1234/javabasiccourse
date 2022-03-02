package javabasiccourse;

public class IfTest3 {
	public static void main(String[] args) {
		int myAge = 40;
		char myBloodtype = 'O';
		if(myAge == 35 || myBloodtype == 'B' ) {
			System.out.println("私の年齢は35歳又は血液型はB型です!");
		} else if(myAge == 35 || myBloodtype == 'A') {
			System.out.println("私の年齢は35歳又は血液型はA型です!");
		} else if(myAge == 40 || myBloodtype == 'O') {
			System.out.println("私の年齢は40歳又は血液型はO型です!");
		} else {
			System.out.println("私の年齢と血液型はあなたの考えとは違います");
		}
		System.out.println("私の出身地は...");
	}
}
