package Day05.Inheritance;

//한번에 import하기 : ctrl + shift +o
public class Jiwoo {
	//main() :프로그램이 시작되는 메소드
	public static void main(String[] args) {
		
		//객체생성
		//클래스타입 객체명 =new 클래스명();
		Pickachu Pickachu = new Pickachu();
		
		//(.) 접근 연산자 : 객체의 변수, 메소드에 접근하는 연산자
//		pikachu.energy = 100;
//		pikachu.type = "thunder";

		System.out.println("##########피카츄##########");
		System.out.println("에너지:"+Pickachu.energy);
		System.out.println("타입:"+Pickachu.type);
		System.out.println("공격A"+Pickachu.aAttack());
		System.out.println("공격B"+Pickachu.bAttack());
		System.out.println();
	
	
		Pickachu pikachu20 =new Pickachu(150,"진화");
		
		System.out.println("##########피카츄(Lv.20)##########");
		System.out.println("에너지:"+pikachu20.energy);
		System.out.println("타입:"+pikachu20.type);
		System.out.println("공격A"+pikachu20.aAttack());
		System.out.println("공격B"+pikachu20.bAttack());
		System.out.println();
		
		//라이츄 객체를 기본생성하고 호출해보세요
		Raichu raichu = new Raichu();
		System.out.println("##########라이츄##########");
		System.out.println("에너지:"+raichu.energy);
		System.out.println("타입:"+raichu.type);
		System.out.println("공격A"+raichu.aAttack());
		System.out.println("공격B"+raichu.bAttack());
		System.out.println();
	
		Raichu raichu40 = new Raichu(400,"mega-thunder");
		System.out.println("##########라이츄(Lv.40)##########");
		System.out.println("에너지:"+raichu40.energy);
		System.out.println("타입:"+raichu40.type);
		System.out.println("공격A"+raichu40.aAttack());
		System.out.println("공격B"+raichu40.bAttack());
		System.out.println();
	
	
	}
		
}
	
