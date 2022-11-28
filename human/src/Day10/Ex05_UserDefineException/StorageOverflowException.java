
package Day10.Ex05_UserDefineException;
//사용자 정의 예외 클래스 선언
//public claass ???? Exception extends Exception{}
public class StorageOverflowException extends Exception{
	//생성자
	public StorageOverflowException() {
		
	}
	
	//생성자
	//부모클래스것을 호출 message
	public StorageOverflowException(String message) {
		super(message);
	}
}
