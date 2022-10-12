package constant;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 상수(Constant)
		 * - 변하지 않는 데이터 = 변하지 않는 데이터를 저장한 변하지 않는 변수
		 * - 보통 데이터 내에서 상수를 선언 시 public static final 형태로 선언
		 *   1) public : 누구나 접근 가능
		 *   2) static : 클래스 로딩 시 함께 로딩되어 인스턴스 생성과 무관하며,
		 *               클래스 하나 당 하나만 생성되고, 모든 인스턴스가 공유함
		 *               => 클래스명만으로 접근 가능(클래스명.변수명)
		 *   3) final : 데이터 변경 불가 = 상수
		 */

		CarInfo ci = new CarInfo();
		
		// 객체에 차량 정보를 저장하는 경우
		// => 값을 직접 입력할 때 문자열 등의 오타로 인한 오류 발생 가능성 있음
		ci.setCompany("hyundai");
		ci.setCarModelName("SONATA");
		ci.setColor(0x000000); // 복잡한 값을 지정하기 어려움
		
		// 차량 정보를 비교해야 할 경우
		// => 문자열의 경우 대소문자에 대한 차이 등으로 잘못된 판별도 가능
		if(ci.getCompany() == "HYUNDAI") { // hyundai 와 HYUNDAI 는 다른 문자열
			System.out.println("현대자동차입니다!");
		} else {
			System.out.println("현대자동차가 아닙니다!");
		}
		
		if(ci.getCarModelName() == "SONATA") {
			System.out.println("쏘나타입니다!");
		} else {
			System.out.println("쏘나타가 아닙니다!");
		}
		
	}
		
}

// ------------------------------------------------------------
// 상수를 활용하지 않는 클래스
class CarInfo {
	private String company;
	private String carModelName;
	private int color;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCarModelName() {
		return carModelName;
	}
	
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	
}














