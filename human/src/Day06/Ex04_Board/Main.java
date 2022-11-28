package Day06.Ex04_Board;

import java.util.Scanner;

public class Main {
	
	static int max = 10; //게시글 최대 10개 제한
	static Board[] boardList = new Board[max];
	static int index =0; //현재 게시글 순서번호(0~ max-1)
	
	public static void showMenu() {
		
		System.out.println("#####게시판#####");
		System.out.println("1.게시글목록");
		System.out.println("2.게시글읽기");
		System.out.println("3.게시글쓰기");
		System.out.println("4.게시글수정");
		System.out.println("5.게시글삭제");
		System.out.println("##########번호입력:");
	}
	
	//게시글 목록
	public static void list() {
		System.out.println("#게시글 목록");
		for(Board board : boardList) {
			System.out.println(board);
		}
	}
	
	//게시글 읽기
	public static void read(int boardNo) {
		Board board = boardList[boardNo-1];
		System.out.println(board);
	}
	
	//게시글 쓰기 
	//board에 title,content,write이 들어가있음
	public static void write(Board board) {
		if(index<max) {
			boardList[index]=board;
			index++;//다음 게시글에 접근
			board.setBoardNo(index);
			System.out.println("게시글이 작성되었습니다");
		}else {
			System.out.println("게시글 목록 꽉 찼습니다");
		}
	}
	
	//게시글수정
	public static void update(int boardNo,Board board) {
		//0 1 2 3 4 ...
		//1 2 3 4 5 ...
		if(boardNo>=1 && boardNo <= max) {
			boardList[boardNo-1] = board;
		}else {
			System.out.println("게시글이 존재하지않습니다");
		}
	}
	
	//게시글 삭제 
	public static void delete(int boardNo) {
		if(boardNo>=1 && boardNo <= max) {
			//null : 값이 없음
			boardList[boardNo-1] = null;
		}else {
			System.out.println("게시글이 존재하지않습니다");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		int count = 0; //게시글 갯수
		
		//메뉴판 반복하여 출력
		do {
			showMenu();
			//입력
			menuNo = sc.nextInt();
			sc.nextLine(); //엔터를 버퍼에서 빼준다

			int boardNo = 0;
			String title ="";
			String content = "";
			String writer = "";
			Board board = null;
			
			//메뉴선택
			switch (menuNo) {
				//게시글목록
				case 1: list();
						break;
				//게시글읽기
				case 2: System.out.println("게시글번호:");
						boardNo = sc.nextInt();
						sc.nextLine(); //엔터를 버퍼에서 빼준다
						read(boardNo);
						break;
				//게시글쓰기
				case 3: System.out.print("제목:");
						title = sc.nextLine();
						System.out.print("내용:");
						content = sc.nextLine();
						System.out.print("작성자:");
						writer = sc.nextLine();
						board = new Board(title, content, writer);
						write(board);
						break;
				//게시글수정
				case 4: System.out.println("게시글번호:");
						boardNo = sc.nextInt();
						sc.nextLine(); //엔터를 버퍼에서 빼준다
						System.out.println("제목:");
						title = sc.nextLine();
						System.out.println("내용:");
						content = sc.nextLine();
						System.out.println("작성자:");
						writer = sc.nextLine();
						board = new Board(title, content, writer);
						update(boardNo, board);
						break;	
				
				//게시글삭제
				case 5: System.out.println("게시글번호:");
						boardNo= sc.nextInt();
						sc.nextLine(); //엔터를 버퍼에서 빼준다
						delete(boardNo);
						break;
				
				default:
					break;
			}
		} while (count <= max);
		
			
	}
}
