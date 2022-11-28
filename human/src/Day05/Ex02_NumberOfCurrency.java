package Day05;

import java.util.Scanner;

//		금액 : 534,760
//		50,000 : 10개
//		10,000 : 3개
//		5,000 : 0개
//		1,000 : 4개
//		500: 1개
//		100: 2개
//		50: 1개
//		10: 1개
//		5: 0개
//		1: 0개

//		위와같이 금액을 입력하면
//		큰 화폐단위부터 계산하여 
//		화폐단위별로 화폐매수를 출려갛는 프로그램을 작성하시오


public class Ex02_NumberOfCurrency {
	public static void main(String[] args) {

//		1.필요한 변수선언
//			(입력금액), (화폐매수),(화폐단위)
//		2.(입력금액)입력
//		3-1.화폐매수 계산
//			[조건] : 큰 화폐단위부터 계산한다
//			-화폐매수 계산
//			(화폐매수)=(입력금액)/(화폐단위)
//				count = 534760 / 50000 = 10
//		3-2-잔액계산
//			(잔액) = (입력금액)%(화폐단위*화폐매수)
//			(잔액) = (입력금액)%(화폐단위*화폐매수)
//		3-3.화폐단위변환
//		50,000/5 = 10,000
//		10,000/2 = 5,000
//		5,000/5 = 1,000
//		1,000/2 = 500
//		
//		4.(화폐단위)가 1보다 크거나 같으면, 반복한다
		
		
//		1.	(입력금액), (화폐매수),(화폐단위)
//		int input;				//입력금액
		int count; 				//화폐매수
		int money = 50000; //큰화폐단위부터 시작//화폐단위
		boolean sw = true; //화폐단위변환
		
//		2.(입력금액)입력		
		System.out.println("금액을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); 
				
//		4.(화폐단위)가 1보다 크거나 같으면, 반복한다
		while(money>=1) {
			
//		3-1.화폐매수 계산	(화폐매수)=(입력금액)/(화폐단위)
			count = input / money;
			System.out.println(money +"\t:"+count+ "개");
//		3-2-잔액계산
			input = input % money;
			
//		3-3.화폐단위변환
//		(화폐단위) = (화폐단위/5)
//		(화폐단위) = (화폐단위/2)
			if(sw) {
				money = money /5;
				sw= false;
			}else {
				money = money/2;
				sw = true;
			}
			
		}
		sc.close();	
	}
}
