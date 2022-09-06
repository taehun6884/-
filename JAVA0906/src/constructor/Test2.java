package constructor;

public class Test2 {

	public static void main(String[] args) {

		Account2 ac2 = new Account2("111-11111-111", "홍길동", 1000);
	}

}


class Account2{
	String accounNo;
	String owenrName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : "+ accounNo);
		System.out.println("예금주명 : "+ owenrName);
		System.out.println("예금 : "+balance);
	}

	public Account2(String newAccounNo, String newOwenrName, int newBalance) {
		System.out.println("Account2(String,String,int) 생성자 호출된다!");
		accounNo = newAccounNo;
		owenrName = newOwenrName;
		balance = newBalance;
		showAccountInfo();
	}
	

	
}
