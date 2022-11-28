package Day08.Ex07_InterfaceExtends;

import Day06.Ex04_Board.Main;

public class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("method A실행");		
	}

	@Override
	public void methodB() {
		System.out.println("method B실행");		
	}

	@Override
	public void methodC() {
		System.out.println("method C실행");		
		
	}
	
}
