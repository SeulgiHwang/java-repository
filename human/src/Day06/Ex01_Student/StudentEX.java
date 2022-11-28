package Day06.Ex01_Student;

public class StudentEX {
	public static void main(String[] args) {
		//Student 객체 생성
		Student student = new Student();
		student.name = "김휴먼";
		student.age = 20;
		student.stdNo = "20225055";
		student.major = "컴퓨터공학과";
	
		//Student2 객체생성
		Student student2 = new Student("황슬기님", 20, "19920155", "Accounting");
		
		int[] scores = {10, 20, 30, 40, 50};
		int[] scores2 = {100, 100, 100, 90, 95};
	
		System.out.println("####학생1####");
		System.out.println("학생1 - 이름: "+ student.name);
		System.out.println("학생1 - 나이: "+ student.age);
		System.out.println("학생1 - 학번: "+ student.stdNo);
		System.out.println("학생1 - 전공: "+ student.major);
		System.out.println("학생1 - 중간고사점수: "+ student.getScore(100,77));
		System.out.println("학생1 - 기말고사점수: "+ student.getScore(100,90,80));
		System.out.println("학생1 - 최종점수: "+ student.getScore(scores));
		student.study("JAVA");
		System.out.println();

		System.out.println("####학생2####");
		System.out.println("학생2 - 이름: "+ student2.name);
		System.out.println("학생2 - 나이: "+ student2.age);
		System.out.println("학생2 - 학번: "+ student2.stdNo);
		System.out.println("학생2 - 전공: "+ student2.major);
		System.out.println("학생2 - 중간고사점수: "+ student.getScore(100,90));
		System.out.println("학생2 - 기말고사점수: "+ student.getScore(100,90,80));
		System.out.println("학생2 - 최종점수: "+ student.getScore(scores2));
		student.study("JAVA");
	}
}