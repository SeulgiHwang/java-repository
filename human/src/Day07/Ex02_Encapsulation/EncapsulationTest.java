package Day07.Ex02_Encapsulation;

public class EncapsulationTest {
	public static void main(String[] args) {
		
		Encapsulation ac 
		= new Encapsulation (0,"국민은행","123456-01-112233","황슬기");
	
		ac.setDeposit(1000);
		
		int money = ac.getDeposit();
		System.out.println(ac);
		System.out.println("계좌잔액:"+money);
	}
}
