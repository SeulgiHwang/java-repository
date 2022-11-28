package Day08.Ex01_Shape;

//Shape 클래스를 구현하시오 
//:Shape클래스를 상속받아 추상메소드를 오버라이딩하시오
public class Triangle extends Shape {

	double width, height;
	
	//기본생정자 - super()호출
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//매개변수가 있는 생성자
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	double round() {
		return width*3;
	}
	
	

	//삼각형넓이 : 가로 * 세로 /2
	@Override
	double area() {
		return width* height /2;
	}


	public Triangle(double width) {
		this.width = width;
	}


	
	//toString()
	@Override
	public String toString() {
		return "Triangle [width=" + width + "]";
	}
	
}
