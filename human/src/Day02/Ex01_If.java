package Day02;

import java.util.Scanner;

public class Ex01_If {
	public static void main(String[] args) {
		
		//점수입력
		System.out.println("숫자를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		//입력받은 값이 홀수인지 짝수인지 판단하시오
		if( input %2 ==1) {
			System.out.println("홀수입니다");
			}
		
		if(input %2==0) {
			System.out.println("짝수입니다");
		
		}
		sc.close();
	}
}
