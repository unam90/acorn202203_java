package test.main;

import test.mypac.Car;
import test.mypac.Messenger;

public class MainClass02 {
	public static void main(String[] args) {
		
		//Messenger Ŭ������ ���� static �޼ҵ� 3���� ȣ���ϴ� code�� �ۼ��غ�����.
		
		Messenger.sendMessage("����");
		Messenger.getMessage();
		Messenger.useCar(new Car());
	}
}
