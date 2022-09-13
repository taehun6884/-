package array;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * numbers = { 3, 2, 14, 21, 100, 4, 2, 1}
		 * int max, int min, int sum, int agv;
		 * 
		 * 출력결과
		 * 
		 * 최대값 : 
		 * 최소값 : 
		 * 합계 : 
		 * 평균 : 
		 */
		
		// 배열 선언 및 초기화
		int[] numbers = {3, 2, 14, 21, 100, 4, 2, 1};
		
		// 변수 선언 및 초기화
		int max = numbers[0];
		int min = numbers[0];
		int sum = 0;
		double avg = 0.0;
				
		// 반복문, 조건문
		for(int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
			if(max < numbers[i]) {
				max = numbers[i];
			}
			
			if(min > numbers[i]) {
				min = numbers[i];
			}
			
			sum += numbers[i];
		}
		
//		sum += numbers[0];
		
		avg = (double)sum / numbers.length;
		
		// 출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}










