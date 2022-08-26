package variable;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 변수 vs 상수
		 * - 변수(Variable) : 데이터를 저장하는 메모리 공간
		 * - 상수(Constant) : 항상 같은 값을 갖는, 즉 변하지 않는 데이터
		 *   ex) 정수 5, 실수 3.14, 문자 'A', 문자열 "Hello, World!" 등
		 *   => 자바에서는 실제 사용하는 데이터를 리터럴(Literal) 이라고 함
		 *   
		 * 자바에서 사용하는 데이터(리터럴)의 종류
		 * 1. 수치 데이터 - 정수형, 실수형, 문자
		 *    1) 정수형 - 소수점이 없는 숫자
		 *    2) 실수형 - 소수점이 있는 숫자
		 *    3) 문자형 - 작은 따옴표를 사용하여 1개의 문자 표현(내부적으로 정수로 취급됨)
		 * 2. 논리 데이터 : true 또는 false 값
		 * 3. 기타(문자열, 배열, 객체 등)  
		 */
		
		// 자바의 각종 리터럴
		// 1. 기본 리터럴
		System.out.println(1); // 정수형 리터럴
		System.out.println(3.14); // 실수형 리터럴	
		System.out.println('A'); // 문자형 리터럴
		System.out.println(true); // 논리형 리터럴
		
		// 2. 확장형 리터럴
		System.out.println(5L); // 정수형(long형) 리터럴 => 숫자 뒤에 접미사 L 붙임
		System.out.println(1.5f); // 실수형(float형) 리터럴 => 숫자 뒤에 접미사 f 또는 F 붙임
		System.out.println("Hello, World!"); // 문자열형(String) 리터럴
		
		// -------------------------------------------------------------------------------
		// 정수형 리터럴에서 진법 표현하는 방법
		// 10진수(0 ~ 9) : 숫자 그대로 사용
		// 2진수(0, 1) : 접두사 0b 붙여서 표현
		// 8진수(0 ~ 7) : 접두사 0 붙여서 표현
		// 16진수(0 ~ 9, A ~ F) : 접두사 0x 붙여서 표현
		// => 출력문 등에 사용될 때 실제 10진수 형태로 변환되어 표기됨
		System.out.println(10); // 10진수
		
		System.out.println(0b1010); // 2진수 1010 = 10진수 10
//		System.out.println(0b1234); // 오류 발생! 0 또는 1 만 사용 가능!
		
		System.out.println(012); // 8진수 012 = 10진수 10
//		System.out.println(0789); // 오류 발생! 0 ~ 7 사이만 사용 가능!
		
		System.out.println(0xA); // 16진수 A = 10진수 10
//		System.out.println(0xG); // 오류 발생! 0 ~ 9 와 A ~ F 사이만 사용 가능!
		
	}

}








