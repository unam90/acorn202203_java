package test_main;
/*
 * 3. 비교연산자 테스트
 * 	  비교연산의 결과는 boolean type을 리턴해준다.
 * ==, !=, >, >=, <, <=
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		boolean result1 = 10 == 10; //true
		boolean result2 = 10 != 10; //false
		boolean result3 = 10 > 100; //false
		boolean result4 = 10 >= 10; //true
		boolean result5 = 10 < 100; //true
		boolean result6 = 10 <= 10; //true
		
		// String type 변수 name에 null 대입하기
		// null은 참조데이터 type이 담긴 빈 공간
		String name=null;
		
		// null인지 아닌지 비교가 가능하다 (즉 java에서 null값은 비교가 가능)
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
	}
}
