package interface_;

public class Ex5 {

   public static void main(String[] args) {
	   
	   DesignerClient designer = new DesignerClient();
	   designer.login();
	   System.out.println("---------------------");
	   
	   DeveloperClient deceloper = new DeveloperClient();
	   deceloper.login();
   }

}
interface LoginProcess{
   public abstract String login(String id, String pass);
   //인터페이스 내의 메서드는 추상메서드로 정의한 뒤에 오버라이드하여 각각 정의.
}
//디자이너
class Designer implements LoginProcess{
// 디자이너는 메서드에 전달되는 데이터가 정확한 지 확인하고 리턴값이 외부로 잘 전달되는지 확인한다.
   
   public String login(String id, String pass) {
      System.out.println("디자이너가 전달받은 아이디 : " + id);
      System.out.println("디자이너가 전달받은 패스워드 : " + pass);
      return "성공";
   }
   
}
class DesignerClient {
   Designer desinger = new Designer();
   
   public void login() {
	   String id = "admin";
	   String pass ="123";
	   
	   String result = desinger.login(id, pass);
	   
	   System.out.println("로그인 결과 : "+result);
	   
	   if(result.equals("성공")) {
		   
	   }else {
		   
	   }
   }
}

class Developer implements LoginProcess {
	@Override
	public String login(String id, String pass) {
		System.out.println("개발자가 전달받은 아이디 : "+ id);
		System.out.println("개발자가 전달받은 패스워드 : " +pass);
		
		System.out.println("아이디와 패스워드로 로그인 작업 처리 완료!");
		return "성공";
	}
}

class DeveloperClient {
	Developer developer = new Developer();
	
	public void login() {
		String result = developer.login("admin", "1234");
		System.out.println("로그인 결과 : "+ result);
	}
}

