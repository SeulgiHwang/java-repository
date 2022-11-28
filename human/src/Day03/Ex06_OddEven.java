package Day03;

public class Ex06_OddEven {
	public static void main(String[] args) {
//		1~20까지의 정수 중에
//		홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오
//		while,if문을 사용
		
		int a=1;
		int sum1=0;
		int sum2=0;
		
		while(a<=20) {
			if(a%2==0) {
				sum1 += a++;
			}else if(a%2==1){
				sum2 += a++;
			}
		}
		System.out.println("짝수합계: "+sum1);
		System.out.println("홀수합계: "+sum2);
	}
}
