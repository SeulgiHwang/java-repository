package Day08.Ex05_NoNameObject;

public interface RemoteControl {
	//인터페이스변수들은 public satic final 로 자동으로 선언된다
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상메소드
	//public abstract 생략하고 작성할 수 있다
	void turnOn(); 				//전원on
	void turnOff();				//전원off
	void setVolume(int volume); //볼륨설정

	//디폴트메소드
	//:구현객체에 할당될 인스턴스 메소드 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("음소거설정");
		}else {
			System.out.println("음소거해제");
		}
	}
	
	//static 메소드(정적메소드)
	//구현객체가 없어도 인터페이스만으로 호출이 가능한 메소드
	static void changBattery() {
		System.out.println("배터리를 교환");
	}
}

