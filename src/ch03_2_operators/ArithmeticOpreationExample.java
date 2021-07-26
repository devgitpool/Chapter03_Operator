package ch03_2_operators;

public class ArithmeticOpreationExample {
	public static void main(String[] args) {
//  					[산술연산자(+, -, *, /, %)]
//		나머지연산자(%) : 어떤 수를 나눈 나머지 = number % 3; // 0, 1, 2
// 		산술연산은 피연산자들의 타입을 일치시킨 후 연산을 수행한다.
//		- byte, short, char --> int
//		- int < long < float < double 허용 범위가 큰 타입으로 변환된 후 연산을 수행
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		
		double result6 = (double)v1 / v2;
		System.out.println("result6=" + result6);
	}
}
