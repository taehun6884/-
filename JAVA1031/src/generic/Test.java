package generic;

import java.util.ArrayList;
import java.util.List;



public class Test {

	public static void main(String[] args) {
		// Person 클래스 인스턴스 2개 생성
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 44);
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("=========================");
		
		// Person 객체 여러개를 하나의 객체에 저장하여 관리할 경우
		// 1. Object[] 배열(또는 Person[] 배열)을 통해 관리
		// => 생성된 배열의 크기가 불변이므로 추가되는 객체 저장 불가
		// => Object 타입으로 업캐스팅 된 객체는 다시 다운캐스팅이 필요함
		//    (또한, 다운캐스팅 전 타입 체크도 필요함)
		Object[] objArr = {p1, p2}; // Person -> Object 업캐스팅 되어 관리됨
		
		for(int i = 0; i < objArr.length; i++) {
			// Object[] 배열에 저장된 객체를 직접 다룰 경우 참조 영역 축소됨
//			System.out.println(objArr[i].name); // Person 타입 변수 접근 불가
			
			// 배열 내의 객체를 꺼내서 Person 타입 변수에 저장
//			Person p = objArr[i]; // 다운캐스팅 필요!
			// 다운캐스팅 수행 전 타입 체크 필요
			if(objArr[i] instanceof Person) {
				Person p = (Person)objArr[i];
				System.out.println(p.name + ", " + p.age);
			}
			
		}
		
		System.out.println("=====================================");
		
		/* 2. Collection API(ex. ArrayList) 를 활용하여
		 *    Person 객체 여러개를 관리할 경우
		 * => 배열의 단점인 크기 불변을 해결하게 되므로 객체 추가 자유로움
		 * 1) 제네릭을 사용하지 않을 경우
		 *    - 파라미터 또는 리턴타입의 데이터타입이 Object 타입이 되어
		 *      다양한 객체를 저장 가능하게 됨
		 *    - 저장 시점에서 타입 판별이 이루어지지 않으므로 편리하지만
		 *      대신, 데이터를 꺼내는 시점에서 타입 불일치에 따른 오류 발생 가능
		 *    - 데이터를 꺼내기 전 instanceof 연산자를 통한 타입 판별 후
		 *      Object 타입을 실제 데이터타입으로 다운캐스팅 해야한다!
		 */   
		
		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		// 배열이 아닌 Collection API 는 객체 추가가 자유로움(자동 크기 확장됨)
		list.add(new Person("강감찬", 30));
		
		list.add("김혜수"); // Object 타입이므로 Person 이 아닌 타입도 추가 가능
		// => Person 객체 형태로 꺼내서 사용하는 시점에 문제가 발생할 수 있다!
		
//		for(int i = 0; i < list.size(); i++) {
//			// Object 타입으로 객체를 저장할 경우 Person 타입 멤버 접근 불가!
////			Object o = list.get(i);
////			System.out.println(o.name); // 참조영역 축소로 접근 불가!
//			
//			//Person 타입으로 가져오기 전 타입 판별 후 형변환 수행
//			if(list.get(i) instanceof Person) {
////				Person p = list.get(i); 다운캐스팅 필요!
//				Person p = (Person)list.get(i); // Object -> Person 다운캐스팅 
//				System.out.println(p.name + ", " + p.age);
//			}
//		}
		
		// 향상된 for문 사용 시 
		// 우변의 list 객체에서 꺼낸 객체를 저장할 변수를 좌변에 선언(Object)
		for(Object o : list) {
			if(o instanceof Person) {
				Person p = (Person)o;
				System.out.println(p.name + ", " + p.age);
			}
		}
		
		/*
		 * 2) 제네릭 타입을 사용할 경우
		 * - 저장할 객체의 타입이 Person 타입이므로 제네릭 타입 <Person> 지정
		 * - 객체 저장 시점에서 Person 타입 객체만 저장 가능하도록 자동 판별
		 *   즉, 잘못된 객체(또는 데이터)가 저장될 우려가 없다!
		 * - 또한, 제네릭 타입 Person 타입으로 고정되므로
		 *   Object 타입으로 업캐스팅이 일어나지 않음
		 *   => 데이터를 꺼내는 시점에서도 Person 타입 그대로 사용 가능
		 *      (별도의 타입 체크 또는 다운캐스팅 작업 불필요)
		 */
		
		List<Person> list2 = new ArrayList<Person>();
		// 제네릭 타입 <Person> 지정 시 저장 가능 객체는 무조건 Person 타입만!
		list2.add(p1);
		list2.add(p2);
		list2.add(new Person("강감찬", 30));
		
		// Person 타입이 아닌 객체(데이터) 추가 시
		// 데이터타입 판별 과정에서 오류(컴파일에러)가 발생하게 된다!
//		list2.add("김혜수"); // 컴파일 에러 발생!
		// => The method add(Person) in the type List<Person>
		//    is not applicable for the arguments (String)
		
		// 반복문을 통해 List 객체의 모든 요소를 꺼낼 경우
		for(int i = 0; i < list2.size(); i++) {
			// get() 메서드 리턴타입이 Person 타입이 되므로 형변환 불필요
			// => 또한, 형변환 전 타입 판별도 생략
			Person p = list2.get(i); // Person 타입으로 직접 리턴받음
			System.out.println(p.name + ", " + p.age);
		}
		
		for(Person p : list2) {
			System.out.println(p.name + ", " + p.age);
		}
		
		
		
		
		
		
	}

}






