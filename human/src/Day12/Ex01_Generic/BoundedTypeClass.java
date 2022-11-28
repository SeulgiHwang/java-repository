package Day12.Ex01_Generic;

import Day06.Ex04_Board.Main;

class A{}
class B extends A{}
class C extends B{}
//A -> B
//B -> C
//타입지정의 가능한 클래스 :B,C
class D <T extends B>{
private T t;

	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t = t;
	}
}

public class BoundedTypeClass {
	public static void main(String[] args) {
		D<B> d1 = new D<B>();
		D<C> d2 = new D<C>();
//		D<A> d3 = new D<A>();
		//D클래스의 타입매개변수를 B클래스 제한하고 있기 때문에, 
		//D의 타입으로 B와 C만 가능하다
		
		d1.setT( new B());
		d2.setT( new C());

		d1.setT( new C());	//d1<B><-- 자식객체인 C 대입가능(업캐스팅)
//		d2.setT( new B());	//d2<C><-- 부모객체인 B 대입불가
		
		D d4 = new D(); 	//D<B> d4 = new D<>();
		d4.setT(new B());
		d4.setT(new C());
	}
}
