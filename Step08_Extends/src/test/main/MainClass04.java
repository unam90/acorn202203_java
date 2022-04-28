package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 Phone type p1 이라는 지역변수에 담아보세요.
		Phone p1 = new SmartPhone();
		//p1에 들어있는 참조값을 이용해서 전화를 걸고 싶다면?
		p1.call();
		//p1에 들어있는 참조값을 이용해서 이동 중에 전화를 걸고 싶다면? casting
		//p1은 phone type 이므로 이동 중 전화가 안됨 
		//이동 중 전화 기능을 가지고 있는 HandPhone type p2에 casting해서 넣어주고
		HandPhone p2=(HandPhone)p1;
		//p2로 mobileCall 기능을 호출한다.
		p2.mobileCall();
		
		//객체는 하나만 생성되었고, p1과 p2는 같은 참조값을 가지고 있다.
		boolean result = p1 == p2;
		
		//p1에 들어있는 참조값을 이용해서 인터넷을 하고 싶다면?
		//인터넷을 할 수 있는 기능을 가지고 있는 SmartPhone type p3에 casting해서 넣어주고
		SmartPhone p3=(SmartPhone)p1;
		//p3로 doInternet 기능을 호출한다.
		p3.doInternet();
	}
}
