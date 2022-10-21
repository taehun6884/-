package wrapper_class;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		char[] chArr = {'H','e','l','l','o'};
		String str= "Hello";
				
		Test5 t5 = new Test5();
		str = t5.encrypt(chArr);
		System.out.println(Arrays.toString(chArr));
		//char[] chArr = str.toCharArray();
		System.out.println(str);
		
	}
	public String encrypt(char[] chArr) {
		char[] enctyptedArr = new char[chArr.length];
		
		for(int i = 0;i<chArr.length;i++) {
			enctyptedArr[i] = (char)(chArr[i] + 3);
		}
			
		//return Arrays.toString(enctyptedArr);
		
//		String str = new String(enctyptedArr);
		
		StringBuilder buffer = new StringBuilder();
		
		for(char ch : enctyptedArr) {
			buffer.append(ch);
		}
		String str3 = buffer.toString();
		return str3;
	}
}
