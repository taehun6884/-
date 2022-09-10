package method_overloading;

public class Test {

	public static void main(String[] args) {
		// PrintOverloading 인스턴스 생성
		PrintOverloading po = new PrintOverloading(); 
		
		// 참조변수명.메서드() 활용
		po.print(1);
		po.print(3.14);
		po.print("홍길동");
		po.print();
		
		System.out.println("===============================");
		
		Calculator c = new Calculator();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10, 20, 30, 40);
		
		c.cal('+', 10, 20);
		c.cal('+', 10, 20, 30);
		c.cal('+', 10, 20, 30, 40);
		
		c.cal('-', 100, 10);
		c.cal('-', 100, 10, 20);
		c.cal('-', 100, 10, 20, 30);
		
		

	}

}

/*
 * 계산기(Calculator) 클래스 정의
 * - 정수를 전달받아 덧셈만 수행하는 add() 메서드 정의
 * 1. 정수 2개를 전달받아 덧셈 결과 출력
 * 2. 정수 3개를 전달받아 덧셈 결과 출력
 * 3. 정수 4개를 전달받아 덧셈 결과 출력
 */

class Calculator {
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	public void add(int num1, int num2, int num3, int num4) {
		System.out.println(num1 + num2 + num3 + num4);
	}
	
	/*
	 * 연산자에 해당하는 연산을 수행하는 cal() 메서드 정의
	 * c.cal('+', 10, 20) => 10 + 20 = 30 출력
	 * c.cal('+', 10, 20, 30) => 10 + 20 + 30 = 60 출력
	 * c.cal('+', 10, 20, 30, 40) => 10 + 20 + 30 + 40 = 100 출력
	 * 
	 * c.cal('-', 100, 10) => 100 - 10 = 90 출력
	 * c.cal('-', 100, 10, 20) => 100 - 10 - 20 = 70 출력
	 * c.cal('-', 100, 10, 20, 30) => 100 - 10 - 20 - 30 = 40 출력
	 */
	
	public void cal(char opr, int num1, int num2) {
		if(opr == '+') { // 덧셈일 경우
//			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		} else if(opr == '-') { // 뺄셈일 경우
			System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		}
	}
	
	public void cal(char opr, int num1, int num2, int num3) {
		if(opr == '+') { // 덧셈일 경우
//			System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
			System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, num1 + num2 + num3);
		} else if(opr == '-') { // 뺄셈일 경우
			System.out.printf("%d - %d - %d = %d\n", num1, num2, num3, num1 - num2 - num3);
		}
	}
	
	public void cal(char opr, int num1, int num2, int num3, int num4) {
		if(opr == '+') { // 덧셈일 경우
//			System.out.println(num1 + " + " + num2 + " + " + num3 + " + " + num4 + " = " + (num1 + num2 + num3 + num4));
			System.out.printf("%d + %d + %d + %d = %d\n", num1, num2, num3, num4, num1 + num2 + num3 + num4);
		} else if(opr == '-') { // 뺄셈일 경우
			System.out.printf("%d - %d - %d - %d = %d\n", num1, num2, num3, num4, num1 - num2 - num3 - num4);
		}
	}
	
}


/*
 * 정수, 실수, 문자열 데이터 1개를 전달받아 출력하는 print() 메서드 오버로딩
 * 파라미터가 없는 메서드도 생성 => "줄바꿈" 출력
 */

class PrintOverloading {
	public void print(int data) {
		System.out.println(data);
	}
	
	public void print(double data) {
		System.out.println(data);
	}
	
	public void print(String data) {
		System.out.println(data);
	}
	
	public void print() { // 파라미터가 없는 메서드도 오버로딩에 해당됨
		System.out.println("줄바꿈");
	}
	
	
}
