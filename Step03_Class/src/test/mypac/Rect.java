package test.mypac;

public class Rect {
	//�ʵ�
	public int width;
	public int height;
	//������ �ֿܼ� ����ϴ� �޼ҵ�
	public void showArea() {
		//���� ����
		int area = width*height;
		//�ֿܼ� ����ϱ�
		System.out.println("����:"+area);
	}
	//������ �޼ҵ带 ȣ���� ������ �������ִ� �޼ҵ�
	public int getArea() {
		int area = width*height;
		return area;
	}
}
