이해못함 다시이해하기
package Day10.Ex01_TryCatch;

class Animal {}

class Dog extends Animal{};
class Cat extends Animal{};

public class ClassCast {
	//Dog,Cat-> Animal
	//Animal = Cat경우는 다시 Dog변환불가
	// Cat을 Dog로 타입변환할 수 없다
	public static void changeDog(Animal animal) {
		//java.lang.ClassCastException
		Dog dog = (Dog) animal;
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);

		Cat cat = new Cat();
		changeDog(cat); // cat이 인자로 전달된 경우, (Dog)로 변환불가
		
	}
}
