package if_statement;

public class test2 {

	public static void main(String[] args) {
		// 성민씨가 주운 돈 5000원을 int 형 변수 money에 저장
				int money = 2000;
				
				// if ~ else 문을 사용하여
				// 돈이 5천원 이상 있을 경우 "택시타고 가기!" 출력
				// 아니면 "버스 타고 가기!" 출력
				
				if(money >= 5000) {
					System.out.println("택시타고 가기!");
				} else {
					System.out.println("버스타고 가기!");
				}
				
				System.out.println("아이티윌에 도착!");

				System.out.println("================================");
				
				// if문 조건식에 비교연산자, 논리연산자(&&, ||, !, ^) 등을 조합하여 활용 가능
				// 1. 나이(age)를 입력받아 20대인지 판별
				//    => 20대란? 나이(age)가 20 이상이고 나이(age)가 29이하(30미만)
				int age = 35;
				
				// if문을 사용하여 나이가 20대일 경우 "당신은 20대입니다!" 출력
				// 아니면 "당신은 20대가 아닙니다!" 출력
				
				if(age >= 20 && age <= 29) {
					System.out.println("당신은 20대 입니다!");
				} else {
					System.out.println("당신은 20대가 아닙니다!");
				}
				
				System.out.println("----------------------------");
				
				// 2. 나이(age)를 입력받아 놀이동산 무료입장 여부 판별
				//    => 무료입장 대상: 나이(age)가 5세 미만이거나 나이(age)가 65세 이상
				
				age = 20;
				
				// if문을 사용하여 조건에 만족할 경우 "무료입장 대상입니다!" 출력
				// 아니면 "무료입장 대상자가 아닙니다!"
				if(age < 5 || age >= 65) {
					System.out.println("무료입장 대상입니다!");
				} else {
					System.out.println("무료입장 대상자가 아닙니다!");
				}
		
		
	}

}
