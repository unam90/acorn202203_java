package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다");
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		
		//국어점수와 영어점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해보세요.(소수점도 나오게)
		
		double avg = (kor+eng)/2.0; // double avg = (kor+eng)/2f 혹은 2d 
		// 정수끼리 연산을 하면 정수밖에 안나옴. 둘중에 하나를 실수로 만들어줘야함.
		
		System.out.println("국어점수와 영어점수의 평균은 " + avg + "입니다");
		
	}
}
