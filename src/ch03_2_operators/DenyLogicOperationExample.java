package ch03_2_operators;

public class DenyLogicOperationExample {
	public static void main(String[] args) {
//		! : ��(true/false) ���� ������ (booleanŸ�Կ��� ����)
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
	}
}
