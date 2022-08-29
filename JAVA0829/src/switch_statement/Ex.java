package switch_statement;

public class Ex {

	public static void main(String[] args) {
		/*
		 * switch ~ case 문
		 * - if문과 유사하게 조건에 따른 실행 문장을 달리하는 조건문
		 * - if문과 달리 switch 문 조건식에 정수값, 문자열, Enum 상수 중 하나의 결과가 와야함.
		 * - case 문에는 조건식 판별 결과와 비교할 값을 사용하며
		 *   범위 지정이 불가능하고, 값만 사용 가능
		 *   => 조건식 결과와 일치하는 case 문의 :(콜론) 뒤에 있는 문장들을 차례대로 실행
		 * - case 문의 값은 중복될 수 없으며, 순서는 상관 없음
		 * 
		 * - break 문은 각 case 문의 영역을 구분하는 역할.
		 *   => 그러므로, 각 case 문의 마지막에 break 문을 빼먹는 실수를 하지않도록 주의!
		 * - case 문 실행 후 break 문을 사용하여 switch ~ case 문을 빠져나갈 수 있으며,
		 * 	 break 문이 없을 경우에는 조건과 상관없이 다음 case 문 또는 default 문을
		 *   모두 실행함(break 문을 만나거나 switch ~ case 문이 끝날때까지 실행)
		 *   
		 * - default 문은 if 문의 else 문과 동일한 역할 수행하며
		 * 	 일치하는 case 문이 없을 경우 default 문을 실행(default 문은 생략 가능)
		 * - default 문의 위치는 어디라도 상관없으나
		 *	 보통 마지막에 놓기 때문에 break 문을 쓰지 않아도 된다.
		 *
		 * - if문은 실행 시점에서 조건을 판별하여 실행할 문장이 결정되지만,
		 *   switch ~ case 문은 번역 시점에 실행할 문장이 결정됨.
		 * - if문이 switch ~ case 문보다 유연하므로
		 *   switch ~ case 문은 if문으로 100% 전환이 가능하지만
		 *   if문은 switch ~ case 문으로 전환이 불가능할 수 있다.
		 * 
		 * < 기몬 문법 >
		 * switch(조건식) {
		 * 		case 값1 : 
		 * 				// 조건식 결과가 값1 과 일치할 경우 실행할 문장들...
		 * 				[break;]
		 * 		case 값2 : 
		 * 				// 조건식 결과가 값1 과 일치할 경우 실행할 문장들...
		 * 				[break;]
		 * 		case 값n : 
		 * 				// 조건식 결과가 값n 과 일치할 경우 실행할 문장들...
		 * 				[break;]
		 * 		[default : // 조건식 결과가 값1 과 일치할 경우 실행할 문장들...]
		 * }
		 */
		
		int num = 4;
		
		// switch 문에 정수 또는 문자열 값이 아닌 값 또는 식이 올 경우 오류 발생!
//		switch(num == 0) {}
		
		switch(num) {
			case 1 : System.out.println("num = 1");
			case 2 : System.out.println("num = 2");
			case 3 : System.out.println("num = 3"); // num 이 3일 때 실행되는 문장
			case 4 : System.out.println("num = 4"); // break 문이 없으므로 실행되는 문장
//			default : System.out.println("num = 나머지"); // break 문이 없으므로 실행되는 문장
		}
		// => 각 case 문 뒤에 break 문이 없으므로 num 이 3일 때 case 3 의 문장 실행 후
		//    나머지 문장은 조건과 관계없이 아래쪽 방향으로 case 문과 default 문이 전부 실행됨
		
		System.out.println("-------------");
		
//		switch(num) {
//			case 1 : System.out.println("num = 1"); break;
//			case 2 : System.out.println("num = 2"); break;
//			case 3 : System.out.println("num = 3"); break;
//			case 4 : System.out.println("num = 4"); break;
//			default : System.out.println("num = 나머지");
//		}
		// => num 이 3일 때 case 3 문장 실행 후 break 문을 만나 switch ~ case 문 빠져나감(종료)
		// => num 이 1 ~ 4 외의 숫자일 때 default 문이 있으면 해당 문장을 실행한다!
	
		// 위의 코드와 완벽하게 동일(엔터키를 사용하여 각 문장 구분하면 가독성 향상)
		switch(num) {
			case 1 : 
				System.out.println("num = 1"); 
				break;
			case 2 : 
				System.out.println("num = 2"); 
				break;
			case 3 : 
				System.out.println("num = 3"); 
				break;
			case 4 : 
				System.out.println("num = 4"); 
				break;
			default : 
				System.out.println("num = 나머지");
		}
		
		System.out.println("-------------");
		// char 타입은 내부적으로 정수로 취급되므로 사용 가능(단, long 타입은 사용 불가)
		switch('B') {
			case 'K' : 
				System.out.println("KOREA");
				break;
			case 'B' :
				System.out.println("BRAZIL");
				break;
			case 'U' :
				System.out.println("USA");
		
		}
		
	
	}

}














