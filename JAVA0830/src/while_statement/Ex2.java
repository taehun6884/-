package while_statement;

public class Ex2 {

	public static void main(String[] args) {
		
		int i = 11;
		
		while(i <= 10) {
			System.out.println("hello, world");
			i++;
		}
		System.out.println("while문 종료 후 i = "+ i);
		
		System.out.println("==================================");
		
		i = 11;
		
		do {
			System.out.println(i+": hello, world");
			i++;
		}while(i <= 10);
		System.out.println("while문 종료 후 i = "+ i);
	
		
		
		
	}

}
