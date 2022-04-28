package test.mypac;

public class MyRemocon2 implements Remocon{

	@Override
	public void up() {
		System.out.println("볼륨을 올려요");
	}

	@Override
	public void down() {
		System.out.println("볼륨을 내려요");
		
	}

}
//인터페이스는 클래스가 만들어야 할 메소드의 모양을 강제한다.