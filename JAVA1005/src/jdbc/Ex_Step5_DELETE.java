package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step5_DELETE {

	public static void main(String[] args) {
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
					
					int idx = 10;
					String sql = "DELETE FROM test WHERE idx = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, idx);
					
					int result = pstmt.executeUpdate();
					if(result > 0 ) {
						System.out.println("DELETE 작업 성공! - "+ result + "개 레코드");
					}else {
						System.out.println("DELETE 작업 실패! - "+ result + "개 레코드");
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
