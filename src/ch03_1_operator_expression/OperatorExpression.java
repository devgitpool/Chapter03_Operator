package ch03_1_operator_expression;

public class OperatorExpression {
	public static void main(String[] args) {
//		연산자(operator) : 연산에 사용되는 표시나 기호(+,-,*,/....)
		int x = 1, y = 2;
		int result = 	x		+ 		y ;
//					  피연산자      연산자     피연산자
//		연산자의 종류
//		산술 : +, -, *, /, % 
//		대입 : =, +=, -=, *=, /=, %=
//		증감 : ++, --
//		비교 : ==, !=, >, <, <=, >=
//		논리 : !, &, |, &&, ||
//		조건 : (조건식) ? A : B 
//			  조건식에 따라서 A 또는 B 중 하나를 선택
		
//		연산의 방향과 우선순위
//		(),*,/... 일반적인 수식에 적용되는 연산 방식
		boolean bool = x > 0 && y < 0;
//                 (true) && (false)		
		System.out.println(bool);
		
//      어떤 연산자를 사용하느냐에 따라 연산의 방향이 결정		
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
