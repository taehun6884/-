package abstract_;

public class test2 {

	public static void main(String[] args) {
		ElectricCar ec = new ElectricCar();
		DiselCar dc = new DiselCar();

//		Vehicle[] vc = {new ElectricCar(),new DiselCar()};
//		
//		for(int i = 0;i<vc.length;i++) {
//			vc[i].addFuel();
//		}
		
		Vehicle vc = ec;
		vc.addFuel();
		vc.reportPosition();
		
		vc = dc;
		vc.addFuel();
		vc.reportPosition();
				
	}

}

abstract class Vehicle {
	int curX;
	int curY;
	
	public abstract void addFuel();

	public void reportPosition() {
		System.out.println("현재 위치 :" + curX+ " , "  + curY);
	}
}

class ElectricCar extends Vehicle{

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
	}
}

class DiselCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("주유소에서 다젤 연료 공급!");
	}
	
}

