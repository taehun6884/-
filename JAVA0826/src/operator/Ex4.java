package operator;

public class Ex4 {

	public static void main(String[] args) {
		
		int a = 10; 
		int b;
		
		b = a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------");
		
		b = b + a;
		b += a;
		System.out.println(b);
		
		System.out.println("====================");

		byte b1 = 10;
		
//		b1 = b1 + 10; 
		b1 = (byte)(b1 + 10);
		System.out.println(b1);
	
		b1 += 10;
		System.out.println(b1);
		
		System.out.println("===================");
		
		char ch ='A';
//		ch = ch + 3;
		ch = (char)(ch+3);
		System.out.println(ch);
		
		char ch2 = 'A';
		System.out.println(ch2);
		
		ch2 += 32;
		System.out.println(ch2);
		
		
		
		
		
		
	}

}
