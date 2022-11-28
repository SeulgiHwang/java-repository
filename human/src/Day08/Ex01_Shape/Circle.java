package Day08.Ex01_Shape;
//Shape 클래스를 구현하시오 
//:Shape클래스를 상속받아 추상메소드를 오버라이딩하시오
public class Circle extends Shape {

/*
 * 멤버변수로 
 */

	double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		// (원주율) * (반지름) * (반지름)
		return Math.PI *radius *radius;
	}

	@Override
	double round() {
		//  2* (원주율) * (반지름)
		return 2 + Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	

}
