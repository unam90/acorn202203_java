package test.mypac;
/*
 * class �� ����
 * 
 * 1. ��ü�� ���赵 ���� 
 * 
 * 2. ������ Ÿ���� ����
 * 
 * 3. static �ʵ�� �޼ҵ带 �����ϴ� ����
 */
public class Car {
	//�����(field) : �������� ����� / �޼ҵ忡�� ����ϴ� ��ǰ���� ������� �� �ִ�.
	public String name; // �ʵ�� ���� �־����� ������ �⺻���� �� name = null
	
	//�޸��� ���(method)
	public void drive() {
		System.out.println(this.name+" ��(��) �޷���!");
	}
	//���ߴ� ���(method)
	public void stop() {
		System.out.println("�����!");
	}

}
