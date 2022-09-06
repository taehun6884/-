package constructor;

public class Ex2 {

	public static void main(String[] args) {
		
//		Person2 p = new Person2("홍길동",20);
//		p.showPersonInfo();
//		
//		Person2 p2 = new Person2("이순신",44);
//		p2.showPersonInfo();
		
		Person2 p3 = new Person2();
	}
}




class Person2{
	// 멤버변수 선언
	String nation;
	String name;
	int age;
	
	
	public Person2() {}
//	
//	public Person2(String newName,int newAge) {
//		System.out.println("Person(String,int) 생성자 호출됨!");
//		
//		name = newName;
//		age = newAge;
//		
//		nation = "대한민국";
//	}
	
	
	
	// 파라미터 생성자 자동 생성 단축키 : Alt + Shift + S -> O
	
	
	
	
	public void showPersonInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("나이 : "+ age);
		System.out.println("국가 : "+ nation);
	}

	public Person2(String nation, String name, int age) {
		super();
		this.nation = nation;
		this.name = name;
		this.age = age;
	}


}