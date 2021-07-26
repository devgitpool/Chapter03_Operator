package ch03_2_operators;

public class CompareOperationExample2 {
	public static void main(String[] args) {
		
		int 	v2 = 1;
		double 	v3 = 1.0;
		System.out.println(v2 == v3);
		
		double 	v4 = 0.1;
		float 	v5 = 0.1f;
		System.out.println(v4 == v5);
		System.out.println((float)v4 == v5);
		
//		System.out.println(v4 == (double)v5);
//		실수의 저장방식(부동소수점방식)이 0.1을 정확히 표현할 수 없다.
		System.out.println((double)v5); // 0.10000000149011612
		System.out.println((float)v4);  // 0.1
	}
}
