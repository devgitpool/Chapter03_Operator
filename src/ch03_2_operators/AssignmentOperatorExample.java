package ch03_2_operators;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
//							[대입연산자 ]
//		단순 대입 연산자(=)
//			: 자료형 변수명(L피연산자)  =  리터럴, 변수, 연산식 (R피연산자);
//		복합 대입 연산자(+=, -=, *=, /=, %=)
//			: 정해진 연산을 수행한 후 결과를 변수에 저장한다.
//		연산의 진행 방향
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
//		printf '%' 구글검색
	}
}
