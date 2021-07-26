package ch03_2_operators;

public class LogicalOperationExample {
	public static void main(String[] args) {
//		[논리 연산자(&&:곱, ||:합, &, |, ^:배타적 논리합, !:논리부정)]
		
		/*************************************
		 * 비트연산자( |,  &,  ^,  ~,  <<,  >> )
		 * 
		 *            or     and     xor
		 *  x	y	x | y	x & y	x ^ y
		 *************************************   
		 *  1	1	  1		  1	      0
		 *  1	0     1       0       1
		 *  0	1     1       0       1
		 *  0	0     0       0       0
		 *************************************/
		
		
		byte b = -1;
		System.out.println(~b); //  0
		
		b = 79;
		System.out.println(~b); // -80
		
		int i = 1;
		System.out.println(i << 1); // 2
		System.out.println(i << 3); // 8
		
		System.out.println(8 >> 2); // 2
		
//		&&, || , !, 흐름을 제어하기 위한 조건을 설정(if, while문)할 때 사용
//		(false) && : 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않는다.
//		(true)	|| : 앞의 피연산자가 true라면 뒤의 피연산자를 평가하지 않는다.
		
//		false && true && true && true
//		true || false || false || false
		
		System.out.println("LogicalOperationExample.java================");
		
		int charCode = 'A';
//		   --------------------------------> 모두 평가
		if((charCode >= 65) & (charCode<= 90)) {
			System.out.println("대문자군요");
		}
//		    ----false---->  뒤의 피연산자는 평가하지 않음
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자군요");
		}
//		    ---------------------------------->
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자군요");
		}
		
		int value = 6;
		
//		    ---------------------------------> 모두 평가
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
//		    ------------->   뒤의 피연산자는 평가하지 않음
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수군요");
		}
	}
}
