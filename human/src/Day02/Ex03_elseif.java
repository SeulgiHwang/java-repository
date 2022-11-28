package Day02;

import java.util.Scanner;

public class Ex03_elseif {
	public static void main(String[] args) {
		//정수를 하나 입력받아서 
		//실수를 하나 입력받아서
		System.out.println("점수를 입력해주세요");
		
		Scanner sc = new Scanner(System.in);
		//input이 변수
//		int input = sc.nextInt();
		double score = sc.nextDouble();
		String result = "";
		
		
		//90점 이상이면 A
		if(score>=90) {
//			System.out.println("A입니다 점수:"+score);
			result= "A:"+score;
		}
		//80점 이상이면 B
		else if(score>=80) {
//			System.out.println("B입니다 점수:"+score);
			result= "B:"+score;
		}
		//70점 이상이면 C
		else if(score>=70) {
//			System.out.println("C입니다 점수:"+score);
			result= "C:"+score;

		}
		//60점 이상이면 D
		else if(score>=60) {
//			System.out.println("D입니다 점수:"+score);
			result= "D:"+score;

				}
		//60점 미만이면 F
		else if(score<60) {
//			System.out.println("F입니다 점수:"+score);
			result= "F:"+score;

		sc.close();
		}
		System.out.println("학점은 "+result);
	}
}
