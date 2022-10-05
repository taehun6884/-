package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.*;

public class Ex_Step4_SELECT {

	public static void main(String[] args) {
		// JDBC 사용에 필요한 4가지 문자열
		// 드라이버 위치, URL, 계정명, 패스워드
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1단계. 드라이버 로드 
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			// 2단계. DB 연결
			con = DriverManager.getConnection(url, user, password);
			System.out.println("DB 연결 성공!");
			
			// 3단계. SQL 구문 작성 및 전달
			// test 테이블의 모든 레코드 조회
//			String sql = "SELECT * FROM test";
			String sql = "SELECT * FROM student";
			
			pstmt = con.prepareStatement(sql);
			
			// 4단계. SQL 실행 및 결과 처리
			// SELECT 결과를 java.sql.ResultSet 타입으로 리턴
			rs = pstmt.executeQuery();
			// => 테이블 구조의 ResultSet 타입 객체에 첫번째 레코드부터
			//    마지막 레코드까지 차례대로 커서를 이동시키기 위해
			//    반복문을 사용하여 rs.next() 메서드 수행 결과가 true 일 동안 반복
			// => 만약, 조회된 레코드가 1개일 경우 if문으로 대체 가능
			while(rs.next()) {
				// rs.getXXX() 메서드를 호출하여 컬럼 데이터 가져오기
				// => getXXX() 메서드의 XXX : 가져올 컬럼의 자바 데이터타입
				// => 파라미터로 컬럼명(String) 또는 컬럼인덱스(int, 0부터) 사용
//				int idx = rs.getInt(1); // 첫번째 컬럼 데이터 int형으로 가져오기
				int idx = rs.getInt("idx"); // idx 라는 이름의 컬럼 데이터 가져오기
//				System.out.println(idx);
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(idx + " / " + id + " / " + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패!");
			e.printStackTrace();
		} finally {
			// finally 블록 내에서 DB 관련 자원 반환 필수!
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
		

	}

}








