package Day01;

public class Ex13_LogicalOperator {
	public static void main(String[] args) {
		
		//논리연산자
		
		//AND(&&)
		//A AND B : A와 B둘다 true일 때, 결과가 true
		//A | B | 결과
		//F | F | F
		//T | F | F
		//F | T | F
		//T | T | T
		System.out.println(true && true); //T
		System.out.println(true && false); //F
		System.out.println(true && (5<3)); //F
		System.out.println((5 <+ 10)&& (7 > 2)); //T
		System.out.println();
		
		//OR(||)
		//A OR B : A또는 B가 true일 때, 결과가 true
		//A | B | 결과
		//F | F | F
		//T | F | T
		//F | T | T
		//T | T | T
		
		
		System.out.println(true || true); //T
		System.out.println(true || false); //T
		System.out.println(false || (100<50)); //F
		System.out.println((5 < 20)&& (5 > 2)); //T
		System.out.println();
		
		//XOR (^)
		// A XOR B : A와 B가 다를 때, 결과는 True
		System.out.println("xor");
		System.out.println(true^true); //t,t이므로 f
		System.out.println(true^false); //t,f이므로 t
		System.out.println(false^(5<3)); //f,f이므로 f
		System.out.println((9>=2) ^ (7>4)); //t,t이므로 f
		System.out.println();
		
		//NOT(!)
		//!A : A가 true면 false로, false면 true로 반전
		System.out.println("NOT");
		System.out.println(!true);
		System.out.println(!false);
		
		
		//하기 노란색으로 밑줄처진 Dead Code는 앞에서 이미 결정되어 없어도되므로
		//쇼트서킷: 논리연산의 결과를 미리알아서 남은 논리식을 확인하지않는것
		//비트연산자의 경우는 쇼트서킷이 적용되지않는다
		
		int value1 =3;
		System.out.println(false && ++value1 >10); //f,f->f
 		System.out.println(value1); //3
		
		int value2 = 3;
		System.out.println(false & ++value2 >6); //f,f->f
		System.out.println(value2); //4
		
		int value3= 3;
		System.out.println(true || ++value3 >6); //t->t
		System.out.println(value3); //3
		
		int value4= 3;
		System.out.println(true | ++value4 >2); //t,t->t
		System.out.println(value4); //4
		
		
		
	}
}
