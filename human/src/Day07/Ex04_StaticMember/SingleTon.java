package Day07.Ex04_StaticMember;

public class SingleTon {
	private static SingleTon instance = new SingleTon();
	
	//생성자를 private으로 정의
	private SingleTon() {
		
	}
	
	//new로 만들지 않고 
	//getInnstance로 호출한다
	//인스턴스(객체)가 생성되지 안았으면, 생성해주고 
	//이미 생성되어 있으면, 생성된 인스턴스를 반환한다
	public static SingleTon getInstance() {
		if (instance == null) {
			instance = new SingleTon();
		}
		return instance;
	}
}
