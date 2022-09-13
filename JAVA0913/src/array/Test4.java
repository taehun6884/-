package array;

public class Test4 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[i].length; j++) {
				// array 배열 내의 모든 요소를 누적변수 sum에 누적
				sum += array[i][j];
				count++;
			}
		}
		
		// 평균은 합계 계산이 완료된 후 계산하면 되기 때문에 for문 종료 후 계산
		avg = (double)sum / count;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
		/*
		 * 학생 이름을 1차원 배열(names)에 저장하고,
		 * 학생 점수를 2차원 배열(score)에 다음과 같이 저장 후 출력하시오.
		 *        < 학생 점수표 >
		 * 			국어	영어	수학
		 * 홍길동	  80	  70	  80
		 * 이순신	  90	  90	  90
		 * 강감찬	  50	  60	  77
		 * 김태희	 100	 100	 100
		 * 전지현	  80	  80	  60
		 * ----------------------------------------------
		 * 
		 */
		
		// 1차원 배열 names에 이름 저장
		String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
		
		// 2차원 배열 score에 점수 저장
		int[][] score = {
				{80, 70, 80},
				{90, 90, 90},
				{50, 60, 77},
				{100, 100, 100},
				{80, 80, 60}
		};
		
		System.out.println("==============================");
		
		// 국어, 영어, 수학 을 출력(적절하게 칸을 맞춤)
		System.out.print("      국어  영어  수학\n");
		
		// for문
		// => 점수를 저정한 2차원 배열의 행크기와 
		//    이름을 저장한 1차원 배열의 크기가 같다!
		//    행크기 반복문의 제어변수로 이름 인덱스 사용 가능!!
		for(int i = 0; i < score.length; i++) {
			
			System.out.print(names[i]);
			
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf(" %3d ", score[i][j]);
//				System.out.print(score[i][j]);
			}
			
			System.out.println();
		}
		
		
		
		/*
		 * 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		 * 변수 money 의 금액을 동전으로 바꿨을 때
		 * 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		 * 단, 가능한 한 적은 수의 동적으로 거슬러 주어야 한다.
		 * [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		 * 
		 * [ 출력 예시 ]
		 * money = 2680
		 * 500원 = 5
		 * 100원 = 1
		 *  50원 = 1
		 *  10원 = 3
		 */

	}

}









