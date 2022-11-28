package Day03;

import java.util.Scanner;

public class Ex17_Max {
	public static void main(String[] args) {
		//첫째줄에 입력할 개수 n을 입력받고
		//둘째줄에 n개의 정수를 공백을 두고 입력받으시오
		//n개의 정수중 최댓값을 구하여 출력하시오
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n]; //n개의 배열
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		//arr {5,20,33,56,12}
		int max= arr[0];
		//최댓값찾을 구하여 max에 대입하고 출력해보세요
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
//			System.out.println(arr[i]+" ");	
		
		}
		System.out.println("최댓값:"+ max);
		
		
		sc.close();
		
	}
}
