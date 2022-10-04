package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex_Step2 {

	public static void main(String[] args) {
		/*
		 * < JDBC를 활용한 DB 프로그램 구현 4단계 >
		 * 1. JDBC 드라이버 로드(드라이버 필요)
		 *  - java.lang.Class 클래스의 static 메서드 forName() 메서드 호출
		 *    => 파라미터 : 해당 DB 의 드라이버 클래스 파일명을 문자열로 전달
		 *                  (패키지명.클래스명 형태로 지정 필요)
		 *  - 단, 미리 해당 드라이버가 포함된 jar 파일이 추가되어 있어야 함
		 *  - 드라이버 클래스 위치가 잘못 지정되었거나 클래스 파일이 없을 경우
		 *    ClassNotFoundException 예외 발생
		 * 2. DB연결(URL, 계정명, 패스워드 필요)
		 *  - java.sql.DriverManager 클래스의 
		 *    static 메서드인 getConnection() 메서드 호출
		 *    => 파라미터 : 해당 DB 접속 URL, 계정명, 패스워드 전달
		 *    => URL 형식 : MySQL 기준으로 "jdbc:mysql://DB접속주소:포트번호/DB명"
		 *  - 연결 성공 시 java.sql.Connection 타입 객체 리턴됨
		 * ----------------------------------------------------------------------
		 * 3. PreparedStatement 객체를 통해 SQL 구문 전달 및 실행
		 * 4. SQL 구문 실행 후 결과 처리
		 */
		
		Connection con = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");
			
			// 2. DB연결
			// => java.sql.DriverManager 클래스의 getConnection() 메서드 호출
			// => MySQL 데이터베이스가 현재 PC에 설치되어 있으므로
			//    접속 주소를 localhost로 지정하고 기본 포트번호 3306 지정
			//    또한, 데이터베이스명은 java 로 지정
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/java", "root", "1234");
			System.out.println("DB 연결 성공!");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패!");
		} finally {
			// finally 블록 내에서 DB 관련 자원 반환 필수!
			try {
				con.close(); // Connection 객체 반환
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}






