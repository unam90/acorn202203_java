package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵Ǿ����ϴ�.");
		//Ű����κ��� �Է¹��� �� �ִ� ��ü ����
		//system.in���� Ű����κ��� �Է¹��� �� �ִ� ��ü�� �������
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ� �Է�:");
		//���� �Է� �ް� 
		//�ܼ�â�� ���𰡸� �Է��ϰ� ���͸� ġ�� ������ �������� ����
		String str=scan.nextLine();
		//�Է� ���� ���ڿ��� �ֿܼ� ����ϰ� 
		System.out.println(str);
		//����
		System.out.println("main �޼ҵ尡 ����˴ϴ�.");
	}
}
