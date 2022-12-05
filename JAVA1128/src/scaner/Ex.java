package scaner;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int input = 0;
//		
//		do {
//			System.out.println("원하는 값을 입력 하세여.프로그램을 종료하려면 Q를 입력하세요");
//			input = sc.nextInt();
//			System.out.println("입력하신 값은 "+input);
//		}while(input != 0);
	
		int input =0;
		int input2 =0;
		int input3 =0;
		
			System.out.println("3가지 정수 중 가장 큰 값은?");	
			input = sc.nextInt();
			input2 = sc.nextInt();
			input3 = sc.nextInt();

			if(input > input2) {
				System.out.println("입력하신 갑은?"+input);	
			}else if(input2 > input3) {
				System.out.println("입력하신 갑은?"+input2);
			}else {
				System.out.println("입력하신 갑은?"+input3);
			}
	
		
	
	
	}
}
