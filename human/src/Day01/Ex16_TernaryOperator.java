package Day01;

public class Ex16_TernaryOperator {
	public static void main(String[] args) {
		int a = 3 , b = 5;
		
		//a,b 의 두수의 차이를 구하여라
		// a-b = -2
		// b-a = 2
		
		//조건연산자(삼항연산자)
		//(조건) ? (참일때 문장) : (거짓일때 문장)
		int result = (a>b)? a-b: b-a;
		System.out.println("두 수의 차:"+result);
	}
}
