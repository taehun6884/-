package constructor;

public class Ex {

	public static void main(String[] args) {


	
	System.out.println("Person 인스턴스 생성 전");
	Person p = new Person(); //Person 인스턴스 생성
	// =>enw 키워드에 의해 인스턴스가 생성 될 때
	// Person() 형태의 생성자를 자동으로 호출하게 된다!
	
	System.out.println("Person 인스턴스 생성 후");
//	p.name = "홍길동";
//	p.age = 20;
	System.out.println("이름 : "+p.name);
	System.out.println("나이 : "+p.age);
	
	Person p2 = new Person();
	
	p2.name ="이순신";
	p2.age = 4;
	
	System.out.println("이름 : "+p2.name);
	System.out.println("나이 : "+p2.age);
	}

}



class Person{
	//멤버 변수
	String name;
	int age;
	
	//클래스 정의 시 개발자 별도의 생성자를 하나도 정의하지 않을 경우
	//자바 컴파일러에 의해 기본 생성자가 자동으로 생성됨
	// = > 기본 생성자는 접근 제한자가 클래스와 같고,
	// 리턴타입이 없으며,이름은 클래스명과 같다
	// 또한,매개변수가 없으며 중관호 블로{} 내에 수행할 코드가 없다
	
//	public Person() {  //기본생성자(defalut Constructor)
//	}
	
//	public Person() {
//		System.out.println("생성자 Person() 호출됨!");
//		
//	}
	
	public Person(){
		System.out.println("생성자 Person() 호출됨");
		
		name = "홍길동";
		age = 20;
	}
	
	
}