package Day01;

public class Ex14_BitOperator {
	public static void main(String[] args) {
		//AND
		//16 십진수->이진수 0001 0000
		//20 십진수->이진수 0001 0100
		//이진수 : 0 또는 1로만 표현한 수 
		
		//&연산
		//0001 0000 //16
		//0001 0100 //20
		//0001 0000 ->16
		System.out.println("&연산");
		int result = 20&16;
		System.out.println(20&16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("============================");
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
		System.out.println();

		//OR연산
		//0001 0100 //20
		//0001 0000 //16
		//---------------
		//0001 0100
		System.out.println("OR연산");
		int result2 =20|16;
		System.out.println(20|16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("============================");
		System.out.println(Integer.toBinaryString(result2));
		System.out.println(result2);
		System.out.println();
		
		//XOR연산
		//0001 0100 //20
		//0001 0000 //16
		//--------------
		//0000 0100
		System.out.println("XOR연산");
		int result3 =20^16;
		System.out.println(20^16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("============================");
		System.out.println(Integer.toBinaryString(result3));
		System.out.println(result3);	
		System.out.println();
		
		//NOT연산
		//~0001 0100 //20
		//--------------
		// 1110 1011 
		System.out.println("   ");
		System.out.println("NOT연산");
		int result4 = ~20;
		System.out.println(~20);
		System.out.println("============================");
		System.out.println(Integer.toBinaryString(~20));
		System.out.println(result4);	
		System.out.println();
		
		
		//int 4byte = 32bit
		// 0000 0000 0000 0000 0000 0000 0001 0100 //20
		// 1111 1111 1111 1111 1111 1111 1110 1011 //21

		//부호가 있는 수의 경우는 최상위비틑 부호비트로 사용한다.
		//최상위비트
		
		//시프트연산
		//산술시프트 (<<,>>)
		// :부호비트 유지하면서, 왼쪽 또는 오른쪽으로 이동시키는 연산자
		//논리시프트 (<<<,>>>)
		// :부호비트를 포함해서, 전체를 왼쪽 또는 오른쪽으로 이동시키는 연산자
		
		//0000 0010 ->2
		//0000 0100 ->4 상기를 <<1한경우(2<<1);
		//0000 1000 ->8 상기를 <<1한경우(2<<2);
		//0001 0000 ->16 상기를 <<1한경우(2<<3);
		System.out.println("============================");
		System.out.println("산술시프트");
		System.out.println(2<<1);
		System.out.println(2<<2);
		System.out.println(2<<3);
		System.out.println();
		
		System.out.println(16>>0);
		System.out.println(16>>1);
		System.out.println(16>>2);
		System.out.println(16>>3);
		System.out.println();
		
		System.out.println(-2<<1);
		System.out.println(-2<<2);
		System.out.println(-2<<3);
		System.out.println();

		System.out.println("============================");
		System.out.println("논리시프트");
		System.out.println(2>>>1);
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(-2));
		//-2
		//11111111111111111111110
		//01111111111111111111111
		//00000000000000000000000
		
		
		
		
		
	}
}
