package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass04 {
	public static void main(String[] args) {
		//SmartPhone ��ü�� �����ؼ� Phone type p1 �̶�� ���������� ��ƺ�����.
		Phone p1 = new SmartPhone();
		//p1�� ����ִ� �������� �̿��ؼ� ��ȭ�� �ɰ� �ʹٸ�?
		p1.call();
		//p1�� ����ִ� �������� �̿��ؼ� �̵� �߿� ��ȭ�� �ɰ� �ʹٸ�? casting
		//p1�� phone type �̹Ƿ� �̵� �� ��ȭ�� �ȵ� 
		//�̵� �� ��ȭ ����� ������ �ִ� HandPhone type p2�� casting�ؼ� �־��ְ�
		HandPhone p2=(HandPhone)p1;
		//p2�� mobileCall ����� ȣ���Ѵ�.
		p2.mobileCall();
		
		//��ü�� �ϳ��� �����Ǿ���, p1�� p2�� ���� �������� ������ �ִ�.
		boolean result = p1 == p2;
		
		//p1�� ����ִ� �������� �̿��ؼ� ���ͳ��� �ϰ� �ʹٸ�?
		//���ͳ��� �� �� �ִ� ����� ������ �ִ� SmartPhone type p3�� casting�ؼ� �־��ְ�
		SmartPhone p3=(SmartPhone)p1;
		//p3�� doInternet ����� ȣ���Ѵ�.
		p3.doInternet();
	}
}
