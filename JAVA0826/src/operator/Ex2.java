package operator;

public class Ex2 {

	public static void main(String[] args) {
	
	byte b1 = 10, b2 = 20, b3;
	System.out.println(b1 + b2);
	
	//b3 = b1 + b2; 
	
	b3 = (byte)(b1+b2);
	System.out.println(b3);
	
	short s = (short)(b1 + b2);
	System.out.println(s);
	
	System.out.println("------------------");
	
	char ch = 'A';
	char ch2 = (char)(ch + 2);
	
	System.out.println(ch2);
	
	System.out.println(ch +2);
	System.out.println((char)ch +2);
	
	int i = 100;
	long l = 200;
	
	int i2 = (int)(i + l);
	System.out.println(i2);
	
	float f = 3.14f;
	long l2 = (long)(l + f);
	System.out.println(l2);
	
	System.out.println("------------------");
	
	System.out.println(3 / 2);
	
	System.out.println((double)3 / 2);
	System.out.println(3 / 2.0);

	System.out.println("=======================");
	float f1 = 0.1f;
	double d1 = 0.1;
	
	System.out.println(f1);
	System.out.println(d1);
	
	System.out.println(f1 + d1);
	
	System.out.println(f1 + (float)d1);
	System.out.println(((int)(f1*10) + (int)(d1*10)) / 10.0);
	
	System.out.println("==========================");
	
	byte b4 = 10 + 20;
	System.out.println(b4);
	
//	byte b5 = 10 + 200;
	
	
	
	
	}
}
