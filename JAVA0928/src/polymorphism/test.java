package polymorphism;

public class test {
	
	public static void main(String[] args) {
		
		스마트폰 내폰 = new 스마트폰();
		
		내폰.전화();
		내폰.문자();
		내폰.카톡();
		
		System.out.println("------------------------");
		
		핸드폰 어머니폰 = new 핸드폰();
		
		어머니폰.전화();
		어머니폰.문자();
		
		System.out.println("------------------------");
		
		어머니폰 = 내폰;
		
		어머니폰.전화();
		어머니폰.문자();
		//어머니폰.카톡();
		
		스마트폰 동생폰 = new 스마트폰();
		어머니폰 = 동생폰;
		어머니폰.전화();
		어머니폰.문자();
		
		System.out.println("========================");
		
		어머니폰 = new 스마트폰();
		
		어머니폰.문자();
		어머니폰.전화();
		
		내폰 = (스마트폰)어머니폰;
		
		내폰.문자();
		내폰.전화();
		내폰.카톡();
		
	}
}



class 전화기 {
	
	public void 전화() {
		System.out.println("전화 걸기!");
	}
}


class 핸드폰 extends 전화기 {
	
	public void 문자() {
		System.out.println("문자 전송!");
	}
}

class 스마트폰 extends 핸드폰 {
	
	public void 카톡() {
		System.out.println("카톡 전송!");
	}
}