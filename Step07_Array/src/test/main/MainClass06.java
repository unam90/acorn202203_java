package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
	/*
	 * Scanner 객체를 이용해서 문자열을 5번 입력받는다. 
	 * 입력받은 문자열은 차례대로 배열에 저장되어야 한다.
	 * 모두 다 입력 받은 후 for문을 이용해서 배열에 저장된
	 * 모든 문자열을 콘솔창에 순서대로 출력하는 코드를 작성해 보세요.
	 */
		//필요한 객체 생성하기
		Scanner scan=new Scanner(System.in);
		String[] msgs=new String[5];
		
		//입력받은 문자열은 차례대로 배열에 저장하기
		for(int i=0; i<msgs.length; i++) {
			System.out.println("문자열 입력:");
			String msg=scan.nextLine();
			msgs[i]=msg;
		}
		//for문을 이용해서 배열에 저장된 모든 문자열을 콘솔창에 순서대로 출력하기
		for(int i=0; i<msgs.length; i++) {
			String tmp=msgs[i];
			System.out.println(tmp);
		}
	}
}
/*
 * [위의 작업을 하기 위해 필요한 객체]
 * 필요한 Scanner 객체 갯수 1개 (직접 생성해야함)
 * 필요한 String 객체 갯수 5개
 * 필요한 String[] 갯수 1개 (직접 생성해야함)
 */

