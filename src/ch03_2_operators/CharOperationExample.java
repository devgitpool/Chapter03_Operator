package ch03_2_operators;

public class CharOperationExample {
	public static void main(String[] args) {
		
		char c1 = 'A' + 1; // 65+1�� ������ �Ǿ� ����
		char c2 = 'A';
//		char c3 =  c2 + 1; // char������ ������꿡 ���Ǹ� intŸ������ ����ȯ
		char c3 = (char)(c2 + 2);
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		System.out.println("c3:" + c3);
	}
}
