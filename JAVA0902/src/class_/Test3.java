package class_;

public class Test3 {

	public static void main(String[] args) {
		Person2 pe = new Person2();
		pe.age = 17;
		pe.name = "김태훈";
		pe.isHungry =true;
		
		
		pe.showPersnInfo();
		
		System.out.println("==============================");
		
		pe.eat("스카치에그");
	
		System.out.println("=================================");
		
		pe.talk();
	}
}


class Person2{
	String name;
	int age;
	boolean isHungry;
	
	public void showPersnInfo() {
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("배고픈 상태:"+isHungry);
	}

	public void eat(String foodName) {
		isHungry = false;
		System.out.println(foodName+"먹기!");
		System.out.println("배고픈 상태:"+isHungry);
	}
	
	public void talk() {
		isHungry = true;
		System.out.println("배고픈 상태:"+isHungry);
		System.out.println("말하기!");
	}
	
}