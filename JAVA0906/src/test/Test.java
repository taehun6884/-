package test;

public class Test {

	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountNo("111-11111-111");
		ac.setOwnerName("홍길동");
		ac.setBalance(10000);
		
		System.out.println("계좌번호 : "+ac.getAccountNo());
		System.out.println("예금주명 : "+ac.getOwnerName());
		System.out.println("현재잔고 : "+ac.getBalance());
	}

}


class Account{
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
//	public String getAccountNO() {
//		return accountNo;
//	}
//	
//	public String getOwnerName() {
//		return ownerName;
//	}
//
//	public int getBalance() {
//		return balance;
//	}
//
//	public void setAccountNo(String getaccountNo) {
//		accountNo = getaccountNo;
//	}
//	
//	public void setOwnerName(String getownerName) {
//		ownerName = getownerName;
//	}
//
//	public void setBalance(int getbalance) {
//		balance = getbalance;
//	}
	
	
	
	
	
	
}