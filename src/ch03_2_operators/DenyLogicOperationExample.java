package ch03_2_operators;

public class DenyLogicOperationExample {
	public static void main(String[] args) {
//		! : 논리(true/false) 부정 연산자 (boolean타입에만 적용)
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}
}
