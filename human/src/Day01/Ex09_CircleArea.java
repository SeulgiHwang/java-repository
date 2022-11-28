package Day01;

public class Ex09_CircleArea {

	public static void main(String[] args) {
		//원의 넓이 = 반지름^2 * PI
		final double PI =3.14; //원주율을 상수로 선언
		double radius = 5;//원의 반지름
		double circleArea = radius * radius * PI;
		
		//변수자동완성 : ctrl +space
		System.out.println("반지름:"+radius); //원의넓이
		System.out.println("넓이:"+circleArea); //원의넓이
		
		double radius2=10;
		double circleArea2= Math.pow(radius2, 2) * Math.PI;
		
		//Math.pow(밑,지수) : 밑^지수 => 거듭제곱을 연산해주는 메소드
		//ex) Math.pow(2,3) : 2^3 =8
		System.out.println("반지름2:"+radius2);
		System.out.println("넓이2:"+circleArea2);
	}

}
