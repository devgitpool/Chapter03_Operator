package ch03_1_operator_expression;

public class OperatorExpression {
	public static void main(String[] args) {
//		������(operator) : ���꿡 ���Ǵ� ǥ�ó� ��ȣ(+,-,*,/....)
		int x = 1, y = 2;
		int result = 	x		+ 		y ;
//					  �ǿ�����      ������     �ǿ�����
//		�������� ����
//		��� : +, -, *, /, % 
//		���� : =, +=, -=, *=, /=, %=
//		���� : ++, --
//		�� : ==, !=, >, <, <=, >=
//		�� : !, &, |, &&, ||
//		���� : (���ǽ�) ? A : B 
//			  ���ǽĿ� ���� A �Ǵ� B �� �ϳ��� ����
		
//		������ ����� �켱����
//		(),*,/... �Ϲ����� ���Ŀ� ����Ǵ� ���� ���
		boolean bool = x > 0 && y < 0;
//                 (true) && (false)		
		System.out.println(bool);
		
//      � �����ڸ� ����ϴ��Ŀ� ���� ������ ������ ����		
//	             --------------->	
		result = 100 * 2 / 3 % 5;
		System.out.println(result);
//		System.out.println(200/3);
//		System.out.println(66%5);
		
		int a, b, c;
//		<------------
		a = b = c = 5;
		
		result = (a + b) * c;
	}
}
