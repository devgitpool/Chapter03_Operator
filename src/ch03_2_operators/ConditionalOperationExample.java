package ch03_2_operators;

public class ConditionalOperationExample {
	public static void main(String[] args) {
//					[���� ������(=?:)]
//		=  ���ǽ�       ?        ��          :       ��
//		true/false ?    (���� ���)  :   (������ ���)
		
//		ex) ����(grade) ����ϱ�
		
		int score = 85; 
		char grade;
		/*
		 * if(score > 90) { 
		 * 		grade = 'A'; 
		 * } else {
		 *  	grade = 'B'; 
		 * }
		 */
//		                     true : false
		grade = score > 90 ?  'A' : 'B';
//             (  false  )  		
		System.out.println(grade);
		
//		================================================================================

		System.out.println("ConditionalOperationalExample=======================");
		score = 65;
		grade = (score > 90) ? 'A' : (score > 80 ? 'B' : 'C'/*(score > 70 ? 'C' : 'D')*/); 
//		                             (score > 80 ? 'B' : 'C') => 'B' or 'C'
		System.out.println(score + "���� " + grade + "��� �Դϴ�.");
	}
}
