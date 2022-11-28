package Day03;

import java.util.Scanner;

public class Ex13_Star3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 n을 입력해주세요");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				//공백
				//i:1 j:x
				//i:2 j:1
				//i:3 j:1 2
				//i:4 j:1 2 3
				//i:5 j:1 2 3 4\
				System.out.print(" ");
			}
			for(int k=0; k<(n+1)-i; k++) {
				//i:1 k:1 2 3 4 5
				//i:2 k: 1 2 3 4
				//i:3 k: 1 2 3 
				//i:4 k: 1 2 
				//i:5 k: 1
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
	}	
}
