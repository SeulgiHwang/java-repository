package Day12;
class Student{}
class Developer{}

class Person{
	private Object object = new Object();

	public Object get() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}

public class ObjectProduct {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.setObject(new Student());
		
		Developer developer = (Developer)person1.get();
		//다양한 타입을 사용하기 위해서 
		//Object타입으로 인스턴스를 저장할 수는 있지만, 
		//타입 변환을 올바르지 못하게 하는 상황이 발생할 수 있다.
		//ClassCastException이 발생한다
		
		//약한타입체크
		//:잘못된 타입 변환에도 문법오류를 발생시키지않고 타입을 체크하는 것

	}
}
