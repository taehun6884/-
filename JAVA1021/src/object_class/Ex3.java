package object_class;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * toString() 메서드(public String toString() {})
		 * - 어떤 객체의 정보를 문자열로 변환하여 리턴
		 * - 기본적으로 Object 클래스의 toString() 메서드는
		 *   객체의 정보(= 주소값)을 문자열로 리턴하도록 정의되어 있음.
		 * - 일반적으로 객체의 정보는 객체 내의 멤버변수에 저장된 데이터(속성값)를
		 *   의미하므로 Object 클래스의 toString() 메서드를 오버라이딩하여
		 *   객체가 가진 멤버변수 값을 문자열로 결합하여 리턴하도록 해야함.
		 * - 출력문 내에서는 toString() 메서드 생략 가능(참조변수명만으로도 사용 가능)
		 * - 자바에서 제공하는 대부분의 클래스(API) 들은 toString() 메서드가
		 *   오버라이딩 되어 있으므로 객체에 저장된 값을 문자열로 리턴받기 가능
		 *   ex) String 클래스, ArrayList 클래스 등
		 * - equals() 메서드와 마찬가지로 단축키를 통한 자동 생성 가능
		 *   => Alt + Shift + S -> S
		 */
		
		String str = new String("자바"); // String 타입도 객체이다!
		System.out.println(str);
		
		A a = new A();
		System.out.println(a);

		Person p = new Person("홍길동", 20 , "031010-1234567");
		System.out.println("사람 p의 정보 "+ p.toString());
		System.out.println("사람 p의 정보 : "+p);
		
		String personInfo = p.toString();
		
		System.out.println("Person p 의 클래스명 : "+p.getClass().getName());
		System.out.println("Person p의 주소 값 : "+p.hashCode());
		
		Person2 p2 = new Person2("홍길동", 20 , "031010-1234567");
		System.out.println("사람 p2의 정보 "+ p2.toString());
		System.out.println("사람 p2의 정보 : "+p2);
		
		System.out.println("Person p2 의 클래스명 : "+p.getClass().getName());
		System.out.println("Person p2의 주소 값 : "+p.hashCode());
	}

}

class A { // extends Object
	
}

class Person {
	String name;
	int age;
	String jumin;
	
	
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	

}

class Person2 {
	String name;
	int age;
	String jumin;
	
	
	public Person2(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}


	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
}


