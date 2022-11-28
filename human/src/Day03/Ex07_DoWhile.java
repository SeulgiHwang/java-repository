package Day03;

import java.util.Scanner;

//####### 점심메뉴판 #######
//1.김밥
//2.설렁탕 
//3.순대국밥
//4.맥도날드
//0.종료

public class Ex07_DoWhile {
	public static void main(String[] args) {
		//변수선언 : 메뉴번호, 메뉴이름
		int menuNo = 0;
		String menuName = "";
		
		//입력란 활성화
		Scanner sc = new Scanner(System.in);
		
		//do~while문 
		//무조건 1회는 실행, 조건 검사하여 반복하는 반복문
		 do {
			 System.out.println("####### 점심메뉴판 #######");
			 System.out.println("1.김밥");
			 System.out.println("2.설렁탕");
			 System.out.println("3.순대국밥");
			 System.out.println("4.맥도날드");
			 System.out.println("0.종료");
			 System.out.print("메뉴번호 : ");
			//메뉴번호 입력받기
			 menuNo=sc.nextInt();
			
			 //메뉴번호에 따른 결과설정
			 switch (menuNo) {
				case 1:menuName ="김밥";
					   break;
				case 2:menuName ="설렁탕";
				       break;
				case 3:menuName ="순대국밥";
				       break;
				case 4:menuName ="맥도날드";
				       break;
				default:
						menuName ="(없음)";
						break;
			}
			
			//출력문(예외제외후 )설정-> 메뉴번호가 0이아니면
			if(menuNo !=0) {
				System.out.println(menuName+"을 먹었습니다");
			}
		} while (menuNo != 0);//->메뉴번호가 0아니면 반복
		 //무한루프 : 조건이 항상 true가 되는 경우 반복이 계속된다.
		 //-반드시 반복문안에 종료조건을 넣어주어야한다
		 System.out.println("메뉴판을 종료합니다");
		 sc.close();
	}
}
