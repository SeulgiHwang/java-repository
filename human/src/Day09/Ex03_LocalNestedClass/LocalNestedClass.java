package Day09.Ex03_LocalNestedClass;

class A{
	int a = 100;				//멤버변수
	
	void methodA() {
		int b = 200;			//지역변수
		
			//로컬이너클래스
			class B{
				void methodB() {
					System.out.println(a);
					System.out.println(b);
					
					a= 300;
		//			b= 400;
		//			로컬이너클래스에서 사용하는 지역변수는 자동으로 final로 선언
		//			fianl 변수는 상수로, 값 변경불가
					}
				}
					//로컬이너 클래스 객체생성
					B bObj = new B();
					bObj.methodB();
		}
}


	public class LocalNestedClass {
		public static void main(String[] args) {
			A a = new A();
			a.methodA();
		}
	}