package Day07.Ex01_ObjectArray;

import java.util.Scanner;

/**
 * 책제목, 저자명을 갖는 Book이라는 클래스를 정의하고
 * Book 클래스타입의 객체배열을 생성하여 
 * 사용자로부터 책 3권을 입력받아 출력하는 프로그램을 작성하시오
 */
//외부에 클래스만들수있음
class Book{
	//정의 //책제목 저자
	String title, author;

	//this아래서 호출함
	public Book() {
		this("제자없음", "작자미상");
	}
	
	//this 공통실행코드포함
	public Book(String title, String author) {
	this.title = title;
	this.author = author;
	}
	
	//부모한테 상속받았지만 무시하고 다른것을 호출할수있는것
	@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + "]";
		}
}


public class BookArray {
	public static void main(String[] args) {
		//책3권에 대해 Book타이브이 객체 배열 선언 및 생성
		Book[] bookArray = new Book[3];
		Scanner sc = new Scanner(System.in);

		//사용자입력
		for(int i=0; i< bookArray.length; i++) {
			System.out.println("제목:");
			String title = sc.nextLine();

			System.out.println("저자:");
			String author = sc.nextLine();
					
			bookArray[i] = new Book(title,author);
		}
		
		//출력
		for(Book book : bookArray) {
			System.out.println(book);
		}
		sc.close();
	}
}
