package switch_statement;

public class Test {

	public static void main(String[] args) {
		// if문을 사용하여 점수(score) 에 따른 학점(grade) 계산 후 출력
		int score = 99; // 점수
		String grade = ""; // 학점
		
		// if ~ else if 문을 사용하여 점수에 따른 학점을 계산 후 grade 변수에 저장
		if(score >= 90 && score <= 100) { // A학점
			grade = "A";
		} else if(score >= 80 && score <= 89) { // B학점
			grade = "B";
		} else if(score >= 70 && score <= 79) { // C학점
			grade = "C";
		} else if(score >= 60 && score <= 69) { // D학점
			grade = "D";
		} else if(score >= 0 && score <= 59) { // F학점
			grade = "F";
		} else { // 그 외
			grade = "점수 입력 오류!";
		}
		
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
		// ------------------------------------------------------------
		// switch ~ case 문을 사용하여 학점 계산을 수행할 경우 문제점
		// => case 문에서 값 지정 시 범위 지정이 불가능!
//		switch(score) {
//			case 100 : grade = "A"; break;
//			case 99 : grade = "A"; break;
//			case 98 : grade = "A"; break;
//			// ... 생략 ...
//			case 89 : grade = "B"; break;
//			case 88 : grade = "B"; break;
//			// ... 생략 ...
//			case 0 : grade = "F"; break;
//			default : grade = "점수 입력 오류!";
//		}
		// => 각 case 문에 필요한 점수를 각각 별도로 기술하여 학점 계산 해야함 => 비효율적
		
		score = 101; // 점수
		
		if(score >= 0 && score <= 100) {
			switch(score / 10) { // 점수를 10으로 나눈 몫 = 점수의 십의자리 숫자(= X0 점대)
				case 10 : grade = "A"; break;
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

















