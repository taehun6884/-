package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * - 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자
		 * - 참조변수가 부모 객체를 참조하는지 자식 객체를 참조하는지를 판별할 수 있음.
		 * - 판별 결과가 true이면 형변환이 가능한 관계(업캐스팅 or 다운캐스팅)
		 *   판별 결과가 false 이면 절대로 형변환 불가
		 * - 우변의 클래스 타입과 같거나 우변 클래스 타입의 자식 타입 모두 가능
		 * - A is a B = A instanceof B
		 * - 판별 결과를 boolean 타입 변수에 저장하거나
		 *   if문에 판별하는 문장을 직접 사용 가능
		 *   
		 * < 기본 문법 >
		 * if(A instanceof B) { // A는 참조변수(객체), B는 클래스명(타입)
		 * 		// 형변환이 가능한 관계이므로 변환 수행
		 * } else {
		 * 		// 절대로 형변환이 불가능한 관계이므로 변환 수행 X
		 * }
		 */
		
		// 서브클래스(SmartPhone)의 인스턴스(sp)를 생성
		SmartPhone sp = new SmartPhone("갤럭시 z플립4", "010-1234-5678", "안드로이드");
		
		// 호출 가능한 메서드 : 3개
		sp.call();
		sp.sms();
		sp.kakaoTalk();
		
		// sp 는 SmartPhone 입니까? YES
		// sp is a SmartPhone?
		if(sp instanceof SmartPhone) {
			System.out.println("sp 는 SmartPhone 이다!");
			// sp를 SmartPhone 타입 변수에 저장이 가능하다!
			SmartPhone phone = sp;
		}
		
		System.out.println("-------------------------------------------");
		
		// 업캐스팅 가능 대상 확인
		// sp 는 HandPhone 입니까? YES (SmartPhone(sp) is a HandPhone)
		if(sp instanceof HandPhone) {
			System.out.println("sp는 HandPhone 이다!");
			System.out.println("그러므로 sp 를 HandPhone 으로 형변환이 가능하다!");
			
			// sp -> HandPhone 타입(hp) 으로 변환
			HandPhone hp = sp; // 업캐스팅 = 묵시적(자동) 형변환
			System.out.println("sp 는 HandPhone 이 가진 모든 기능을 포함한다!");
			System.out.println("따라서, 업캐스팅 이후에도 HandPhone 의 기능 사용 가능!");
			
			hp.call(); // HandPhone 의 기능인 전화기능과
			hp.sms(); // 문자 기능을 사용할 수 있으나
//			hp.kakaoTalk(); // SmartPhone 의 기능은 사용을 포기해야 한다!
		} else {
			System.out.println("sp 는 HandPhone 이 아니다!");
		}
		
		System.out.println("-------------------------------------------");
		
		// 다운캐스팅 가능 대상 확인
		// 슈퍼클래스 타입 인스턴스 생성
		HandPhone hp = new HandPhone("애니콜", "011-222-2222");
		
		// hp 는 SmartPhone 입니까? NO
		if(hp instanceof SmartPhone) {
			System.out.println("hp 는 SmartPhone 이다!");
		} else {
			System.out.println("hp 는 SamrtPhone 이 아니다!");
			System.out.println("그러므로 SmartPhone 으로 변환 불가능!");
			System.out.println("hp 는 SmartPhone 이 가진 기능을 모두 포함하지 못함!");
		}
		
		System.out.println("-------------------------------------------");
		
		// 다운캐스팅 가능 대상 확인(가능한 경우)
		// SmartPhone -> HandPhone 타입(hp2) 으로 업캐스팅
		HandPhone hp2 = new SmartPhone("갤럭시 z플립4", "010-1234-5678", "안드로이드");
		
		// 업캐스팅 후에는 참조 영역 축소로 접근 범위가 줄어들게 됨
		hp2.call();
		hp2.sms();
//		hp2.kakaoTalk(); // 접근 불가
		
		// hp2 는 SmartPhone 입니까? YES
		if(hp2 instanceof SmartPhone) {
			System.out.println("hp2 는 SmartPhone 이다!");
			System.out.println("그러므로 hp2 는 SmartPhone 으로 형변환 가능!");
			
//			SmartPhone sp2 = hp2; // 자동 형변환 불가능!
			SmartPhone sp2 = (SmartPhone)hp2; // 강제 형변환 필요
			System.out.println("sp2 는 SmartPhone 이 가진 모든 기능을 포함한다!");
			sp2.call(); // HandPhone 의 기능인 전화 기능과
			sp2.sms(); // 문자 기능을 사용할 수 있으며
			sp2.kakaoTalk(); // SmartPhone 의 기능도 다시 사용이 가능해진다!
			
		} else {
			System.out.println("hp2 는 SmartPhone 이 아니다!");
		}
		
		System.out.println("=============================================");
		
		// 서브클래스 Child 인스턴스(c) 생성
		Child c = new Child();
		
//		Parent p;
//		p = c; // Parent p = new Child(); 업캐스팅
//		p.parentPrn();		
		
		// Child -> Parent 자동형변환이 가능하지만 
		// 형변환을 바로 수행하지 않고, instanceof 연산자를 통해 검사 후 수행
		if(c instanceof Parent) {
			System.out.println("c 는 Parent 이다!");
			// 형변환 수행
			Parent p = c;
			p.parentPrn();
		} else {
			System.out.println("c 는 Parent 가 아니다!");
		}
		
//		Parent p2 = new Parent();
//		Child c2 = (Child)p2; // 강제 형변환
		// => 업캐스팅 후에 다운캐스팅이 아니라
		//    다운캐스팅을 바로 수행해서 논리적(실행)오류가 발생!
		
		Parent p2 = new Parent();
		// Parent -> Child 변환 가능 여부 판별 후 변환
		if(p2 instanceof Child) {
			System.out.println("p2 는 Child 이다!");
			// 형변환 수행
//			Child c2 = p2;
			Child c2 = (Child)p2;
			c2.parentPrn();
			c2.childPrn();
		} else {
			System.out.println("p2 는 Child 가 아니다!");
		}
	}

}

class HandPhone {
	String modelName;
	String phoneNumber;
	
	public HandPhone(String modelName, String phoneNumber) {
		super();
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}
	
	public void call() {
		System.out.println("전화 기능!");
	}
	
	public void sms() {
		System.out.println("문자 기능!");
	}
}

class SmartPhone extends HandPhone {
	String osName;

	// 모델명, 전화번호, 운영체제명을 전달받아 초기화를 하는 생성자 정의
	// => 모델명과 전화번호는 슈퍼클래스의 생성자를 통해 대신 초기화 수행
	public SmartPhone(String modelName, String phoneNumber, String osName) {
		super(modelName, phoneNumber);
		this.osName = osName;
	}
	
	public void kakaoTalk() {
		System.out.println("카톡 기능!");
	}
		
}

class Parent {
	// Parent 클래스의 멤버 : 1개(자신의 멤버)
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn()");
	}
}

class Child extends Parent {
	// Child 클래스의 멤버 : 2개(자신의 멤버 & 상속받은 멤버)
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
}




















