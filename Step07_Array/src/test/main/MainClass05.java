package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//키보드로부터 입력받을 수 있는 객체 생성
		//system.in에는 키보드로부터 입력받을 수 있는 객체가 들어있음
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		//한줄 입력 받고 
		//콘솔창에 무언가를 입력하고 엔터를 치기 전까지 움직이지 않음
		String str=scan.nextLine();
		//입력 받은 문자열을 콘솔에 출력하고 
		System.out.println(str);
		//종료
		System.out.println("main 메소드가 종료됩니다.");
	}
}
