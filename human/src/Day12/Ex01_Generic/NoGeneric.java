package Day12.Ex01_Generic;

class Cloth{}

class Product1{
	//cloth객체생성
	private Cloth cloth = new Cloth();
	//cloth객체타입만다룸
	public Cloth getCloth() {
		return cloth;
	}
	
	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}
}
 class Car{}
 
 class Product2{
	 private Car car = new Car();
	 public Car getCar() {
		 return car;
	 }
	 public Car setCar(Car car) {
		 return car;
	 }
 }

 public class NoGeneric {
	public static void main(String[] args) {
		Product1 product1 = new Product1();
		product1.setCloth(new Cloth());
		System.out.println(product1.getCloth());

		Product2 product2 = new Product2();
		product2.setCar(new Car());
		System.out.println(product2.getCar());
		
		//Obfuce클래스로 타입을 선언
		//:어떤클래스든 업캐스팅하여 받아올수있다
		//-문제: 실수로 다른타입으로 캐스팅을 할수있다
	}
}
