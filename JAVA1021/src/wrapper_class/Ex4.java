package wrapper_class;

public class Ex4 {

	public static void main(String[] args) {
		
		int num1 = 10,num2 = 20;
		Integer n1 = 10,n2 = 20;
		
		System.out.println(Integer.max(num1,num2));
		System.out.println(Integer.max(n1,n2));
		System.out.println(Integer.min(n1,n2));
		
		System.out.println("정수 10을 2진수로 변환 : "+Integer.toBinaryString(num1));
		System.out.println("정수 10을 8진수로 변환 : "+Integer.toOctalString(num1));
		System.out.println("정수 10을 16진수로 변환 : "+Integer.toHexString(num1));
		
		System.out.println("==============================================================");
		
		char ch = 'R';
		
		System.out.println("원본 문자 데이터 :"+ch);
		
		if(ch >= 'A' && ch <='Z') {
			System.out.println(ch +" : 대문자!");
		}else if(ch >= 'a' && ch <='z') {
			System.out.println(ch +" : 소문자!");
		}else if(ch >= '0' && ch <='9') {
			System.out.println(ch+": 숫자!");
		}else {
			System.out.println(ch + ": 기타문자!");
		}
		System.out.println("--------------------------");
		
		ch = 'r';
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+": 대문자!");
			
//			ch += 32;
//			System.out.println("소문자로 변환 결과 : "+ ch);
			System.out.println("소문자로 변환 결과 : "+Character.toLowerCase(ch));
		}else if(Character.isLowerCase(ch)) {
			System.out.println(ch+": 소문자!");
			System.out.println("대문자로 변환 결과 : "+Character.toUpperCase(ch));
		}else if(Character.isDigit(ch)) {
			System.out.println(ch+": 숫자!");
		}else if(Character.isWhitespace(ch)){
			System.out.println(ch +" : 공백문자!");
		}else {
			System.out.println(ch + ": 기타문자!");
		}
	}

}
