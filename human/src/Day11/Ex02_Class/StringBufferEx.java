package Day11.Ex02_Class;

public class StringBufferEx {
	public static void main(String[] args) {
		//StringBuffer
		//:문자열을 조작하는 클래스
		//->문자열을 추가/수정/삭제 할수있다
//		
//		[0][1][2][3][4][5][6][7]  [8][9][10][11]
//		[T][h][i][s][v][i][s][v]  [J][a][v][a]
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		//append("추가할 문자열") : 문자열 맨뒤에 문자열 추가
		sb.append("is Java");
		System.out.println(sb);
		
		//insert(index,"추가문자열"): 지정한 index위치에 문자열추가
		sb.insert(7," real");
		System.out.println(sb);
		
		//replace(시작index, 끝index+1, "대체문자열") 
		//: 시작 index ~끝 index까지 문자열을 새문자열로 대체
		sb.replace(8, 11, "good");
		System.out.println(sb);
		
		//delete(시작index, 끝index+1)
		//:시작index~끝index 까지 문자열을 삭제
		sb.delete(8, 13);
		System.out.println(sb);
		
		//setLength(길이): 문자열의 길이를 지정
		sb.setLength(4);
		System.out.println(sb);
	}
}
