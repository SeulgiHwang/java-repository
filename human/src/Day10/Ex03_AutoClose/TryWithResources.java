이해못함
package Day10.Ex03_AutoClose;
/*
 * 	try문의 ()안에서 자동으로 자원해제시킬 객체를 생성한다
 * 	try(클래스객체명 = new 클래스()){
 * 	}catch(예외클래스객체명){
 * 	}
 */
import java.io.FileInputStream;

public class TryWithResources {
	public static void main(String[] args) {
		
		//try-with-resources문
		//:try(자동으로 자원해제할 객체생성){}
		//AutoCloseable 인터페이스를 구현한 클래스이어야 자동 자원해제가 가능
		try(FileInputStream fis = new FileInputStream("test.txt")) {
			
			int read;
			
			//test.txt파일을 FileInputStream으로 읽어와서
			//read() 메소드를 호출하여 한 글자씩 가져온다
			//가져올 데이터가 없으면 -1을 반환하기 때문에 반복을 멈춘다.
			while((read = fis.read()) != -1) {
				System.out.print((char)read);
			}
			
		} catch (Exception e) {
			System.out.println("예외 발생..");
		}
	}
}
