package interface_;

public class test2 {

	public static void main(String[] args) {
		
		BumbleBee bb = new BumbleBee();
		
		bb.fight();
		bb.transform(3);
		bb.speak();
		
		
	}

}

interface Robot extends Fightable,Transformable{
	void speak();
}

interface Fightable{
	void fight();
}

interface Transformable{
	int MODE_CAR =1;
	int MODE_AIRPLANE = 2;
	int MODE_NORMAL = 3;
	void transform(int mode);
}


class BumbleBee implements Robot {

	@Override
	public void fight() {
		System.out.println("로켓발사!");
	}

	@Override
	public void transform(int mode) {
		
		switch (mode) {
		case MODE_CAR:
			System.out.println("자동차모드!");
			break;
		case MODE_AIRPLANE:
			System.out.println("비행기모드!");
			break;
		case MODE_NORMAL:
			System.out.println("기본모드!");
			break;
		}
	}

	@Override
	public void speak() {
		System.out.println("라디오 말하기!");
	}
	
}