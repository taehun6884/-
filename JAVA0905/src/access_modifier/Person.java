package access_modifier;

public class Person {
	//외부에서 멤버변수에 접근이 불가능하게함
	private String name;
	private int age = 20;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
	public void setName(String newName) {
		name = newName;
	}
	
	

}

	

