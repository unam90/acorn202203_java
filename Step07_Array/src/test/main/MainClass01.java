package test.main;
/*
 * java���� �迭�� ��ü�̴�.
 * ��, �迭�� ���������� type�̴�.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5���� �����ϰ� �ִ� �迭
		int[] nums={10, 20, 30, 40, 50};
		// double type 5���� �����ϰ� �ִ� �迭
		double[] num2= {10.1, 10.2, 10.3, 10.4, 10.5};
		// boolean type 5���� �����ϰ� �ִ� �迭	
		boolean[] truth = {true, false, false, true, true};
		// String type (���������� type) 5���� �����ϰ� �ִ� �迭
		String[] names={"�豸��","�ذ�","������","�ֵ���","���"};
		
		// �迭�� ������ �� �����ϱ�
		int result1=nums[0]; //10
		double result2=num2[1]; //10.2
		boolean result3=truth[2]; //false
		String result4=names[3]; //"�ֵ���"
	
		// �迭 ��ü�� �޼ҵ�� �ʵ� ����غ���
		int[] cloned=nums.clone();
		int size=nums.length;		
	}
}
//java���� �迭�� ���� ������� �ѹ� �����ϸ� ������ �� ����. �����迭.
//�̹� �� ������ ������ ��� ���
