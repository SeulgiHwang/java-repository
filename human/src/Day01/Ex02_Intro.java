package Day01;

import java.util.Scanner;
//Scanner를 외부파일인데, 사용하겠다고 끌어오겠다는것
public class Ex02_Intro {
	
	public static void main(String[] args) {
		System.out.println("이름, 주소, 자기소개를 공백을 두고 입력하세요");
		
		//next는 String이 기본이므로 생략, 나머진 기재
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("이름:"+ name);
		
		String address =sc.next();
		System.out.println("주소:"+ address);
		
		String intro = sc.next();
		System.out.println("자기소개:"+ intro);
		
		
		
		System.out.println("나이, 키를 공백을 두고 입력하세요");
		int age = sc.nextInt();
		System.out.println("나이:"+age);
		
		double height = sc.nextDouble();
		System.out.println("키:"+ height);
		
		//sc라는 객체를 하기부터는 사용하지않겠다는것 ->경고창없애려고
		sc.close();
	}
}
