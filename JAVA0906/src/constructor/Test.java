package constructor;

public class Test {

	public static void main(String[] args) {
		Account ac = new Account();
		
		ac.accountNo = "555-55555-555";
		ac.ownerName = "이순신";
		ac.balance = 1000;
		
		ac.showAccountInfo();
		
	}

}


class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : "+accountNo);
		System.out.println("예금주명 : "+ownerName);
		System.out.println("현재잔고 : "+balance);
	}
	
	
	public Account() {
		System.out.println("Account 생성자 호출 됨!");
		accountNo ="111-11111-111";
		ownerName = "홍길동";
		balance = 10000;
		showAccountInfo();
	}
	
}
