package object_class;

public class Test3 {
	
	public static void main(String[] args) {
		Account acc = new Account("1234567-1234567","홍길동" , 300000);
		Account acc2 = new Account("1234567-1234567", "김길수", 20000);
		
		if(acc.equals(acc2)) {
			System.out.println("계좌정보가 같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println(acc);
		
	}
}



class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	@Override
	public boolean equals(Object obj) {
		
//		if(obj instanceof Account) {
//			
//			Account account = (Account)obj;
//			
//			if(accountNo.)
//			
//		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
}