package test.main;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * 랜덤한 무작위 숫자를 얻어내고 싶다면
		 * Random 객체를 활용해야 한다.
		 * 따라서 new Random()해서 객체를 생성 후 
		 * 객체의 메소드를 이용해서 무작위 숫자를 얻어내 보자.
		 */
		Random ran = new Random(); // 참조값을 담아놓고 사용
		// 0~10 사이의 랜덤한 정수 하나를 얻어내서 ranNum 이라는 지역변수에 담아보세요.
		int ranNum = ran.nextInt(11);
		// 1~45 사이의 랜덤한 정수 하나를 얻어내서 ranNum2 라는 지역변수에 담아보세요.
		int ranNum2 = ran.nextInt(45)+1;
		// true or false 중에 랜덤한 boolean값을 얻어내서 isRun 이라는 지역변수에 담아보세요.
		boolean isRun = ran.nextBoolean();
	}
}
/*
 * [case1]
 * 필요한 객체를 생성하기 위해 이미 java에서 제공되는 클래스를 import해서 
 * 객체를 생성하고 그 객체의 non static메소드를 활용해서 작업을 했다.
 */
