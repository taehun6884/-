package static_member;

public class Test4 {

	public static void main(String[] args) {
		
		// 생성된 인스턴스를 리턴 받기
		Account acc = Account.getInstance();
				
		// Setter 메서드를 호출하여 계좌번호 저장, showAccountInfo() 메서드로 출력
		acc.setAccountNo("111-1111-111");
		acc.showAccountInfo();

	}

}

class Account {
	
	// 1. 자신의 인스턴스를 생성하여 자신의 클래스 타입 변수 instance 에 저장
	//    => private static
	private static Account instance = new Account();
	// 2. 기본 생성자를 정의 => private 선언
	private Account() {}
		
	// 3. Getter 정의 => public static 선언
	public static Account getInstance() {
		return instance;
	}
	
	
	// =======================================================
	// 접근제한자가 private인 accountNo 변수 선언
	private String accountNo;
	
	
	// accountNo에 대한 Getter/Setter 메서드 정의
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	// showAccountInfo() 메서드 정의
	// => 출력형태 (계좌번호 : 111-1111-111)
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
	}
	
	
}
