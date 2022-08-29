package if_statement;

public class Test3 {

	public static void main(String[] args) {
		// 연습 문제
		// 1. 정수형 변수 num 에 대한 양수, 음수, 0 판별(x : "양수" 형식으로 출력)
		int num = 0;
		
		if(num > 0) { // 양수
			System.out.println(num + " : 양수!");
		} else if(num < 0) { // 음수
			System.out.println(num + " : 음수!");
		} else { // 양수도 음수도 아닌 수 = 0
			System.out.println(num + " : 0!");
		}
		
		// -----------------------------------------------------------
		// 2. 정수형 변수 num 에 대한 홀수, 짝수, 0 판별
		num = 0;
		
		if(num % 2 == 1) { // 홀수
			System.out.println(num + " : 홀수!");
		} else if(num % 2 == 0) { // 짝수
			System.out.println(num + " : 짝수!");
		} else { // 홀수도 짝수도 아닌 수 = 0
			System.out.println(num + " : 0!");
		}
		// => 주의! 위의 코드는 0 도 짝수에 해당하는 블럭문이 실행됨(= 2로 나눈 나머지가 0이므로)
		//    따라서, 최소한 짝수 판별 코드와 0 판별 코드 중 0 판별 코드가 먼저 실행되어야 한다!
		//    (단, 홀수 판별 순서는 무관함)
		
		if(num % 2 == 1) { // 홀수
			System.out.println(num + " : 홀수!");
		} else if(num == 0) { // 0
			System.out.println(num + " : 0!");
		} else { // 홀수도 0 도 아닌 수 = 짝수
			System.out.println(num + " : 짝수!");
		}
		
		System.out.println("----------------------------");
		
		// 문자 ch 에 대해 영문 대소문자 판별
		// 1) 영문 대문자 : 'A'(65) ~ 'Z'(90) => 'A'(65) 이상이고 'Z'(90) 이하인 것
		// 2) 영문 소문자 : 'a'(97) ~ 'z'(122) => 'a'(97) 이상이고 'z'(122) 이하인 것
		
		// char 타입 변수 ch 에 영문자 'A' 저장
		char ch = '가';
		
		// 문자 ch 가 대문자인가? 'A'(65) 이상이고 'Z'(90) 이하인 것
		// => ~ 이고, 그리고 등의 접속사는 AND 연산자 && 로 연산을 표기
//		if(ch >= 'A' && ch <= 'Z') { // 대문자 판별(ch >= 65 && ch <= 90 과 동일한 코드)
//			System.out.println(ch + " : 대문자!");
//		} else {
//			System.out.println(ch + " : 대문자 아님!");
//		}
		
		if(ch >= 'A' && ch <= 'Z') { // 대문자 판별(ch >= 65 && ch <= 90 과 동일한 코드)
			System.out.println(ch + " : 대문자!");
		} else if(ch >= 'a' && ch <= 'z') { // 소문자 판별(ch >= 97 && ch <= 122 와 동일한 코드)
			System.out.println(ch + " : 소문자!");
		} else { // 영문자(대문자, 소문자)가 아닐 경우
			System.out.println(ch + " : 영문자 아님!");
		}
		
		System.out.println("----------------");
		
		ch = 'r';
		System.out.println("원본 문자 ch = " + ch);

		// 대문자일 경우 소문자로 변환하여 출력, 소문자일 경우 대문자로 변환하여 출력
		// 1) 영문 대문자 : 'A'(65) ~ 'Z'(90) => 'A'(65) 이상이고 'Z'(90) 이하인 것
		// 2) 영문 소문자 : 'a'(97) ~ 'z'(122) => 'a'(97) 이상이고 'z'(122) 이하인 것
		if(ch >= 'A' && ch <= 'Z') { // 대문자 판별(ch >= 65 && ch <= 90 과 동일한 코드)
			// 대문자 ch 값을 소문자로 변환하여 출력(대문자 + 32 = 소문자)
//			ch = ch + 32; // char + int = int 로 변환되므로 강제 형변환 필수!
//			ch = (char)(ch + 32); // 강제형변환
			
			// 강제 형변환 없이 32 만큼 증가시키는 방법(확장 대입연산자 사용)
			ch += 32;
			System.out.println("소문자 변환 후 ch = " + ch);
		} else if(ch >= 'a' && ch <= 'z') { // 소문자 판별(ch >= 97 && ch <= 122 와 동일한 코드)
			// 소문자 ch 값을 대문자로 변환하여 출력(소문자 - 32 = 대문자)
			ch -= 32;
			System.out.println("대문자 변환 후 ch = " + ch);
		} else { // 영문자(대문자, 소문자)가 아닐 경우
			System.out.println(ch + " : 영문자 아님!");
		}
		
		
		System.out.println("-------------------------------");
		
		int pee = 50000; // 기본 입장료
		int age = 65; // 나이
		
		// 나이에 따른 입장료 할인 조건 판별하여 입장료 계산
		// 조건1. 5세 미만 이거나 65세 이상일 경우 입장료 50% 할인("xx 세 : 50% 할인" 출력)
		// 조건2. 5세 이상 ~ 19세 이하일 경우 입장료 30% 할인("xx 세 : 30% 할인" 출력)
		// 조건3. 그 외 입장료 할인 없음("xx 세 : 할인 없음" 출력)
		if(age < 5 || age >= 65) {
			// 입장료 50% 할인 적용
//			pee = pee * 0.5; // int * double = double 이므로 int 타입 강제형변환 필요
//			pee = (int)(pee * 0.5);	// 강제 형변환
			pee *= 0.5; // 형변환 없이 사용 가능
			System.out.println(age + " 세 : 50% 할인!");
		} else if(age >= 5 && age <= 19) {
			// 입장료 30% 할인 적용
			pee *= 0.7;
			System.out.println(age + " 세 : 30% 할인!");
		} else {
			System.out.println(age + " 세 : 할인 없음!");
		}
		
		System.out.println("놀이동산 입장료 : " + pee + "원");
		System.out.println("-----------------------------------");
		/*
		 * 학생 점수(score) 에 대한 학점(grade) 판별
		 * A학점 : 90 ~ 100점
		 * B학점 : 80 ~ 89점
		 * C학점 : 70 ~ 79점
		 * D학점 : 60 ~ 69점
		 * F학점 : 0 ~ 59점
		 * 그 외 : "점수 입력 오류"
		 */
		
		int score = 89; // 점수
		String grade = ""; // 학점
		
//		// if ~ else if 문을 사용하여 점수에 따른 학점을 계산 후 grade 변수에 저장
//		if(score >= 90 && score <= 100) { // A학점
//			grade = "A";
//		} else if(score >= 80 && score <= 89) { // B학점
//			grade = "B";
//		} else if(score >= 70 && score <= 79) { // C학점
//			grade = "C";
//		} else if(score >= 60 && score <= 69) { // D학점
//			grade = "D";
//		} else if(score >= 0 && score <= 59) { // F학점
//			grade = "F";
//		} else { // 그 외
//			grade = "점수 입력 오류!";
//		}
//		
//		System.out.println("점수 : " + score + ", 학점 : " + grade);
		
		
		// 점수가 정상 범위(0 ~ 100) 일 때와 아닐 때(오류일 때) 판별
		score = 99;
		// 중첩 if 문을 사용하는 경우
		if(score >= 0 && score <= 100) {
			// if ~ else if 문을 사용하여 점수에 따른 학점을 계산 후 grade 변수에 저장
			// 첫번째 if 문에서 0 ~ 100 사이를 판별했으므로
			// if문 블록 내의 A학점은 90점 이상만 판별해도 자동으로 100점 이하가 적용됨
			if(score >= 90) { // A학점(&& score <= 100 코드 생략)
				grade = "A";
			} else if(score >= 80) { // B학점(&& score <= 89 코드 생략)
				grade = "B";
			} else if(score >= 70) { // C학점(&& score <= 79 코드 생략)
				grade = "C";
			} else if(score >= 60) { // D학점(&& score <= 69 코드 생략)
				grade = "D";
			} else { // F학점
				// 기본 0 ~ 100 사이, A ~ D 학점 판별 후 남은 점수는
				// 자동으로 0 ~ 59 사이가 되므로 마지막 else if 문은 else 문으로 대체 가능
				grade = "F";
			} 
			
			System.out.println("점수 : " + score + "점, 학점 : " + grade);
		} else {
			System.out.println(score + "점 : 점수 입력 오류!");
		}
		
		
		
	}

}











