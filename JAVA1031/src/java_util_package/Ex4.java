package java_util_package;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * java.time 패키지
		 * - 날짜 및 시각 정보를 관리하는 기능의 패키지로 JDK 8부터 제공됨
		 * - LocalDate 클래스 : 날짜 관련 기능 제공
		 *   LocalTime 클래스 : 시각 관련 기능 제공
		 *   LocalDateTime 클래스 : 날짜와 시각 관련 기능 제공
		 * - toString() 메서드 오버라이딩 되어 있음
		 * - 각 클래스의 now() 메서드를 호출하여 현재 시스템의 정보를 가져오고,
		 *   of() 메서드를 호출하여 날짜 및 시각 정보 설정 가능
		 * - getXXX() 메서드를 호출하여 항목별 정보 가져오기
		 *   => XXX 은 가져올 정보의 종류(ex. 연도는 getYear, 시각은 getHour) 
		 */
		
		// now() 메서드를 사용하여 정보 가져오기
		LocalDate date = LocalDate.now(); // 시스템의 날짜 정보 리턴받음
		System.out.println(date);
		
		LocalTime time = LocalTime.now(); // 시스템의 시각 정보 리턴받음
		System.out.println(time);
		
		LocalDateTime dateTime = LocalDateTime.now(); // 날짜, 시각 정보 리턴받음
		System.out.println(dateTime);
		
		System.out.println("-------------------");
		
		// of() 메서드를 사용하여 정보 설정하기
		LocalDate date2 = LocalDate.of(2000, 1, 1); // 연, 월, 일 정보 설정
		System.out.println(date2);
		
		LocalTime time2 = LocalTime.of(17, 40, 1); // 시, 분, 초 정보 설정
		System.out.println(time2);
		
		// LocalDateTime 클래스의 of() 메서드는 각각의 정보를 따로 설정도 가능하며,
		// LocalDate, LocalTime 객체로도 설정 가능함
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
		System.out.println(dateTime2);
		
		// getXXX() 메서드를 통해 항목별 정보 가져오기
		int year = date.getYear();
		int month = date.getMonthValue();
//		Month month = date.getMonth();
		// => 주의! getMonth() 메서드는 Month 타입 객체 리턴됨
		int day = date.getDayOfMonth();
		
		System.out.println(year + "/" + month + "/" + day);
		
		// Month 타입 객체 활용
		// => enum 타입 객체인 Month 타입으로 관리됨(각 월의 이름이 상수로 제공)
		Month enumMonth = date.getMonth();
		System.out.println(enumMonth); // toString() 생략됨
		String monthName = enumMonth.toString(); // 변수 저장 시 String 변환 필수!
		
		// Month 객체를 한국식 표현법으로 변환할 경우
//		System.out.println(enumMonth.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
		System.out.println(enumMonth.getDisplayName(TextStyle.FULL, Locale.KOREA));
		
		int hour = time.getHour();
		int min = time.getMinute();
		int sec = time.getSecond();
		
		System.out.println(hour + ":" + min + ":" +sec);
		
		System.out.println("====================================");
		
		// 날짜 또는 시각 정보에 대한 연산
		// 해당 객체의 plusXXX() 또는 minusXXX() 메서드를 활용하여 연산 가능
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// plusXXX() 메서드를 호출하여 뎃셈 연산 수행
		System.out.println(today.plusMonths(2)); // 2개월 뒤 날짜 설정
		System.out.println(today.plusDays(30)); // 30일 뒤 날짜 설정
		
		// 빌더 패턴(Builder Pattern)을 활용하여
		// 리턴타입이 자기 자신인 객체의 다음 메서드를 차례대로 연결하여 수행 가능
		System.out.println(today.plusMonths(1).plusDays(15));
		
		System.out.println("===============================");
		
		LocalDate date3 = LocalDate.of(2000, 1, 1);
		LocalDate date4 = LocalDate.now();
		
		// 날짜와 시각 정보 비교를 위해
		// compareTo(), isAfter(), isBefore, isEqual() 등의 메서드가 제공됨.
		System.out.println(date3); // 2000-01-01
		System.out.println(date4); // 2022-10-31
		
		// 1. compareTo()
		// => 현재 객체 날짜가 대상 객체보다 이전이면 음수, 이후면 야수
		//    같으면 0 리턴함
		System.out.println(date3.compareTo(date4));
		
		//  2. isAfter()
		System.out.println("설정된 날짜가 현재 날짜보다 더 미래인가? "
							+ date3.isAfter(date4));
		
		//  3. isBefore()
		System.out.println("설정된 날짜가 현재 날짜보다 더 과거인가? "
							+ date3.isBefore(date4));
		
		// 4. isEqual() 
		System.out.println("현재 날짜와 동일한가? " + date3.isEqual(date4));
		
		// 5. until() : 두 객체 간의 날짜 및 시간 차이 계산
		// => 파라미터로 대상 객체와 항목 정보 지정
		//    항목 정보는 ChronoUnit 객체(enum 타입)의 XXX 상수 사용
		//    ex) ChronoUnit.YEARS 연도, ChronoUnit.DAYS 일
		long result = date3.until(date4,ChronoUnit.YEARS);
//		System.out.println(result);
		if(result > 0) {
			System.out.println(result + "년 남았습니다.");
		} else if(result < 0) {
			System.out.println(result + "년 지났습니다.");
		} else {
			System.out.println("올 해 입니다!");
		}
		
		
		
		
	}

}








