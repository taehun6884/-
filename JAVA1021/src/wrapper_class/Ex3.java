package wrapper_class;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열 -> 기본 데이터 타입으로 변환
		 * - 주로 웹에서 form 태그의 input 태그로 데이터를 입력받거나
		 *   자바, 안드로이드 등 GUI 환경으로 데이터를 입력받을 때
		 *   수치데이터를 입력하더라도 모두 문자열로 취급됨
		 *   => 따라서, 해당 문자열을 실제 연산을 하기 위해
		 *      기본 데이터타입으로 변환하려면 Wrapper 클래스에서 제공하는
		 *      메서드를 통해 변환을 수행해야 한다!
		 *      
		 * < 기본 문법 규칙 >
		 * Wrapper클래스명.parse기본데이터타입명(문자열변수 또는 데이터)
		 * => ex) 정수형으로 변환할 경우 Integer.parseInt();
		 *        실수형으로 변환할 경우 Double.parseDouble();
		 */

		String strNum = "100.0"; 
		
//		int iNum = Integer.parseInt(strNum);
		// String 타입 문자열 실수 -> int형으로 변환하려 할 경우
		// 실제 데이터가 실수이므로 정수형으로 변환이 불가능한 관계이며
		// 문법적으로 문제가 없지만 실행 시점에서 오류가 발생함!
		// => NumberFormatException 예외 발생
//		int i = 100.0; // int형 변수에 실수를 저장하지 못하는 것과 동일함
		
		double dNum = Double.parseDouble(strNum);
		System.out.println(dNum);
		
		// 기본데이터타입이 아닌 Wrapper 클래스 타입으로 변환도 가능함
		Double dNum2 = new Double(strNum); // 생성자에 문자열 전달
		System.out.println(dNum2);
		
		strNum = "1234";
		// int형 변수 iNum에 문자열 "1234"를 변환하여 저장
		int iNum = Integer.parseInt(strNum);
		System.out.println(iNum);
		
	}

}










