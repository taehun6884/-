package class_;

public class Test2 {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.accountNo = "111-11111-111";
		ac.ownerName = "김태훈";
		ac.balance = 100000;
	
		
		ac.showAccountInfo();
		
		System.out.println("=======================");
		
		ac.deposit(10000);
		
		System.out.println("=========================");
		
		int result = ac.withdraw(120000);
		
		System.out.println("출금된 금액 : "+result);
		
	}

}

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : "+accountNo);
		System.out.println("예금주명 : "+ownerName );
		System.out.println("현재잔고 : "+balance);
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금하신 금액 : "+amount);	
		System.out.println("입금 후 현재잔고 : "+balance);
	}

	public int withdraw(int amount) {
		System.out.println("출금 할 금액 : "+amount);
		if(balance >= amount) {
			balance -= amount;
			System.out.println("출금 후 현재잔고 : "+balance);
		}else {
			System.out.println("잔고가 부족하여 출금이 불가능합니다!");
			System.out.println("현재잔고 : "+balance);
			amount = 0;
		}
		return amount;
	}
}



