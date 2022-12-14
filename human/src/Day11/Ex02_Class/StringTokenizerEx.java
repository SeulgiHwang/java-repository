package Day11.Ex02_Class;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		//StringTokenizer
		//:구분문자를 기준으로 문자열을 분리하는 클래스
		//->구분문자 : 콤마, tap,온점 외 
		//->토큰(token) : 구분문자로 분리된 문자열
		
		String java = " 클래스, 생성자, 상속 , 오버로딩, 오버라이딩, 추상클래스, 인터페이스";
		StringTokenizer st = new StringTokenizer(java,",");
		
		//countTokens() : 분리한 토큰의 개수
		System.out.println("토큰의수: "+st.countTokens());
		
		//hasMoreTokens():토큰이 남아있는지 확인
		// 있으면 true 없으면 false(인터페이스 이후에 없으므로 false)
		while( st.hasMoreTokens()) {
			//nextTokekn():다음 토큰을 반환
			System.out.println(st.nextToken());
		}
	}
}
