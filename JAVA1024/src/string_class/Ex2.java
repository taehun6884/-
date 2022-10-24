package string_class;

public class Ex2 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		str = str + "아이티윌 입니다.";
		
		System.out.println(str);
		System.out.println("str 문자열 주소 : "+System.identityHashCode(str));
		System.out.println(str);
		
		str = str + "and";
		System.out.println("str 문자열 주소 : "+System.identityHashCode(str));
		System.out.println(str);
		
		str = str + "android";
		System.out.println("str 문자열 주소 : "+System.identityHashCode(str));
		System.out.println(str);
		
		str = str + "programming is fun!!";
		System.out.println("str 문자열 주소 : "+System.identityHashCode(str));
		System.out.println(str);
		
		System.out.println("-----------------------------------");
		
		StringBuilder buffer = new StringBuilder();
		System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(str));
		
		buffer.append(" and");
		System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(str));
		
		buffer.append(" android");
		System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(str));
		
		buffer.append(" Programming is fun!!!");
		System.out.println("연산 전 buffer 메모리 주소 : "+System.identityHashCode(str));
		
		str = buffer.toString();
		System.out.println(str);
		System.out.println("새로 만들어진 str 문자열 주소 : " + System.identityHashCode(str));
		
		
	}

}
