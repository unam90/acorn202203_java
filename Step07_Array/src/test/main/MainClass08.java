package test.main;
/*
 * 
 * 1. cherry, apple, banana, melon, 7
 *    5���� ���ڿ� �߿��� 1���� �����ϰ� ��µǰ� �غ�����.
 *    
 * 2. 5���� ���ڿ� �߿��� 3���� ���ٿ� �ѹ��� �����ϰ� ��µǰ� �غ�����.
 *    ��) cherry | apple | cherry
 *        7 | apple | melon
 *        7 | 7 | 7
 *        
 * - hint
 * 
 * String[] items={"cherry", "apple", "banana", "melon", "7"};
 * 
 * Random ran = new Random();
 * int ranNum=ran.nextInt(5);
 * 
 */

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		String[] items= {"cheery", "apple", "banana", "melon", "7"};
	//1.
		Random ran = new Random();
		int ranNum=ran.nextInt(5);
		
		System.out.println(items[ranNum]);

	//2.
		//0~4 ������ ���� �߿��� ������ ���� 3�� ����
		int num1=ran.nextInt(5);
		int num2=ran.nextInt(5);
		int num3=ran.nextInt(5);
		
		//����� ���ڿ� �����ϱ�
		String line=items[num1]+ " | " +items[num2]+ " | " +items[num3];
		
		//����ϱ�
		System.out.println(line);
		
		//���� ����ϱ�
	
		if (num1==num2 & num1==num3 & num2==num3) {
			System.out.println("������ 100���Դϴ�.");
		}else if(num1==num2||num1==num3||num2==num3){
			System.out.println("������ 50���Դϴ�.");
		}else {
			System.out.println("���Դϴ�.");
		}
	}
	
}
