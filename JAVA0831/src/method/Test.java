package method;

public class Test {

	public static void main(String[] args) {
		// "Hello, World!" 문자열을 10번 출력하는 코드
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + " : Hello, World!");
//		}
		
//		System.out.println("-------------");
		// "Hello, World!" 문자열을 10번 출력하는 코드를 다시 작성
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i + " : Hello, World!");
//		}

		// ==========================================================
		// 1. 전달인자가 없고, 리턴값도 없는 메서드 호출
		// "Hello, World!" 문자열을 10번 출력하는 hello() 메서드 호출
		hello();
		// hello() 메서드를 호출할 때마다 "Hello, World!" 문자열이 10번씩 출력 가능
//		hello();
		
		System.out.println("----------------");
		// 구구단 2단을 출력하는 gugudan() 메서드 호출
		gugudan();
		
		System.out.println("----------------");
		// 1 ~ 10 까지의 합을 출력하는 sum() 메서드 호출
		sum();
		
	} // main() 메서드 끝
	// 1. 전달인자가 없고, 리턴값도 없는 메서드 정의
	// => 리턴값이 없으므로 리턴타입은 void 라는 특수한 데이터타입을 명시
	//    (void 타입은 메서드 선언부에만 사용 가능한 타입이며, 리턴값이 없다는 의미)
	// => 전달인자가 없으므로, 매개변수는 아무것도 선언하지 않음
	// "Hello, World!" 문자열을 10번 출력하는 hello() 메서드 정의
	public static void hello() {
		// "Hello, World!" 문자열 10번 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " : Hello, World!");
		}
	} // hello() 메서드 끝
	
	// -------------------------------
	// 구구단 2단을 출력하는 gugudan() 메서드 정의
	public static void gugudan() {
		int dan = 2;
		
		System.out.println(" < " + dan + "단 >");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	} // gugudan() 메서드 끝
	
	// -------------------------------
	// 1 ~ 10 까지의 합을 출력하는 sum() 메서드 정의
	public static void sum() {
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		System.out.println("1 ~ 10 까지의 합 = " + total);
	}
	

} // Test 클래스 끝












