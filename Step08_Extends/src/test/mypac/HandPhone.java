package test.mypac;

public class HandPhone extends Phone{
	//확장 : 기존 부모클래스에 있는 기능을 상속받아 확장해서 기능을 더 만드는 것.
	
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출됨");
	}
	//메소드
	public void mobileCall() {
		System.out.println("이동 중에 전화를 걸어요");
	}
	//사진 찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}
}
