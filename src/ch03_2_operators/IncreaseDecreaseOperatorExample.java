package ch03_2_operators;

public class IncreaseDecreaseOperatorExample {
/*
	public static void main(String[] args) {
//		증감 연산자(++, --)
//		변수의 값을 1 증가 시키거나 1 감소 시키는 연산
		
		int i = 0;
//		++i; 증가 후 사용
//		다른 연산을 수행하기 전에 피연산자의 값을 1 증가
		System.out.println(++i);
		
		System.out.println("--------------------");
		
		i = 0;
//		i++; 사용 후 증가
//		다른 연산을 수행한 후에 피연산자의 값을 1 증가
//		----> System.out.println(i), ++ 
		System.out.println(i++);
		
		int x = 1, y = 1;
		
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		System.out.println("y = " + y);
	}
*/
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++; // 10
		++x; // 12
		System.out.println("x=" + x); // 12
		
		System.out.println("------------------");		
		y--; // 10
		--y; // 8
		System.out.println("y=" + y); // 8
		
		System.out.println("------------------");
		z = x++; // 12
		System.out.println("z=" + z); // 12
		System.out.println("x=" + x); // 13
		
		System.out.println("------------------");
		z = ++x; // 14
		System.out.println("z=" + z); // 14
		System.out.println("x=" + x); // 14
		
		System.out.println("------------------");
		z = ++x + y++;
		System.out.println("z=" + z); // 23  
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9
	}
}
