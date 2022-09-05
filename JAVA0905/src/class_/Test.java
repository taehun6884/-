package class_;

public class Test {

	public static void main(String[] args) {
		// Person 클래스의 인스턴스(p) 생성
		// 이름 : 홍길동, 나이 : 20, 배고픔 : false 값 저장
		Person p = new Person();
		// 외부의 다른 클래스에서 Person 클래스의 인스턴스에 접근하기 위해서는
		// 참조변수 p를 통해 접근 필수!
		p.name = "홍길동";
		p.age = 20;
		p.isHungry = false;
		
//		System.out.println("이름 : " + p.name);
//		System.out.println("이름 : " + p.age);
//		System.out.println("이름 : " + p.isHungry);
		
		p.showPersonInfo();
		
		p.talk();
		p.eat("짬뽕");
				
		

	} // main() 메서드 끝

} // Test 클래스 끝

/*
 * Person 클래스 정의
 * [ 멤버변수(인스턴스변수) 선언]
 * - 이름(name, 문자열)
 *   나이(age, 정수)
 *   배고픔(isHungry, boolean)
 *   
 * [ 메서드 정의 ]
 * - 이름, 나이, 배고픔을 출력하는 showPersonInfo() 메서드
 *   (매개변수 없음, 리턴값 없음)
 *   
 * - 밥먹는 기능을 수행하는 eat() 메서드
 *   (매개변수 : 음식이름(foodName, 문자열), 리턴값 없음)
 *   => "XXX 먹기!" 출력
 *   => 멤버변수 isHungry 의 값을 false 로 변경
 *   
 * - 말하는 기능을 수행하는 talk() 메서드
 *   (매개변수 없음, 리턴값 없음)
 *   => "말하기!" 출력
 *   => 멤버변수 isHungry 의 값을 true 로 변경
 */

class Person {
	// 멤버변수(인스턴스 변수) 선언
	String name;
	int age;
	boolean isHungry; // true: 배고픔, false : 배고프지 않음
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("배고픔 : " + isHungry);
	}
	
	// 밥먹기 기능
	public void eat(String foodName) {
		System.out.println(foodName + " 먹기!");
		// isHungry 변수의 값을 false 로 변경(배고프지 않음)
		isHungry = false;
		System.out.println("식사 후 배고픔 : " + isHungry);
	}
	
	// 말하기 기능
	public void talk() {
		System.out.println("말하기!");
		// isHungry 변수의 값을 true 로 변경(배고픔)
		isHungry = true;
		System.out.println("말한 후 배고픔 : " + isHungry);
	}
	
	
}























