package Day03;

import java.util.Scanner;

public class Ex11_Star1 {
	public static void main(String[] args) {
		
//		자연수 n을 입력받아 삼각형모양의 "*"출력하시오
//		입력: 5
//		출력: 
//		* 
//		**
//		***
//		****
//		*****
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 n을 입력해주세요");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
		
			for(int j=0; j<=i; j++) {
//				i:1,j:1
//				i:2,j:1 2
//				i:3,j:1 2 3
//				i:4,j:1 2 3 4
//				i:5,j:1 2 3 4 5
				System.out.print("*");
			}
			System.out.println();
			sc.close();
		}
	}
}
