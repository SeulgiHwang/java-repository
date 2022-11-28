package Day08.Ex04_Interface;

//인터페이스 구현 키워드 : implements
public class Television implements RemoteControl {
	//변수 
	private int volume; //음량

	@Override
	public void turnOn() {
		System.out.println("TV 전원을 켭니다");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV 전원을 꿉니다");		
	}

	@Override
	public void setVolume(int volume) {
		//유효성검사
		//볼륨 최댓값을 넘지 못하게 지정
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		//볼륨 최솟값을 넘지 못하게 지정
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		//유효한 볼륨값 지정
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨:"+ this.volume);
	}
	

}
