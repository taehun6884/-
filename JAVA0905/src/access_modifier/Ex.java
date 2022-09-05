package access_modifier;

public class Ex {

	public static void main(String[] args) {
		//person 클래싀의 인스트턴스 생성
		Person p = new Person();
		
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		p.setName("홍길동");
		System.out.println("이름 :"+p.getName());
	}

}