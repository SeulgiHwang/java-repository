package Day03;

public class Ex05_WhileSum {
	public static void main(String[] args) {
		//1부터 100까지의 합계를 구하시오 
		int sum = 0 ;
		int a = 1;
		
		while( a <= 100 ) {
			//복합대입연산자
			sum += a++;
//			하기 두 줄을 상기처럼 요약함
//			sum += a;
//			a++;
		}
		
		System.out.println("sum:"+ sum );
	}
}
