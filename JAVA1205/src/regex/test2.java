package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test2 {
	
	public static void main(String[] args) {
		String engUpperRegex = "[A-Z]";
		String engLowerRegex = "[a-z]";
		String numRegex = "[0-9]";
		String specRegex = "[!@#$%]";
		String lengthRegex= "^[A-Za-z0-9!@#$%]{8,16}$";
		String[] passwords = {"asdnu1","aisndoi!","aisdn!","anudsi@"};
					
		
		for(int i =0;i<=1;i++) {
			System.out.println("패스워드 입력: ");
			Scanner sc = new Scanner(System.in);
			String password = sc.nextLine(); 
			if(Pattern.matches(lengthRegex, password)) {
				System.out.println(password+"길이 규칙 적합!");
				int count = 0;
				Pattern pattetn = Pattern.compile(engUpperRegex);
				Matcher matcher = pattetn.matcher(password);
				
//				if(matcher.find()) {
//					count++;
//				}
//				Pattern pattetn2 = Pattern.compile(engLowerRegex);
//				Matcher matcher2 = pattetn2.matcher(password);
//				
//				if(matcher2.find()) {
//					count++;
//				}
//				
//				Pattern pattetn3 = Pattern.compile(numRegex);
//				Matcher matcher3 = pattetn3.matcher(password);
//				
//				if(matcher3.find()) {
//					count++;
//				}
//				
//				Pattern pattetn4 = Pattern.compile(specRegex);
//				Matcher matcher4 = pattetn4.matcher(password);
//				
//				if(matcher4.find()) {
//					count++;
//				}
				
//				if(Pattern.compile(engUpperRegex).matcher(password).find()) {
//					count++;
//				}
//				if(Pattern.compile(engLowerRegex).matcher(password).find()) {
//					count++;
//				}
//				if(Pattern.compile(numRegex).matcher(password).find()) {
//					count++;
//				}
//				if(Pattern.compile(specRegex).matcher(password).find()) {
//					count++;
//				}
				
				count += Pattern.compile(engUpperRegex).matcher(password).find()? 1:0;
				count += Pattern.compile(engLowerRegex).matcher(password).find()? 1:0;
				count += Pattern.compile(numRegex).matcher(password).find()? 1:0;
				count += Pattern.compile(specRegex).matcher(password).find()? 1:0;
				
				System.out.println(count);
				
				switch(count) {
					case 4 : System.out.println(password+": 안전하다"); 
							 break;
					case 3 : System.out.println(password+": 보통하다");
							 break; 
					case 2 : System.out.println(password+": 미흡하다");
							 break;
					default : System.out.println(password+": 사용 불가능한 패스워드!");		 
				}
				
			}else {
				System.out.println(password+": 영문자,숫자,특수문자 조합 8~16자 필수!");
			}
		}
		
		
		
		
	}
}
