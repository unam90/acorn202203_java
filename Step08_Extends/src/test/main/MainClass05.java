package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		//�ڽĿ��� ���� �Ϲ� �ڵ���(���ͳ��� �ȵ�)
		HandPhone p1=new HandPhone();
		
		//����! ���� SmartPhone ����;�!!!
		
		//������ ���ο� ������ ������ �Ծ� ���� �� ���� SmartPhone�̾�
		
		//HandPhone�� SmartPhone������ �ٲ����
	    //����� HandPhone �״�� �̱� ������ ������ ��.
		SmartPhone p2=(SmartPhone)p1; // ClassCastException �߻�!
		
		//��¥? ���� ¯�̴�~~
		//�� ���� ���ͳ� �Ѵ�.
		p2.doInternet();
		
	}
}
