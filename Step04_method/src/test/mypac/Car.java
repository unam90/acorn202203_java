package test.mypac;
/*
 * class 의 역할
 * 
 * 1. 객체의 설계도 역할 
 * 
 * 2. 데이터 타입의 역할
 * 
 * 3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
	//저장소(field) : 데이터의 저장소 / 메소드에서 사용하는 부품들을 담고있을 수 있다.
	public String name; // 필드는 값을 넣어주지 않으면 기본값이 들어감 name = null
	
	//달리는 기능(method)
	public void drive() {
		System.out.println(this.name+" 이(가) 달려요!");
	}
	//멈추는 기능(method)
	public void stop() {
		System.out.println("멈춰요!");
	}

}
