package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		Month now = Month.FEBRUARY;
		
		System.out.println(now + " , " + now.getMonthKor());
		
		
	}
}

enum Month {
	JANUARY("1월"),FEBRUARY("2월");
	
	private String monthKor;

	public String getMonthKor() {
		return monthKor;
	}

	public void setMonthKor(String monthKor) {
		this.monthKor = monthKor;
	}

	private Month(String monthKor) {
		this.monthKor = monthKor;
	}
	
	
}

