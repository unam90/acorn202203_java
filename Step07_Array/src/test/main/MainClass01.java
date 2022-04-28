package test.main;
/*
 * java에서 배열도 객체이다.
 * 즉, 배열은 참조데이터 type이다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개를 저장하고 있는 배열
		int[] nums={10, 20, 30, 40, 50};
		// double type 5개를 저장하고 있는 배열
		double[] num2= {10.1, 10.2, 10.3, 10.4, 10.5};
		// boolean type 5개를 저장하고 있는 배열	
		boolean[] truth = {true, false, false, true, true};
		// String type (참조데이터 type) 5개를 저장하고 있는 배열
		String[] names={"김구라","해골","원숭이","주뎅이","덩어리"};
		
		// 배열의 각각의 방 참조하기
		int result1=nums[0]; //10
		double result2=num2[1]; //10.2
		boolean result3=truth[2]; //false
		String result4=names[3]; //"주뎅이"
	
		// 배열 객체의 메소드와 필드 사용해보기
		int[] cloned=nums.clone();
		int size=nums.length;		
	}
}
//java에서 배열의 방의 사이즈는 한번 설정하면 변경할 수 없음. 고정배열.
//이미 들어갈 갯수가 정해진 경우 사용
