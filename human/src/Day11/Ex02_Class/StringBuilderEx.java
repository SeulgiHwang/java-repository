package Day11.Ex02_Class;
//문자열 수정하는 ////함수??키워드?? 클래스?? => 스트링 버퍼와 유사함
public class StringBuilderEx {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("휴먼 ");
		sb.append("교욱센터 ");
		System.out.println(sb.toString());
		
		sb.insert(7,"학원");
		System.out.println(sb.toString());
		
		sb.setCharAt(0, 'H');
		System.out.println(sb.toString());
		
		sb.replace(1, 3, "uman");
		System.out.println(sb.toString());
		
		sb.delete(0,6);
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("글자수: "+length);
	}
}
