package while_statement;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 2. while 문
		 * - for문과 동일하나 초기식, 증감식의 위치가 유동적인 반복문(생략도 가능)
		 *   => 조건식의 위치만 고정
		 *   => 초기식은 while 문보다 윗쪽(앞쪽)에 위치해야하며
		 *      증감식은 while 문 안쪽에 위치하고, 내부에서의 위치는 유동적
		 * - for문은 주로 반복 횟수가 정해져있는 반복에 활용되는 반면
		 *   while문은 주로 반복 횟수가 정해져있지 않은(상황에 따른) 반복에 활용
		 *   단, 무조건 두 반복문의 역할이 고정되어 있는 것은 아니다!
		 * - for문과 while문은 100% 상호 변환이 가능
		 * 
		 * < 기본 문법 >
		 * [초기식;]
		 * 
		 * while(조건식) {
		 * 		[증감식;]
		 * 
		 * 		// 조건식 결과가 true 일 때 반복 실행할 문장들...
		 * 		
		 * 		[증감식;]
		 * }
		 */
		
		// for문을 사용하여 "Hello, World!" 문자열 출력 10번 반복
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " : Hello, World!");
		}
		
		System.out.println("-----------------");
		
		// while문을 사용하여 "Hello, World!" 문자열 출력 10번 반복
		int i = 1; // 초기식
		
		while(i <= 10) { // 조건식
			// 반복 실행할 문장
			System.out.println(i + " : Hello, World!");
			
			i++; // 증감식
		}
		
		System.out.println("================");
		
		// 제어변수 i가 1 ~ 10까지 1씩 증가하면서 i값 출력(1 2 3 4 5 6 7 8 9 10 출력)
		// 단, 위의 while 문 윗쪽에서 변수 i를 선언했으므로 변수값 변경을 통해 사용
		i = 1;
		
		while(i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		// 제어변수 i가 1 ~ 10까지 2씩 증가하면서 i값 출력(1 3 5 7 9 = 홀수 출력)
		i = 1;
		
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		// 제어변수 i가 2 ~ 10까지 2씩 증가하면서 i값 출력(2 4 6 8 10 = 짝수 출력)
		i = 2;
		
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		// 제어변수 i가 10 ~ 1까지 1씩 감소하면서 i값 출력(10 9 8 7 6 5 4 3 2 1)
		i = 10;
		
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
	}

}












