package test.main;

import test.mypac.Rect;

/*
 *	Rect��� �̸��� Ŭ������ ������� �Ѵ�.
 *
 * 	�ش� Ŭ������ ��ü�� �����ϰ� 
 * 
 * 	�簢���� ����(width), ����(height)�� �ʵ忡 �����ϰ�
 * 
 *  showArea()�� ȣ���ϸ� �簢���� ���̰� �ܼ�â�� ��µ� �� �ֵ��� 
 *  
 *  Rect Ŭ������ ������ ������.
 */
public class MainClass05 {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.width=10;
		r.height=10;
		r.showArea();
		//�޼ҵ尡 �������ִ� ���� ������ ��ƺ���
		int area=r.getArea();
	}
}
