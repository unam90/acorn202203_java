package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
	/*
	 * Scanner ��ü�� �̿��ؼ� ���ڿ��� 5�� �Է¹޴´�. 
	 * �Է¹��� ���ڿ��� ���ʴ�� �迭�� ����Ǿ�� �Ѵ�.
	 * ��� �� �Է� ���� �� for���� �̿��ؼ� �迭�� �����
	 * ��� ���ڿ��� �ܼ�â�� ������� ����ϴ� �ڵ带 �ۼ��� ������.
	 */
		//�ʿ��� ��ü �����ϱ�
		Scanner scan=new Scanner(System.in);
		String[] msgs=new String[5];
		
		//�Է¹��� ���ڿ��� ���ʴ�� �迭�� �����ϱ�
		for(int i=0; i<msgs.length; i++) {
			System.out.println("���ڿ� �Է�:");
			String msg=scan.nextLine();
			msgs[i]=msg;
		}
		//for���� �̿��ؼ� �迭�� ����� ��� ���ڿ��� �ܼ�â�� ������� ����ϱ�
		for(int i=0; i<msgs.length; i++) {
			String tmp=msgs[i];
			System.out.println(tmp);
		}
	}
}
/*
 * [���� �۾��� �ϱ� ���� �ʿ��� ��ü]
 * �ʿ��� Scanner ��ü ���� 1�� (���� �����ؾ���)
 * �ʿ��� String ��ü ���� 5��
 * �ʿ��� String[] ���� 1�� (���� �����ؾ���)
 */

