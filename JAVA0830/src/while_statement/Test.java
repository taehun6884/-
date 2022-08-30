package while_statement;

public class Test {

	public static void main(String[] args) {
		/*
		 * while문을 사용하여 특정 단에 해당하는 구구단 출력
		 *  < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 */
//		int dan = 2;
//		int i = 1;
		
		int dan = 2, i = 1;
		
		System.out.println(" < " + dan + "단 >");
		
		while(i <= 9) {
//			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		
		System.out.println("==================================");
		
		// while문을 사용하여 1 ~ 10 까지 정수의 합(sum) 계산 후 출력
		int sum = 0;
		i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1 ~ 10 까지 정수의 합 = " + sum);
		
		System.out.println("-------------------------------------");
		
		// 1 ~ 10 까지 정수 중, 짝수의 합(evenTotal)과 홀수의 합(oddTotal)을 각각 계산
		int evenTotal = 0, oddTotal = 0;
		i = 1;
		
		while(i <= 10) {
			// 홀수와 짝수 판별
			if(i % 2 == 1) { // 홀수
				// i값을 홀수의 합(oddTotal)에 누적
				oddTotal += i;
			} else { // 짝수
				// i값을 짝수의 합(evenTotal)에 누적
				evenTotal += i;
			}
			
			// 홀수, 짝수 공통으로 i값을 증가시키는 증감식
			i++;
		}
		
		System.out.println("1 ~ 10 까지 홀수의 합 = " + oddTotal); // 25
		System.out.println("1 ~ 10 까지 짝수의 합 = " + evenTotal); // 30
		
	}

}













