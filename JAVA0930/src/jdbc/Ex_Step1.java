package jdbc;

public class Ex_Step1 {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바에서 DB 에 접근하기 위한 연결 방식을 제공하는 API(라이브러리)
		 * - 데이터베이스 접근 방식 외의 모든 작업은 통일된 방법으로 제공하고
		 *   각 DB 제조사에서 제공하는 드라이버를 로드하여 설정함
		 *   => DB 제조사마다 드라이버가 다르므로 각각 다운로드 필요.
		 *   ex) MySQL 드라이버 : mysql-connector-java.버전.jar 파일
		 *   	 Oracle 드라이버 : ojdbcX.jar 파일
		 *   
		 * < JDBC를 활용한 DB 구현프로그램 구현 4단계 >
		 * 1. JDBC 드라이버 로드(드라이버 필요)
		 *  - java.lang.Class 클래스의 static 메서드 forName() 메서드 호출
		 *    => 파라미터 : 해당 DB의 드라이버 클래스 파일명을 문자열로 전달
		 *                  (패키지명.클래스명 형태로 지정 필요)
		 *  - 단, 미리 해당 드라이버가 포함된 jar 파일이 추가되어 있어야 함
		 *  - 드라이버 클래스 위치가 잘못 지정되었거나 클래스 파일이 없을 경우
		 *    ClassNotFoundException 예외 발생
		 * ------------------------------------------------------------------
		 * 2. DB 연결(URL, 계정명, 패스워드 필요)
		 * 3. PreparedStatement 객체를 통해 SQL 구문 전달 및 실행
		 * 4. SQL 구문 실행 후 결과 처리
		 * 
		 * < 기본 문법 >
		 * Class.forName("드라이버 위치");
		 * ex) MySQL의 드라이버 위치 : com.mysql.cj.jdbc.Driver
		 * 
		 */
		
		/*
		 * 1. 드라이버 로드
		 * => mysql-connector-java.버전.jar 파일 내의
		 *    com.mysql.jdbc 패키지의 Driver.class 파일 지정(.class 제외)
		 * => ClassNotFoundException 예외 처리 필요(나중에 배움)
		 * 
		 * 1-1. MySQL 다운로드(mysql-installer-web-community-버전.smi)
		 * - 웹 브라우저에서 mysql.com 접속
		 * - DOWNLOADS -> MySQL Community(GPL) Downloads
		 *   -> MySQL Installer for Windows -> 최소버전 설치
		 * 
		 * 1-2. 드라이버 다운로드(mysql-connector-java-버전.jar)
		 * - 웹 브라우저에서 mysql.com 접속
		 * - DOWNLOADS -> MySQL Community(GPL) Downloads -> Connector/J
		 *   -> Archives 탭 클릭 -> 
		 *   Operating System : Platform Indepedent -> ZIP 파일 다운로드
		 *   -> 파일 압축 해제 -> 폴더 내의 mysql-connector-java-8.0.29.jar 파일을
		 *      java project 에 드래그해서 넣음
		 *   -> .jar 파일 우클릭 -> Build Path -> Add to Build Path    
		 */
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로드 실패!");
		}
		
		

	}

}









