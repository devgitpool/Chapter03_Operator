package ch03_2_operators;

public class CompareOperationExample1 {
	public static void main(String[] args) {
//		[�� ������(<, <=, >, >=, ==, !=) ���ؼ� true/false�� ����]
//		���� �帧�� ����: ���ǹ�(if), �ݺ���(for,while)���� �ַ� ���
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2); // true
		boolean result2 = (num1 != num2); // false
		boolean result3 = (num1 <= num2); // true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
		char ch1 = 'A'; // 65
		char ch2 = 'B'; // 66
		boolean result4 = (ch1 < ch2);	  // true
		System.out.println(result4);	
	}
}
