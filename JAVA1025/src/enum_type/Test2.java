package enum_type;

public class Test2 {
	
	public static void main(String[] args) {
		Week today = Week.SUN;
		
		if(today.ordinal() < 4) {
			System.out.println("하..");
		}else if(today.ordinal() == 4) {
			System.out.println("불금!");
		}else {
			System.out.println("주말!~!!");
		}

		switch (today) {
		case MON:
		case TUS:
		case WED:
		case TUH:
				System.out.println("하,,");
			break;
		case FRI: 
			System.out.println("불금ㄴ!");
			break;
		default:
			System.out.println("주말");
			break;
		}
	
	}
}

enum Week {
	MON, TUS, WED, TUH, FRI, SAT, SUN
}