package Day01;

public class Ex15_RelationOperator {
	public static void main(String[] args) {
		//비교연산 :크기비교
		// >,<,>=,<= 와 같은 크기를 비교하는 연산자
		System.out.println(7>3); //t
		System.out.println(7<3); //f
		System.out.println(7>=3); //t
		System.out.println(7<=3); //f
		System.out.println();
		
		//비교연산 :등가비교
		// ==,!= 와 같은 값인지 여부를 비교하는 연산자
		int a = 10;
		int b = 5;
		int c = 10;
		System.out.println(a == b ); //f
		System.out.println(a != b ); //t
		System.out.println(a == c ); //t
		System.out.println(a != c ); //f
		System.out.println();
	}
}
