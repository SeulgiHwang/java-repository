package Day01;

public class Ex10_Casting {
	public static void main(String[] args) {
		
		
		//자동타입변환
		//(큰 데이터타입) <=(작은 데이터타입);
		//: 작은 데이터타입을 큰 데이터타입으로 자동으로 타입을 변환
		float value1 = 3;
		long value2 =5;
		double value3 =7;
		byte value4 = 9; //예외 -> int가 127이하이면작다고본다 >저장범위내에 값일때는 예외적으로 자동변환
		short value5 = 11; //예외 ->저장범위내에 값일때는 예외적으로 자동변환
		
		//강제타입변환
		//(작은 데이터타입) <= (???)(큰데이터타입);
		//: 변환할 데이터타입을 ()타입변환 연산자 안에 명시적으로 작성하여 타입을 변환
		byte value6=(byte) 128;
		int value7 =(int) 3.5;
		float value8 = (float) 7.5;
		
		
		System.out.println("value1: "+value1);
		System.out.println("value2: "+value2);
		System.out.println("value3: "+value3);
		System.out.println("value4: "+value4);
		System.out.println("value5: "+value5);
		System.out.println("value6: "+value6);
		System.out.println("value7: "+value7);
		System.out.println("value8: "+value8);
	}
}
