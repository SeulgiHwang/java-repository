package Day04;

import java.util.Scanner;

public class Ex04_WhileArray {
	public static void main(String[] args) {
		//정수 5개를 입력받아 배열에 저장하고
		//Y를 입력하면, 한번더입력
		//N을 입력하면, 종료하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		String finish = "";
		
		do {
			System.out.println("정수 5개입력");
			
			//실제입력
			//1^2^3^4^5←
			//^:띄어쓰기
			//←: 엔터
			//5까지 sc.nextInt()로 입력받아서 배열에 저장되고 
			//←(엔터)가 입력버퍼에 남아있다
			
			for(int i=0; i<arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			//남은 ←(엔터)를 버퍼에서 뺴준다
			sc.nextLine();
			//새로운 문자열을 입력받는다
			System.out.println("다시인력(Y/N) :");
			finish = sc.nextLine();
			System.out.println(finish);
		
			} while (finish.equals("Y"));
		sc.close();
	}
}
