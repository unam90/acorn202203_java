package test.main;
/*
 *  [기본 data type의 참조 data type]
 * 
 *  byte   : Byte
 *  short  : Short
 *  int    : Integer
 *  long   : Long
 * 
 *  float  : Float
 *  double : Double
 * 
 *  char   : Character
 *  boolean: Boolean
 * 
 *  - 때로는 기본데이터 type의 참조데이터 type이 필요할 때가 있다.
 *  - 기본데이터 type을 객체에 포장(boxing)하는 형태이다.
 *  - boxing과 unboxing은 자동으로 되기 때문에 프로그래머가 신경 쓸 필요는 없다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//기본 데이터 type
		int num1=10;
		//참조 데이터 type
		Integer num2=10;
		
		//참조 데이터 type 이지만 기본 데이터 type처럼 사용할 수 있다.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
	
		//숫자를 문자로 바꾸기 10 = "10"
		String strNum=num2.toString();
		
		//문자를 숫자로 바꾸기
		String strNum2="999";
		//Integer 클래스의 static 메소드를 이용하면 된다.
		int result4=Integer.parseInt(strNum2);
		
	}
}
