package Day09.Ex07_AnonymousClass;

public class AnonymousClass {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		
		//익명객체 : child
		anonymous.child.work();
		
		anonymous.methodA();
		
		//익명객체 생성해서, 인자로 전달
		anonymous.methodB(
			new Person() {
				void soccer() {
					System.out.println("축구를합니다");
				}

				@Override
				void work() {
					System.out.println("훈련을 합니다");
				}				
			}
		);
	}
}
