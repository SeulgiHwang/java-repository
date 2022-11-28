package Day09.Ex06_EventListener;

public class ButtonEx {
	public static void main(String[] args) {
		//버튼 객체 생성
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
	}
}
