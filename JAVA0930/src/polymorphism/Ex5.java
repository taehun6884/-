package polymorphism;

public class Ex5 {

	public static void main(String[] args) {
		
		병사 병사 = new 병사();
		칼 칼 = new 칼();
		총 총 = new 총();
		활 활 = new 활();
		
		병사.장착(칼);
		병사.장착(총);
		병사.장착(활);
		
		병사.공격(칼);
		병사.공격(활);
		병사.공격(총);
//		==========================================================
		System.out.println("=========================================");
		
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("Employee 정보 : " + emp.getEmployee());
		emp.salaryCalculation();
		
		Manager man = new Manager("이순신", 4000, "개발팀", 3);
//		System.out.println("Manager 정보 : " + man.getManager());
		System.out.println("Manager 정보 : " + man.getEmployee());
		man.salaryCalculation();
		
		Engineer eng = new Engineer("강감찬", 5000, 5);
//		System.out.println("Engineer 정보 : " + eng.getEngineer());
		System.out.println("Engineer 정보 : " + eng.getEmployee());
		eng.salaryCalculation();
		
		System.out.println("====================================");
		
		emp.salaryCalculationAll(emp);
		// => emp.salaryCalculationAll(new Employee("홍길동", 3000));
		emp.salaryCalculationAll(man);
		// => emp.salaryCalculationAll(new Manager("이순신", 4000, "개발팀", 3));
		emp.salaryCalculationAll(eng);
		// => emp.salaryCalculationAll(new Engineer("강감찬", 5000, 5));
		
		
		
		
	}

}

// 직원(Employee) 클래스 정의
class Employee { // = class Employee extends Object
	// 일반 직원들은 연봉만 지급
	
	// Employee 멤버변수
	String name; // 사원명
	int salary; // 연봉
	
	// 파라미터 생성자 정의
	public Employee(String name, int salary) {
		super(); // Object() 기본생성자를 호출
		this.name = name;
		this.salary = salary;
	}
	
	// 직원 이름과 연봉을 리턴받는 getEmployee() 메서드 정의
	public String getEmployee() {
		return name + ", " + salary;
	}
	
	// 일반 직원의 연봉 계산기(기본 연봉을 그대로 적용)
	public void salaryCalculation() {
		System.out.println("연봉 : " + salary);
	}
	
	// ====================================================================
	// 전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서 모두 계산
	// => 다형성 필요.(Employee, Manager, Engineer 인스턴스 모두 처리)해야 함.
	//    따라서, 메서드 파라미터로 다형성을 적용한 Employee 타입 필요
	public void salaryCalculationAll(Employee emp) { // 업캐스팅 됨
		int salaryResult = 0; // 연봉 계산 결과를 저장할 변수
		
		// 참조영역의 축소로 인해 각 서브클래스 타입 멤버변수는 보이지 않음.
		// => Employee 를 제외한 Manager, Engineer 의 경우
		//    다시 다운캐스팅을 통해 서브 클래스의 전용 멤버에 접근해야 한다!
		// => 단, 무작정 다운캐스팅을 수행할 경우 오류가 발생할 수 있으므로 
		//    반드시 instanceof 연산자를 통한 타입 판별 후 다운스캐팅 필요
		// => 주의! 반드시 하위타입부터 판별을 수행해야 한다!
		
//	    if(emp instanceof Employee) {
//	   		System.out.println("Employee 그대로 사용!");
//	    }
		// => emp 로컬 변수에 들어갈 수 있는 Employee, Manager, Engineer 모두
		//    Employee 타입으로 변환이 가능하므로 항상 첫 번째 if 문은 true가 되고,
		//    첫번째 if문 블록이 계속 실행됨!!
		
	    if(emp instanceof Manager) { // Manager 타입으로 형변환이 가능한가?
			System.out.println("Employee -> Manager 로 다운캐스팅 가능!");
			
//			Manager man = emp; // 자동형변환 불가! 강제형변환 필수!
			Manager man = (Manager)emp;
			// 업캐스팅으로 축소됐던 참조영역이 다운캐스팅으로 확대되었으므로
			// 다운캐스팅 된 Manager 타입 참조변수(man)를 통해 모든 변수 접근 가능
			// 기본 연봉과 관리 인원 수에 따른 인센티브가 적용된 연봉 계산
			salaryResult = man.salary + man.manageEmployeeCount * 10;
			
		} else if(emp instanceof Engineer) { // Engineer 타입으로 형변환이 가능한가?
			System.out.println("Employee -> Enginner 로 다운캐스팅 가능!");
			
//			Engineer eng = emp; // 자동형변환 불가! 강제형변환 필수!
			Engineer eng = (Engineer)emp;
			// 업캐스팅으로 축소됐던 참조영역이 다운캐스팅으로 확대되었으므로
			// 다운캐스팅 된 Engineer 타입 참조변수(eng)를 통해 모든 변수 접근 가능
			// 기본 연봉과 자격증 수에 따른 인센티브가 적용된 연봉 계산
			salaryResult = eng.salary + eng.numOfCertificate * 20;
			
		} else if(emp instanceof Employee) {
			System.out.println("Employee 그대로 사용!");
			salaryResult = salary;
		}
	    
	    // 각 직원의 계산된 연봉 출력
	    System.out.println("연봉 : " + salaryResult + "만원 입니다.");
		
	}
	
	
}

