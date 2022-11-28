package Day08.Ex01_Shape;

//abstract : 추상 클래스/ 메소드를 지정하는 키워드
public abstract class Shape {

	//멤버변수로 Point 객체를 선언하시오
	Point point;

	//생성자를 정의하시오
	public Shape() {
	}
	
	//넓이랑 둘레를 구한 메소드원형를 정의하시오
	/**추상메소드
	 * :{}블록 없이 메소드원형만을 정의하고,
	 * 자식클래스에서 반드시 오버라이딩해야만 사용할수있는 메소드
	 * abstract 반환타입 메소드명(매개변수);
	 */
	//넓이
	abstract double area();
	//둘레
	abstract double round();

	//getter,setter
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

}
