package test.main;

import java.util.Random;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * ������ ������ ���ڸ� ���� �ʹٸ�
		 * Random ��ü�� Ȱ���ؾ� �Ѵ�.
		 * ���� new Random()�ؼ� ��ü�� ���� �� 
		 * ��ü�� �޼ҵ带 �̿��ؼ� ������ ���ڸ� �� ����.
		 */
		Random ran = new Random(); // �������� ��Ƴ��� ���
		// 0~10 ������ ������ ���� �ϳ��� ���� ranNum �̶�� ���������� ��ƺ�����.
		int ranNum = ran.nextInt(11);
		// 1~45 ������ ������ ���� �ϳ��� ���� ranNum2 ��� ���������� ��ƺ�����.
		int ranNum2 = ran.nextInt(45)+1;
		// true or false �߿� ������ boolean���� ���� isRun �̶�� ���������� ��ƺ�����.
		boolean isRun = ran.nextBoolean();
	}
}
/*
 * [case1]
 * �ʿ��� ��ü�� �����ϱ� ���� �̹� java���� �����Ǵ� Ŭ������ import�ؼ� 
 * ��ü�� �����ϰ� �� ��ü�� non static�޼ҵ带 Ȱ���ؼ� �۾��� �ߴ�.
 */
