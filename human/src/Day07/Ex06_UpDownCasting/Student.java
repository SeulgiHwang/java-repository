package Day07.Ex06_UpDownCasting;

public class Student extends Person {

	int grade;
	String major;
	
	public Student() {
		//super가 들어가지않는것은 생성자는 상속되지않으므로
		this("이름없음",0,0,"없음");
	}
	
	public Student(String name, int age, int grade, String major) {
		super(name,age);
		this.grade = grade;
		this.major = major;
	}
	
	//Person에 있는 work에 오버라이딩 
	//"일을합니다"-> "공부를 합니다"
	public String work() {
		return "공부를 합니다.";
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
}
