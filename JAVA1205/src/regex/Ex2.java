package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 2. java.util.regex.Matcher 클래스
		 * - 패턴 해석 및 문자열 일치 여부를 파악하는 클래스
		 * - Pattern 클래스와 달리 정규표현식 일치 여부만 판단하는 것이 아니라
		 *   정규표현식 내용을 포함하고 있는지, 위치가 어디인지 등
		 *   자세한 정보까지 파악이 가능
		 * - Pattern.matcher() 메서드를 사용하여 Matcher 객체 리턴받을 수 있음
		 *   (공개된 생성자가 없으므로 객체 직접 생성 불가)
		 */
		
		String src = "Java and Javascript has no relation"; // 원본 문자열
//		String src = "Java ";
		String regex = "Java"; // 정규표현식
		
		// 1. Pattern 클래스의 compile() 메서드를 호출하여 Pattern 객체 생성
		// => 파라미터 : 정규표현식 문자열
		Pattern pattern = Pattern.compile(regex);
		
		// 2. 생성된 Pattern 객체의 matcher() 메서드를 호출하여 Matcher 객체 생성
		// => 파라미터 : 검증할 원본 문자열
		Matcher matcher = pattern.matcher(src);
		
		// 3. 각종 메서드를 호출하여 검증 수행
		// 3-1. matches() 메서드 : 정규표현식에 완전히 일치하는지 검사
		System.out.println("문자열이 정규표현식에 완전히 부합되는가? " + matcher.matches());

		// 3-2. lookingAt() : 정규표현식으로 시작하는지 검사
		System.out.println("문자열이 정규표현식으로 시작하는가? " + matcher.lookingAt());
		
		// 3-3. find() : 정규표현식을 포함하는지 검사
		System.out.println("문자열이 정규표현식을 포함하는가? " + matcher.find());
		
	}

}






