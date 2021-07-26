package ch03_2_operators;

public class LogicalOperationExample {
	public static void main(String[] args) {
//		[�� ������(&&:��, ||:��, &, |, ^:��Ÿ�� ����, !:������)]
		
		/*************************************
		 * ��Ʈ������( |,  &,  ^,  ~,  <<,  >> )
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
		
//		&&, || , !, �帧�� �����ϱ� ���� ������ ����(if, while��)�� �� ���
//		(false) && : ���� �ǿ����ڰ� false��� ���� �ǿ����ڸ� ������ �ʴ´�.
//		(true)	|| : ���� �ǿ����ڰ� true��� ���� �ǿ����ڸ� ������ �ʴ´�.
		
//		false && true && true && true
//		true || false || false || false
		
		System.out.println("LogicalOperationExample.java================");
		
		int charCode = 'A';
//		   --------------------------------> ��� ��
		if((charCode >= 65) & (charCode<= 90)) {
			System.out.println("�빮�ڱ���");
		}
//		    ----false---->  ���� �ǿ����ڴ� ������ ����
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ��ڱ���");
		}
//		    ---------------------------------->
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 ���ڱ���");
		}
		
		int value = 6;
		
//		    ---------------------------------> ��� ��
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}
//		    ------------->   ���� �ǿ����ڴ� ������ ����
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� �������");
		}
	}
}
