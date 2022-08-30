package for_statement;

public class Test_p {

	public static void main(String[] args) {
		
		/*
		 * 정수형 변수 visitCount가 0일 때,
		 * "처음 오셨군요. 방문해 주셔서 감사합니다."를 출력
		 * 
		 * visitCount와 상관없이 "방문횟수는 XX번 입니다." 출력하는 코드
		 * 
		 * < 출력결과 >
		 * visitcount = 0
		 * 
		 * 처음 오셨군요. 방문해 주셔서 감사합니다.
		 * 방문횟수는 0번 입니다.
		 * 
		 * visitcount = 5
		 * 방문횟수는 5번 입니다. 
		 * 
		 */
		
		// visitCount 변수 선언
		int visitCount = 5;
		
		// if문
		if(visitCount == 0) {
			// 조건이 참일 때 수행될 문장
			System.out.println("처음 오셨군요. 방문해 주셔서 감사합니다.");
		} 		
		
		// if문과 관계없이 항상 실행될 문장
//		System.out.println("방문횟수는 " + visitCount +"번 입니다.");
		System.out.printf("방문횟수는 %d번 입니다.\n", visitCount);
		
		System.out.println("====================================");
		
		/*
		 * 정수형 변수 num을 선언
		 * num의 값이 3의 배수 이거나 5의 배수 이면
		 * "3의 배수이거나 5의 배수 입니다." 를 출력
		 * 아니면 "3의 배수이거나 5의 배수가 아닙니다." 를 출력
		 */
		
		/*
		 * AND : 두 비교 연산 관계를 ~이고, ~이면서, 그리고 
		 * OR : ~ 이거나, 또는
		 */
		
		int num = 4;
		
		if(num % 3 == 0 || num % 5 == 0) {
			System.out.println("3의 배수이거나 5의 배수입니다.");
		} else {
			System.out.println("3의 배수이거나 5의 배수가 아닙니다.");
		}
		
		System.out.println("=======================================");
		
		/*
		 * 영문자인지 확인하는 코드
		 * if문 하나만 사용해서
		 * 영문자인지 아닌지 판별
		 * 영문자 a ~ z, A ~ Z
		 */
		
		// ch 변수 선언
		char ch = '[';
		
		// if문
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
//		if(ch >= 'A' && ch <= 'z') { // 91 ~ 96번 특수문자가 포함될 수 있음!
			// 영문자일 때
			System.out.println("영문자입니다.");
		} else {
			// 영문자가 아닐 때
			System.out.println("영문자가 아닙니다.");
		}
		
		
			

	}

}








