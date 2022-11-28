package Day08.Ex02_Phone;

public class PhoneEx {

	public static void main(String[] args) {
		//객체생성
		SmartPhone smartPhone = new SmartPhone("user");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
