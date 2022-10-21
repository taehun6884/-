package wrapper_class;

public class Ex2 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2;
		
		System.out.println("기본 타입 변수 num1 의 값 = "+num1);
		
		Integer n1;
		//Integer n2 = new Integer(20);
		
		Integer n2 = new Integer("20");
		
		System.out.println(n2);
		
		System.out.println("참초타입 변수 n2의 값 = "+n2);

		System.out.println("-----------------------------");

		n1 = Integer.valueOf(num1);
	
		System.out.println(num1 + ", "+n1);
		
		n1 = num1;
		
		System.out.println(num1 +", "+n1);
		
		num2 = n2.intValue();
		
		num2 = n2;
		
		System.out.println(num2 + ", "+n2);
		
		int num3 = 10;
		Integer n3 = 20;
		System.out.println(num3 + n3);
	
		System.out.println("------------------------");
	
		Object o = 10;
		System.out.println(o);
		
		
	
	}
}
