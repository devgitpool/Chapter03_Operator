package ch03_2_operators;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
//							[���Կ����� ]
//		�ܼ� ���� ������(=)
//			: �ڷ��� ������(L�ǿ�����)  =  ���ͷ�, ����, ����� (R�ǿ�����);
//		���� ���� ������(+=, -=, *=, /=, %=)
//			: ������ ������ ������ �� ����� ������ �����Ѵ�.
//		������ ���� ����
//		    : a = b = c = 5;
		
		int result = 0;
		result += 10; // result = result + 10;
		System.out.println(result); // 10
		
		result -= 5; // result = result - 5;
		System.out.println(result); // 5
		
		result *= 3; // result = result * 3;
		System.out.println(result); // 15
		
		result /= 5;
		System.out.printf("result /= 5 : %d\n", result); // 3
		
		result %= 3;
		System.out.printf("result %%= 3 : %d\n", result); // 0
//		printf '%' ���۰˻�
	}
}
