package polymorphism;

public class Ex {

	public static void main(String[] args) {
		// 캐스팅 복습
		디젤차 d = new 디젤차();
		d.drive();
		
		System.out.println("-----------------------");
		
		전기차 l = new 전기차();
		l.drive();
		
		System.out.println("-----------------------");
		
		자동차 c = d; // 자동차 c = new 디젤차();
		c.drive();
		
		c = l; // 자동차 c = new 전기차();
		c.drive();
				
	}

}

class 자동차 {
	public void drive() {
		System.out.println("운전하다");
	}
}

class 디젤차 extends 자동차 {

	@Override
	public void drive() {
		System.out.println("디젤차를 운전하다");
	}
	
}

class 전기차 extends 자동차 {

	@Override
	public void drive() {
		System.out.println("전기차를 운전하다");
	}
	
}





