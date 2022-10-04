package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step3 {

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
		 * 3. PreparedStatement 객체를 통해 SQL 구문 전달 및 실행
		 *  - Connection 객체의 prepareStatement() 메서드 호출
		 *    => 파라미터 : 실행할 SQL 구문 문자열
		 *  - Connection 객체 연결 성공 시
		 *    java.sql.PrepraedStatement 객체 리턴됨
		 *  - PreparedStatement 객체의 executeXXX() 메서드 호출
		 *    1) executeUpdate() : INSERT, UPDATE, DELETE 구문 실행(데이터 조작)
		 *       => 실행 후 적용된 레코드 수가 int 타입으로 리턴됨
		 *    2) executeQuery() : SELECT 구문 실행 전용(데이터 조회)
		 *       => 실행 후 조회된 테이블이 ResultSet 타입으로 리턴됨
		 * --------------------------------------------------------------------
		 * 4. SQL 구문 실행 후 결과 처리
		 */
		
		// JDBC 활용에 필요한 정보 문자열 4개 생성
		String driver = "com.mysql.cj.jdbc.Driver"; // MySQL Driver 지정
		String url = "jdbc:mysql://localhost:3306/java"; // MySQL 접속 URL
		String user = "root"; // MySQL 접속 계정
		String password = "1234"; // MySQL 접속 계정의 패스워드
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2. DB연결
			// => java.sql.DriverManager 클래스의 getConnection() 메서드 호출
			// => MySQL 데이터베이스가 현재 PC에 설치되어 있으므로
			//    접속 주소를 localhost로 지정하고 기본 포트번호 3306 지정
			//    또한, 데이터베이스명은 java 로 지정
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			// 3. SQL 구문 전달 및 실행
			// => Connection 객체의 prepareStatement() 메서드 호출
			//    파라미터 : 실행할 SQL 구문
			// => PrepraredStatement 타입 객체 리턴받기
			String sql = "CREATE TABLE test(idx int)"; // 실행할 SQL 구문 작성
//			String sql = "DROP TABLE test";
//			String sql = "CREATE TABLE student"
//						 + "("
//						 + "idx INT,"
//						 + "id INT,"
//						 + "name VARCHAR(16),"
//						 + ")";
			
//			String sql = "CREATE TABLE student(idx INT, id INT, name VARCHAR(16))";
			pstmt = con.prepareStatement(sql);
			
			// => PreparedStatement 객체의 executeUpdate() 메서드를 호출하여
			//    전달된 SQL 구문을 실행
			pstmt.executeUpdate();
			System.out.println("SQL 구문 실행 성공!");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			// getConnection() 또는 executeXXX() 메서드 실행 과정에서 문제 발생 시
			System.out.println("DB 연결 실패! 또는 SQL 구문 오류 발생!");
			e.printStackTrace();		
		} finally {
			// finally 블록 내에서 DB 관련 자원 반환 필수!
			try {
				// 생성된 객체의 역순으로 반환
				pstmt.close(); 
				con.close(); 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
