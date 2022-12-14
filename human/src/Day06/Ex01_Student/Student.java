package Day06.Ex01_Student;

public class Student {
	
	//학생특성 //이름 나이 학번 전공
	//변수
	String name; 
	int age;
	String stdNo;
	String major;
	
	//생성자 
	//기본생성자??
	public Student() {
	}
	//선언한 생성자??
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}

	//학생행동
	//메소드
	//void:반환타입을 지정하지않을때 사용하는 키워드
	public void study(String subject) {
		System.out.println(subject + "(을/를)공부합니다");
	}
	//반환타입이 void면, return을 작성하지않는다
	
	//점수의 평균을 반환하는 메소드
	public double getScore(int score1, int score2){
		double average = 0.0;
		//평균 = 합계/개수
		average = (score1 +score2)/2;
		return average;
	}
	
	//메소드오버로딩
		public double getScore(int score1,  int score2, int score3){
			double average = 0.0;
			//평균 = 합계/개수
			//큰타입 + 작은타입=>큰타입
			//(double)/(int) => (double)
			average = (double)(score1 + score2+ score3)/3;
			return average;
		}
		
	//메소드 오버로딩
		public double getScore(int[] scores){
			double average = 0.0;
			int sum =0;
			for(int score : scores) {
				//(최종합계)=(이전합계)+(과목점수);
				sum += score;
			}
			average = (double)sum/scores.length;
			return average;
		}
}
