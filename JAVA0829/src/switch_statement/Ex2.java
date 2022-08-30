package switch_statement;

public class Ex2 {

	public static void main(String[] args) {
		// break 문을 의도적으로 생략하여 문장을 간소화시키는 방법
		// => switch-case 문 특성상 break 문을 생략하면
		//    case 문 실행 후 다음 break 문을 만나거나 switch 문이 종료될 때까지
		//    아래쪽의 모든 case 와 default 문을 차례대로 실행한다!
		// => 따라서, 이러한 특성을 활용하면 동일한 작업을 수행하는 여러 case 문을
		//    하나로 묶어 코드 중복을 제거할 수 있다!
		
		// 월(month)을 입력받아 해당 월의 일수(날짜)를 출력하는 switch 문 작성
		// ex) 1 입력 시 "1월은 31일까지입니다!" 출력
		//     3 입력 시 "3월은 31일까지입니다!" 출력
		//     6 입력 시 "6월은 30일까지입니다!" 출력
		// => 1, 3, 5, 7, 8, 10, 12월 : 31일
		//    4, 6, 9, 11월 : 30일
		//    2월 : 28일
		int month = 1;
		
//		switch(month) {
//			case 1 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 2 : System.out.println(month + "월은 28일까지입니다!"); break;
//			case 3 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 4 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 5 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 6 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 7 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 8 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 9 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 10 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 11 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 12 : System.out.println(month + "월은 31일까지입니다!"); break;
//		}
		
		// case 문의 순서는 무관하므로 관련 있는 case 문들끼리 모을 수 있다!
//		switch(month) {
//			case 1 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 3 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 5 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 7 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 8 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 10 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 12 : System.out.println(month + "월은 31일까지입니다!"); break;
//			case 4 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 6 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 9 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 11 : System.out.println(month + "월은 30일까지입니다!"); break;
//			case 2 : System.out.println(month + "월은 28일까지입니다!");
//		}
		
		// break 문의 특성을 활용하여 동일한 작업을 수행하는 case 문들의 코드 중복 제거
		month = 9;
		switch(month) {
			case 1 : // 1, 3, 5, 7, 8, 10, 12월은
			case 3 : // 실행할 코드가 완전하게 동일하므로
			case 5 : // 마지막 12월을 제외한 나머지는 case 문에 아무 문장도 기술하지 않고
			case 7 : // break 문도 생략한 상태로 12월의 case 문까지 진행하도록 한 후
			case 8 : // 마지막 12월에만 실행할 문장과 break 문을 기술하여
			case 10 : // 동일한 작업을 12월에서 모두 처리하도록 하면 코드 중복 제거 가능하다!
			case 12 : System.out.println(month + "월은 31일까지입니다!"); break;
			case 4 : 
			case 6 : 
			case 9 : 
			case 11 : System.out.println(month + "월은 30일까지입니다!"); break;
			case 2 : System.out.println(month + "월은 28일까지입니다!");
		}
		
		
		int score = 100;
		String grade = "";
		
		if(score >= 0 && score <= 100) {
			switch(score / 10) { // 점수를 10으로 나눈 몫 = 점수의 십의자리 숫자(= X0 점대)
				case 10 : 
				case 9 : grade = "A"; break;
				case 8 : grade = "B"; break;
				case 7 : grade = "C"; break;
				case 6 : grade = "D"; break;
				default : grade = "F"; 
			}
			
			System.out.println("점수 : " + score + ", 학점 : " + grade);
		} else {
			System.out.println(score + " : 점수 입력 오류!");
		}
		
	}

}











