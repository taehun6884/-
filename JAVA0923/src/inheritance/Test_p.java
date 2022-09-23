package inheritance;

public class Test_p {

	public static void main(String[] args) {
		Student st = new Student();
		st.name = "홍길동";
		System.out.println("=======================");
		
		Student st2 = new Student("이순신",24,true,true);
		
		st2.eat();
		st2.sleep();
		st2.study();
		
	}

}


class Person {
	String name;
	int age;
	boolean isHungry;

	public Person() {
		System.out.println("Person()생성자 호출됨!");
	}
	
	public void eat() {
		System.out.println("밥먹기!");
	}

	public void sleep() {
		System.out.println("잠자기!");
	}
}

class Student extends Person{
	boolean isStudyMode;

	public Student() {
		System.out.println("Studnet() 생성자 호출됨!");
	}
	
	public Student(String name,int age,boolean isHungry,boolean isStudyMode) {
		this.name = name;
		this.age = age;
		this.isHungry = isHungry;
		this.isStudyMode = isStudyMode;
		System.out.println("(String int boolean boolean) 생성자 호출됨!");
	}
	
	public void study() {
		System.out.println("공부하기!");
	}
}
