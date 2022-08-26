package operator;

public class Ex {

	public static void main(String[] args) {
		
		System.out.println(10 + 2);
		System.out.println(10 - 2);		
		System.out.println(10 * 2);
		System.out.println(10 / 2);
		System.out.println(10 % 2);
	
		System.out.println("-----------------");
	
		//int형 변수 a 에 10을 저장하고, b에 2를 저장
		int a = 10, b = 2;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println("------------------");
		
		int c;
		
		c = a + b;
		System.out.println(c);
		System.out.printf("%d + %d = %d\n",a,b,c);
		
		c = a - b;
		System.out.println(a+"-"+b+"="+c);
		System.out.printf("%d - %d = %d\n",a,b,c);

		c = a * b;
		System.out.println(a+"*"+b+"="+c);
		System.out.printf("%d * %d = %d\n",a,b,c);

		c = a / b;
		System.out.println(a+"/"+b+"="+c);
		System.out.printf("%d / %d = %d\n",a,b,c);

		c = a % b;
		System.out.println(a+"%"+b+"="+c);
		//System.out.printf("%d  %d = %d\n",a,b,c);

	
	}

}
