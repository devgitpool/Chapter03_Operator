package ch03_2_operators;

public class CompareOperationExample1 {
	public static void main(String[] args) {
//		[비교 연산자(<, <=, >, >=, ==, !=) 비교해서 true/false를 산출]
//		실행 흐름을 제어: 조건문(if), 반복문(for,while)에서 주로 사용
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
