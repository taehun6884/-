package interface_;

public class test5 {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(3.14);
		c.draw();
	
		Rectangle rc = new Rectangle();
		rc.setWidth(4);
		rc.setHeight(4);
		rc.draw();
		
		PhotoShop p = new PhotoShop();
		p.draw(new Circle());
		p.draw(new Rectangle());
	}

}

interface Shape {
	void draw();
}

class Circle implements Shape {
	private double radius;
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원 그리기! - 반지름 : "+radius);
	}
	
}

class Rectangle implements Shape {
	private double width;
	private double height;
	
	
	
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("가로 :" + width +" 세로 : "+height+"의 사각형 그리기!");
	}
}

class PhotoShop {
	public void draw(Shape s) {
		s.draw();
	}
}