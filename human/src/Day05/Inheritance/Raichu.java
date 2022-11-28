package Day05.Inheritance;
//상속키워드:자식클래스 extends 부모클래스
public class Raichu extends Pickachu {
	//생성자 자동완성 단축키
	//Alt+shift+S:C
	public Raichu() {
		super(200, "super-thuder");
	}

	public Raichu(int energy, String type) {
		super(energy, type);
	}
	//메소드 오버라이딩 :메소드재정의
	//Alt+Shift+s/v

	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	
};
