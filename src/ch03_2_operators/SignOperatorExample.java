package ch03_2_operators;

public class SignOperatorExample {
	public static void main(String[] args) {
//		����, ����, ���� ... -> �ʿ�� �ϴ� �ǿ������� ���� ����...
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
//		byte result3 = -b;
		int result3 = -b;
		System.out.println("result3=" + result3);
	}
}
