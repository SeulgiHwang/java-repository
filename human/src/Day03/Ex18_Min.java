package Day03;

import java.util.Scanner;

public class Ex18_Min {
	public static void main(String[] args) {
		
		//첫째줄에 입력할 개수 n을 입력받고
		//둘째줄에 n개의 정수를 공백을 두고 입력받으시오
		//n개의 정수중 최댓값을 구하여 출력하시오
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] =sc.nextInt();
		}
		
		//0번 인덱스에 최솟값이 들어가있고 
		//for 1부터 늘려가면서 비교함
		//if문에 min에 있는것고 arr[i]에서 비교해서 true이면 하기 실행-> min에 최솟값대입
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i]) { //true
				min = arr[i];
			}
		}
		System.out.println("최솟값:"+min);
		sc.close();
		
	}
}