// 관리자(Manager) 클래스 정의 - Employee 클래스 상속
class Manager extends Employee {
	// 관리 직원들은 연봉 + 관리하는 직원 수에 비례하여 인센티브 지급
	
	// Manager 클래스 멤버변수 추가
	String depart; // 부서명
	int manageEmployeeCount; // 관리하는 직원 수
	
	// 슈퍼클래스의 기본생성자가 없으므로 파라미터 생성자를 호출하도록 생성자 정의
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
	}
	
	// 이름, 연봉, 부서명, 관리하는 직원 수를 리턴하는 getManager() 메서드 정의
	public String getManager() {
//		return name + ", " + salary + ", " + depart + ", " + manageEmployeeCount;
		return getEmployee() + ", " + depart + ", " + manageEmployeeCount;
	}
	
	// Employee 의 연봉 계산 메서드를 오버라이딩
	// => 매니저 연봉은 기본 연봉 + (관리직원 수 * 10만원)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + manageEmployeeCount * 10;
		System.out.println("연봉 : " + salaryResult);
	}
}

// 엔지니어(Engineer) 클래스 정의 - Employee 상속
class Engineer extends Employee {
	// 엔지니어들은 자격증 수에 비례하여 연봉 인센티브 지급
	
	int numOfCertificate; // 자격증 개수

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}
	
	public String getEngineer() {
		return getEmployee() + ", " + numOfCertificate + "개";
	}

	// Employee의 연봉 계산 메서드를 오버라이딩
	// => 엔지니어의 연봉은 기본 연봉 + (자격증 수 * 20만원)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + numOfCertificate * 20;
		System.out.println("연봉 : " + salaryResult);
	}
	
	
	
	
}





// ==================================================================

class 병사 {
	public void 장착(무기 무기) {
		무기.장착();
	}
	
	public void 공격(무기 무기) {
		무기.공격();
	}
}

class 무기 {
	public void 장착() {
		System.out.println("무기를 장착하다.");
	}
	
	public void 공격() {
		System.out.println("무기로 공격하다.");
	}
}

class 칼 extends 무기 {

	@Override
	public void 장착() {
		System.out.println("칼을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("칼로 공격하다");
	}
	
}

class 총 extends 무기 {
	@Override
	public void 장착() {
		System.out.println("총을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("총으로 공격하다");
	}
}

class 활 extends 무기 {
	@Override
	public void 장착() {
		System.out.println("활을 장착하다.");
	}

	@Override
	public void 공격() {
		System.out.println("활로 공격하다");
	}
}






