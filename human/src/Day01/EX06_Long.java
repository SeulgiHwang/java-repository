package Day01;

public class EX06_Long {
	public static void main(String[] args) {
		long ln1 = 1000;
		long ln2 = 2100000000;
		//long type이면 뒤에 L을 붙여줘야 오류가 나지않음 
		long ln3 = 2200000000L;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		int maxOverflow = max + 1;
		int minOverflow = max- 1;
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		System.out.println("maxOverflow:"+maxOverflow);
		System.out.println(minOverflow);
		
		System.out.println(ln1);
		System.out.println(ln2);
		System.out.println(ln3);
		
	}
}
