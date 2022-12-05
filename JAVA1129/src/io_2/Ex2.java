package io_2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 모니터로 데이터를 출력하는 방법
		 * 2. OutputStreamWriter 사용(char 단위로 처리)
		 * - write() 메서드를 호출하여 char[] 배열 또는 String 객체를 전달하여
		 *   문자 데이터 출력 가능
		 *   => String 클래스는 char[] 배열로 관리되므로 writer 계열에서 처리 가능
		 * - 데코레이션 패턴을 활용하기 위해 BufferedWriter 객체 사용 가능
		 *   => OutputStreamWriter 보다 BufferedWriter 의 처리 속도가 더 빠름
		 * - FileOutputStream
		 *   => 파일에 바이트 단위 자료를 출력할 수 있음. 
		 */
		
		// OutputStream 정의
//		OutputStream os = System.out;
		
		// OutputStream을 파라미터로 갖는 OutputStreamWriter 정의
//		OutputStreamWriter writer = new OutputStreamWriter(os);
		
		// 위의 두 단계를 한 단계로 표현하면
//		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		
//		char ch = '강';
//		
//		try(OutputStreamWriter writer = new OutputStreamWriter(System.out)) {
//			String str = "Hello, 자바";
//			writer.write(ch);
//			writer.write(str);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// ===================================================================
		// 출력 내용을 파일에 저장
//		FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt");
		
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt")) {
			fos.write(65); // 65 -> 'A' 로 변환
			fos.write(10);
			fos.write(13);
			fos.write(66);
			fos.write(67);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// => catch 항목을 (Exception e) 하나로만 처리 가능!
		
		System.out.println("출력이 완료되었습니다!");
		
		// ========================================================
		
//		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt")) {
//			fos.write(68); // 68 -> 'D'로 변환
//			// => 기존의 ABC를 덮어쓰고 새로운 D 가 파일에 출력됨			
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("출력이 완료되었습니다!");
		
		
		// 만약, 기존 자료에 이어서 출력을 하고 싶다면 FileOutputStream 의 두번째
		// 매개변수 값으로 true를 입력
		
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt",true)) {
			fos.write(68); // 68 -> 'D'로 변환
			// => 두번째 매개변수 값으로 true를 입력하면
			//    기존의 ABC를 덮어쓰지 않고 D가 이어서 출력됨
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다!");
		
		System.out.println("=================================================");
		
		// =====================================================
		// 파일에 바이트 배열로 출력하기
		
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\data.txt",true)) {
			// byte[] 배열 생성
			byte[] bArr = new byte[26];
			byte data = 97; // 'a' 의 아스키 값
			for(int i = 0; i < bArr.length; i++) {
				bArr[i] = data;
				data++;
			}
			fos.write(bArr);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다!");
		
		// ============================================================
		// BufferedOutputStream 활용
		
		// FileOutputStream 생성
//		FileOutputStream fos = new FileOutputStream("c:\\temp\\buffertext.txt");
		
		// BufferedOutputStream 생성(버퍼 크기를 5로 지정)
//		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		
		try(BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("c:\\temp\\buffertext.txt"), 5)) {
			// 파일 buffertext.txt 에 1부터 9까지 출력
			for(int i = '1'; i <= '9'; i++) {
				bos.write(i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("출력이 완료되었습니다!");
		
	}

}






