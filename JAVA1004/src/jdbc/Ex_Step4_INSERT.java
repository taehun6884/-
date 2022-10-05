package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step4_INSERT {

	public static void main(String[] args) {
		/*
		 * < JDBC를 활용한 DB 프로그램 구현 4단계 >
		 * 1. JDBC 드라이버 로드(드라이버 필요) com.mysql.cj.jdbc.Driber
		 *  - java.lang.Class 클래스의 static 메서드 forName() 메서드 호출
		 *    => 파라미터 : 해당 DB 의 드라이버 클래스 파일명을 문자열로 전달
		 *                  (패키지명.클래스명 형태로 지정 필요)
		 *  - 단, 미리 해당 드라이버가 포함된 jar 파일이 추가되어 있어야 함
		 *  - 드라이버 클래스 위치가 잘못 지정되었거나 클래스 파일이 없을 경우
		 *    ClassNotFoundException 예외 발생
		 * 2. DB연결(URL, 계정명, 패스워드 필요) jdbc:mysql:80//localhost:3306/java, root, 1234
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
		 * 4. SQL 구문 실행 후 결과 처리
		 *  - executeUpdate() 메서드 실행 결과 : int 타입
		 *    => 쿼리문에 영향을 받은 레코드 수 리턴
		 *  - executeQuery() 메서드 실행 결과 : ResultSet 타입
		 *    => 조회된 테이블을 관리하는 ResultSet 타입 객체가 리턴됨
		 */
		
		// 외부로부터 전달받은 번호(idx)를 INSERT 하는 문장 작성
		int idx = 10;
		
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
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			// 3. SQL 구문 작성 및 전달
//			String sql = "INSERT INTO test VALUES(" + idx + ")";
			// => 값을 바로 넣을 수 있지만, 값 대신 SQL 구문으로 대체될 수 있다!
			// => idx 부분을 입력받는 형태라면 정수값이 아닌 다른 것으로 대체할 수도 있음
			//    (SQL Injection attack = SQL 삽입 공격)
			// => 따라서, 만능문자(= wildcard = ?) 처리를 하여 우선 객체를 생성하고
			//    setXXX 메서드를 통해 데이터를 바인딩 처리를 해주는 것이 좋다!
			
			String sql = "INSERT INTO test VALUES(?)";	
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, idx);
			
//			String sql = "INSERT INTO student VALUES(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 10);
//			pstmt.setInt(2, 1);
//			pstmt.setString(3, "Kang");
			
			
			// 4. SQL 구문 실행 및 결과 처리
			// => UPDATE, DELETE 구문의 경우 WHERE 절 사용 시
			//    영향을 받은 레코드 수 리턴됨
			//    단, 일치하는 레코드가 없을 경우
			//    수정 또는 삭제가 되지 않아 0 리턴됨
			// => INSERT 구문의 경우 성공 시 1, 실패 시 예외 발생됨!
			int result = pstmt.executeUpdate();
			// => 실행 결과 리턴(INSERT 된 레코드 수)
			
			if(result > 0) {
				System.out.println("INSERT 작업 성공! - " + result + "개 레코드");
			}
			
			
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
