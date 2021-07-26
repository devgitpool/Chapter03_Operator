package ch03_2_operators;

public class SignOperatorExample {
	public static void main(String[] args) {
//		단항, 이항, 삼항 ... -> 필요로 하는 피연산자의 수에 따라...
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
//		byte result3 = -b;
		int result3 = -b;
		System.out.println("result3=" + result3);
	}
}
