package method;

public class Test2 {

	public static void main(String[] args) {
		// 2. 전달인자가 없고, 리턴값만 있는 메서드 호출 연습
		// 1 ~ 10 까지의 합(55)을 계산하여 리턴하는 메서드 sum() 호출하여
		// 리턴되는 결과값을 변수에 저장하여 출력하거나 직접 출력
		int result = sum(); // sum() 메서드 호출 후 리턴값을 전달받아 result 변수에 저장
		System.out.println("1 ~ 10 까지의 합 = " + result);
		
		System.out.println("-----------------------------");
		
		// 자신의 이름을 리턴하는 getName() 메서드를 호출하여 리턴되는 이름을 전달받아 출력
		System.out.println("자신의 이름 : " + getName());
		
	} // main() 메서드 끝
	
	// 2. 전달인자가 없고, 리턴값만 있는 메서드 정의 연습
	// 1 ~ 10 까지의 합(55)을 계산하여 리턴하는 메서드 sum() 정의(직접 출력 X)
	// => 정수를 리턴하므로 리턴타입에 int 타입 명시
	public static int sum() {
		int total = 0;
		
		for(int i = 1; i <= 10; i++) {
			total += i;
		}
		
		// 누적변수 total 값을 return 문에 명시
		return total; // 리턴값(total 변수값 = 55)을 가지고 호출한 곳으로 돌아감
	} // sum() 메서드 끝
	
	// --------------------------------------------------------
	// 자신의 이름을 리턴하는 getName() 메서드 정의
	public static String getName() {
		return "이연태";
	}

} // Test2 클래스 끝















