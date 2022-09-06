package method;

public class Test4 {

	public static void main(String[] args) {
		// 4. 전달인자도 있고, 리턴값도 있는 메서드 호출
		// 정수 1개(x)를 전달하면 1 ~ x 까지의 합을 리턴하는 sum() 메서드 호출
		// => 리턴되는 합계를 전달받아 출력
		// ex) sum() 메서드에 10 전달 시 1 ~ 10 까지의 합 55 리턴
		
		
		
		
		
		// 정수 1개를 전달하면 홀수 짝수 0울 판별하여 ㄹ턴하는 check()메서드 호출
		// => 리턴되는 결과값을 전달 받아 출력
		String result =check(2);
		System.out.println(result);
		//정수 2개를 전달하면 두 수 중 더 큰 수를 리턴하는 max()메서드 호출
		//ex)10,20 전달할 시 20이 리턴됨
		//단,같은 경우 아무 숫자나 리턴(자거나 같다 도는 크커나 같다고 판별)
		int result2 = max(10,20);
		System.out.println(result2);
	
	} // main() 메서드 끝
	
	// 4. 전달인자도 있고, 리턴값도 있는 메서드 정의
	// 정수 1개를 전달받아 변수 num 에 저장 후 
	// 1 ~ num 까지의 합을 계산 후 리턴하는 sum() 메서드 정의
		
	// 정수 1개를 전달하면 홀수 짝수 0울 판별하여 ㄹ턴하는 check()메서드 호출
	// => 리턴되는 결과값을 전달 받아 출력

	public static String check(int a) {
		
//		String result ="";
//		
//		if(a==0) {
//			result = "0";
//		}else if(a%2==0) {
//			result = "짝수";
//		}else {
//			result = "홀수";
//		}
//		return result;
		
		
		if(a==0) {
			return "0";
		}else if(a%2==0) {
			return "짝수";
		}else {
			return "홀수";
		}

	}

	//정수 2개를 전달하면 두 수 중 더 큰 수를 리턴하는 max()메서드 호출
	//ex)10,20 전달할 시 20이 리턴됨
	//단,같은 경우 아무 숫자나 리턴(자거나 같다 도는 크커나 같다고 판별)

	public static int max(int a,int b) {
		
//		if(a >= b) {
//			
//			return a;
//		}else if(b>=a) {
//			return b;
//		}
		
		if(a > b) {//a가 b보다 클경우
			return a;
		}else{ // b가 a보다 크거나 같을 경우
			return b;
		}
	}

} // Test4 클래스 끝











