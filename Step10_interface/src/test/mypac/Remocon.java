package test.mypac;
/*
 *  [interface]
 *  - �����ڰ� ����. (�ܵ� ��ü ���� �Ұ�)
 *  - ������ �޼ҵ�� ���� �� ����. (�߻� �޼ҵ常 ���� �� �ִ�.)
 *  - �ʵ�� static final ����� ���� �� �ִ�.
 *  - data type�� ������ �� �� �ִ�.
 *  - interface type�� �������� �ʿ��ϸ� ����(implements)Ŭ������ ����
 *    ��ü�� �����ؾ� �Ѵ�.
 *  - Ŭ���� ����� ���� ���������, �������̽��� ���� ������ �����ϴ�.
 */
public interface Remocon {
	//�ʵ�� static final �ʵ常 ���� �� �ִ�.
	//final�� ������ �Ұ� (����� ����� �����), ����� �̸��� �� �빮�ڷ� �ϴ� ���� �Ϲ�����
	public static final String COMPANY="LG";
	public static final double PI=3.14159;
	
	//�޼ҵ�� �߻� �޼ҵ常 ���� �� �� �ִ�.
	public void up();
	public void down();
	
}
