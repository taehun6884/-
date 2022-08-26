package dataType;

public class Ex {

	public static void main(String[] args) {
		byte b = 100;
		short s = 65;
		
		char ch;
		
		ch = (char)b;
		System.out.println(ch);
		b = (byte)ch;
		System.out.println(b);
		
		System.out.println("---------------");
		
		ch = (char)s;
		System.out.println(ch);
		s = (short)ch;
		System.out.println(s);
		
		System.out.println("================");
		
		int i = ch;
		System.out.println(i);
		
		
		
		
	}

}
