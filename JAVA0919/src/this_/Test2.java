package this_;

public class Test2 {

	public static void main(String[] args) {
		// 레퍼런스 this, 생성사 this() 복습
		Account acc = new Account();
		acc.showAccountInfo();
		
		Account acc2 = new Account("999-9999-999");
		acc2.showAccountInfo();
		
		Account acc3 = new Account("999-9999-999", "이순신");
		acc3.showAccountInfo();
		
		Account acc4 = new Account("999-9999-999", "이순신", 1000);
		acc4.showAccountInfo();
		
		

	}

}

// Account 클래스(계좌번호, 예금주명, 현재잔고) 정의
// => 기본생성자 (111-1111-111, 홍길동, 0)
//    계좌번호 전달받아 초기화하는 생성자
//    계좌번호, 예금주명 전달받아 초기화하는 생성자
//    계좌번호, 예금주명, 현재잔고까지 전달받아 초기화는 생성자
//    (초기화작업을 수행하는 생성자)    
// => 레퍼런스 this 와 생성자 this()

class Account {
	// 멤버변수(인스턴스 변수)
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		this("111-1111-111", "홍길동", 0);
//		accountNo = "111-1111-111";
//		ownerName = "홍길동";
//		balance = 0;
	}

	public Account(String accountNo) {
		this(accountNo,"홍길동",0);
//		this.accountNo = accountNo;
//		ownerName = "홍길동";
//		balance = 0;
	}

	public Account(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		balance = 0;
	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	
	
}







