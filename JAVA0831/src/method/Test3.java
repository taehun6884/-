package method;

public class Test3 {

	public static void main(String[] args) {
		// 3. 전달인자만 있고, 리턴값은 없는 메서드 호출 연습
		// 문자열 1개를 전달하여 해당 문자열을 10번 반복 출력하는 print() 메서드 호출
		print("JAVA"); // "JAVA" 문자열 10번 출력
		print("홍길동"); // "홍길동" 문자열 10번 출력
		System.out.println("-----------");
		// ------------------------------------------------------
		// 정수 1개를 전달하여 전달한 정수값만큼 
		// "Hello, World!" 문자열을 출력하는 hello() 메서드 호출
		hello(10); // "Hello, World!" 문자열 10번 반복 출력
		hello(5); // "Hello, World!" 문자열 5번 반복 출력
		System.out.println("------------");
		
		// 정수 1개를 전달하여 전달한 정수에 해당하는 구구단을 출력하는 gugudan() 메서드 호출
		gugudan(2); // 구구단 2단 출력
		gugudan(5); // 구구단 5단 출력
		
	} // main() 메서드 끝

	// 3. 전달인자만 있고, 리턴값은 없는 메서드 정의 연습
	// 문자열 1개를 전달받아 해당 문자열을 10번 반복 출력하는 print() 메서드 정의
	public static void print(String str) { // 전달받은 문자열을 String 타입 변수 str 에 저장
		for(int i = 1; i <= 10; i++) {
			System.out.println(str);
		}
	} // print() 메서드 끝
	
	// ------------------------------------------------------	
	// 정수 1개를 전달받아 해당 정수값만큼 
	// "Hello, World!" 문자열을 출력하는 hello() 메서드 정의
	public static void hello(int count) {
		// 전달받은 반복 횟수(count)만큼 반복문으로 "Hello, World!" 출력
		// => 제어변수에서 사용되는 최대값을 전달받은 변수값(count)로 대체
		for(int i = 1; i <= count; i++) { // 외부에서 반복 횟수(count)를 결정
			System.out.println(i + " : Hello, World!");
		}
	} // hello() 메서드 끝
	
	// ------------------------------------------------------	
	// 정수 1개를 전달받아 전달받은 정수에 해당하는 구구단단을 출력하는 gugudan() 메서드 정의
	public static void gugudan(int dan) { // 외부에서 전달되는 단을 변수 dan 에 저장
		System.out.println(" < " + dan + "단 >");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	} // gugudan() 메서드 끝
	
} // Test3 클래스 끝











