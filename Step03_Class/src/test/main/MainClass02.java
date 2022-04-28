package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	
	public static String myName="김구라";
	
	public static void test() {
		System.out.println("test() 호출됨");
	}
	
	public static void main(String[] args) {
		MyUtil.send();
		MyUtil.version="1.0";
		System.out.println(myName);
		MainClass02.test();
		//클래스에 static이 없을 경우 new MyUtil().send();
		
	}
}
