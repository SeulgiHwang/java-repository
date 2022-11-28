package Day04;

import java.util.Scanner;

public class Ex03_Arrays {
	public static void main(String[] args) {

//		2차원배열_비정방
//		#1 [][]
//		#2 [][][][]
//		#3 [][][]
		
//		2차원배열 ->비정방
		int[][] a = new int[3][];
		a[0] =new int[2];
		a[1] =new int[4];
		a[2] =new int[3];

//		입력
//		중첩반복문
		Scanner sc = new Scanner(System.in);
//		바깥반복문->행(i)
			for(int i=0; i<a.length; i++) {
//				안쪽반복문->열(j)
//				비정방1>각열의 갯수를 알아야한다 a[i];
				for(int j=0; j<a[i].length; j++) {
					a[i][j] =sc.nextInt();
				}
			}
//		출력
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			sc.close();
	}
}
