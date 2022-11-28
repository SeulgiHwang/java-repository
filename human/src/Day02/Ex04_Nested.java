package Day02;

import java.util.Scanner;

public class Ex04_Nested {
	public static void main(String[] args) {
		
		//정보처리기사 자격증 합격기준
		//4학년, 70점이상 취득
		
		System.out.println("점수 입력:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println("학년 1~4:");
		int year =sc.nextInt();
				
//		if(year == 4) {
//			if(score >= 70) {
//				System.out.println("합격");
//			}else {
//				System.out.println("불합격");
//			}
//		}else {
//			System.out.println("응시자격에 해당되지않습니다 ");
//		}
		
		if(year==4 && score>=70) {
			System.out.println("합격");
		}
		if(year==4 && score<70) {
			System.out.println("불합격");
		}
		if(year != 4) {
			System.out.println("응시자격에 해당되지않습니다 ");
		}
		
		sc.close();
	}
}
