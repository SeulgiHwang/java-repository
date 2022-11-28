package Day03;

import java.util.Scanner;

public class Ex14_Continue {
	
	//5개의 정수를 입력받고
	//입력받은 수 중 양수만 합계를 구하여 출력하시오
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int n =sc.nextInt();
			if(n<0) 
				continue;
			
				sum += n;
		}
			System.out.println("양수의합: "+sum);
			sc.close();
		
	}
}
