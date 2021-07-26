package ch03_2_operators;

public class ConditionalOperationExample {
	public static void main(String[] args) {
//					[삼항 연산자(=?:)]
//		=  조건식       ?        값          :       값
//		true/false ?    (참인 경우)  :   (거짓인 경우)
		
//		ex) 학점(grade) 출력하기
		
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
		System.out.println(score + "점은 " + grade + "등급 입니다.");
	}
}
