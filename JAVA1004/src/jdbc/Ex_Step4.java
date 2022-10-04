package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex_Step4 {

	public static void main(String[] args) {
		
		int idx = 10;
		

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "1234";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공!");
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("디비 연결 성공!");
			
//			String sql = "INSERT INTO test VALUES("+idx+")";
			
//			String sql = "INSERT INTO test VALUES(?)";
//			
//			pstmt = con.prepareStatement(sql);
//			
//			pstmt.setInt(1, idx);
			
			String sql = "INSERT INTO student VALUES(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 1);
			pstmt.setInt(2, 1);
			pstmt.setString(3, "Kang");
			
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("INSERT 작업이 성공했다! - " + result +"개 레코드");
			}else {
				System.out.println("INSERT 작업이 실패했다!");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 연결 실패!");
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
