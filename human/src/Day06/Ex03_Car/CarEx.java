package Day06.Ex03_Car;

public class CarEx {
	public static void main(String[] args) {
		//객체생성
		Car car = new Car();
		car.model = "제네시스";
		//car.speed = 100;
		//private 변수라서, speed 에 접근이 불가능
		
		//private int speed에는 private가 
		//직접접근이 불가능해서 getter&setter로 우회접근
		car.setSpeed(100);
		System.out.println("speed:"+car.getSpeed());
		
		
	}
}
