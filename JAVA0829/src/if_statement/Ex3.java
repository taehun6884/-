package if_statement;

public class Ex3 {

	public static void main(String[] args) {

		int num = 3;
		
		if(num > 5) {
			System.out.println("num이 5보다 크다!");
		}else if(num < 5) {
			System.out.println("num이 5보다 작다!");
		}else if(num == 5){
			System.out.println("num이 5보다 같다!");
		}
		
		System.out.println("==============================");
		
		if(num > 5) {
			System.out.println("num이 5보다 크다!");
		}else if(num < 5) {
			System.out.println("num이 5보다 작다!");
		}else {
			System.out.println("num이 5보다 같다!");
		}
		
	}

}
