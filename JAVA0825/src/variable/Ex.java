package variable;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 식별자 작성 규칙
		 * < 필수 >
		 * 1. 첫 글자는 숫자로 시작할 수 없음(7eleven 사용 불가)
		 * 2. 특수문자는 $ 와 _ 만 사용 가능(my-name 사용 불가)
		 * 3. 대소문자 구별(name 과 NAME 은 서로 다른 이름으로 사용 가능)
		 * 4. 예약어(키워드, Keyword) 사용 불가
		 *    => 자바에서 미리 선점(예약)해 놓은 이름
		 * 5. 공백 포함 불가
		 * 6. 길이 제한 없음
		 * 
		 * < 선택 >
		 * 1. 의미가 있는 단어 사용
		 * 2. 단어의 조합을 사용할 경우 두번째 단어부터 첫 글자는 모두 대문자 사용
		 *    => Camel-case 표기법
		 *    ex)학생이름을 변수로 작성 시 studentName
		 *    (참고. 클래스명 첫 단어도 첫 글자를 대문자로 표기 => Pascal-case 표기법)
		 * 3. 한글 사용은 가능하지만 사용하지 않음.
		 *   
		 */
		
		// 1. 첫 글자는 숫자 사용 불가
//		int 7eleven; // 사용 불가
		int sevenEleven; // 사용 가능
		
		// 2. 특수문자 $(달러) 또는 _(언더스코어) 만 사용 가능
		int $ystem; // 사용 가능
		int my_name; // 사용 가능
//		int channel#5; // 사용 불가! ($ 또는 _ 만 가능)
		
		// 3. 대소문자 구별
		int name; // 소문자 name 과
		int NAME; // 대문자 NAME은 다른 식별자로 취급됨
		
		// 4. 예약어(키워드, Keyword) 사용 불가
//		int int; // 키워드 int 사용 불가
//		int switch; // 키워드 switch 사용 불가
//		int char; // 키워드 char 사용 불가
		
		// 5. 공백 사용 불가
//		int my name; // 사용 불가
//		int a, b;
		
		// 6. 한글 사용 가능
		int 나이;
		
		
		
	}

}








