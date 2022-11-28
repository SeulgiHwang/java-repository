package Day03;

import java.util.Scanner;

public class Ex12_Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 n을 입력해주세요");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j =1; j>(n+1)-i; j--) {
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
	}
}
