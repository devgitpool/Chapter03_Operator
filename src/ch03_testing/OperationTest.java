package ch03_testing;

//import java.util.Scanner;

public class OperationTest {
	public static void main(String[] args) {
//		byte b = 5;
//		b = (byte)(-b); // ��ȣ���� ����� int
//		int result = 10 / b;
//		System.out.println(result);
		
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
////		y-- : y�� 1 �����ϴµ�, ���๮�� ��ġ�� ����  �� ';' ���Ŀ�...
//		
//		System.out.printf("x: %d, y: %d\n", x , y); // x: 11, y: 19
//		System.out.println(z); // 31, 30, ?
		
//		boolean stop = false;
////		if(!stop) {
////		if(stop != true) {
//		if(stop) {
//			System.out.println("Stop!!!");
//		}
		
//		int pencils = 534;
//		int students = 30;
//		
//		// �л� 1���� ������ ���� ����
//		int pencilsPerStudent = (pencils / students); 	// ��
//		System.out.println(pencilsPerStudent);
//		
//		// ���� ���� ����
//		int pencilsLeft = (pencils % students);			// ������
//		System.out.println(pencilsLeft);
		
//		int var1 = 5;
//		int var2 = 2;
////		double var3 = var1 / var2; 						// 2.0
//		double var3 = (double)var1 / var2;				// 2.5
//		
//		int var4 = (int)(var3 * var2);					// 4
//		System.out.println(var4);
		
//		int value = 356;
//		System.out.println(value / 100 * 100);
//		
//		float var1 = 10f; // 10.0f <=> 10.0
//		float var2 = var1 / 100; // ? 0.1f
//		double var2 = var1 / 100.0;
		
//		System.out.println(var1 / 100);
//		System.out.println(var1 / 100.0);
//		
//		System.out.printf("/100f  = %.15f\n", var1/100);	// 0.100000001490116
//		System.out.printf("/100.0 = %.15f\n", var1/100.0);	// 0.100000000000000
//		
//		if(var2 == 0.1) {
//			System.out.println("10% �Դϴ�.");
//		} else {
//			System.out.println("10%�� �ƴմϴ�.");
//		}
		
//		int lengthTop = 5;
//		int lengthBottom = 10;
//		int height = 7;
////		area = (double)((�� + �Ʒ�) * ����) / 2;	
//		double area = (double)((lengthTop + lengthBottom) * height) / 2;
//		
//		System.out.println(area);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("ù ��° ��: ");
//		double input1 = sc.nextDouble();
//		
//		System.out.print("�� ��° ��: ");
//		double input2 = sc.nextDouble();
//		
//		double result = input1 / input2;
//		
//		System.out.println("--------------------------");
//		
//		if(input2 == 0 || input2 == 0.0) {			
//			System.out.println("���:���Ѵ�");			
//		} else {
//			System.out.printf("���:%.2f\n", result);
//		}
		// ������
//		int var1 = 10;
//		
//		int var2 =3;
//		int var3 = 14;
//		
//		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		
//		System.out.println(var2 + "." + var3 + 1);
//		System.out.println(Double.parseDouble(var2 + "." + var3) + 1);
		
//		System.out.println("���� ����: " + var4);
//==========================================================================
		
//		String���� ����
//		1. ���ͷ� : string constant pool ����(intern()���翩�� �ּҰ� ��ȯ
//		2. new  : heap �ν��Ͻ�
		
//		String s1 = "abc";
//		String s2 = new String("abc");
//		String s3 = "abc";
//		
//		System.out.printf("s1:%s, s2:%s\n", s1, s2);
//		System.out.println("s1:" + System.identityHashCode(s1));
//		System.out.println("s2:" + System.identityHashCode(s2));
//		System.out.println("s3:" + System.identityHashCode(s3));
//		
//		System.out.println(s1 == s2); // ?
//		System.out.println(s1.equals(s2)); // println(String��������.toString()ȣ��)
//		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("���̵�:");
//		String name = sc.nextLine();
//		
//		System.out.print("�н�����:");
//		String strPassword = sc.nextLine();
//		int password = Integer.parseInt(strPassword);
//
//		// ���̵� "java"��? �ƴϳ�?
//		if (name == "java") {
////		if (name.equals("java")) {	
//			if(password == 12345) {
//				System.out.println("�α��� ����");
//			} else {
//				System.out.println("�α��� ����: �н����尡 Ʋ��");
//			}
//		} else {
//			System.out.println("�α��� ����: ���̵� �������� ����");
//		}
		
//		==================================================================
		
//		12. 
		int x = 10;
		int y = 5;
		System.out.println((x > 7) && (y <= 5)); // true
		System.out.println((x % 3 == 2) || (y % 2 != 1)); // false
		
//		14.
		int score = 85;
		String result = (!(score > 90)) ? "��" : "��";
		System.out.println(result); // ��
		
		
	}
}
