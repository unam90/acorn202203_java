package test.main;

import test.mypac.MyWeapon2;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//�������� ���� Ŭ������ ����� ��ü ������ �ؼ� �Ʒ��� useWeapon() �޼ҵ带 ȣ���� ������.
		Weapon w1 = new MyWeapon2();
		MainClass02.useWeapon(w1);
	}
	//�� �޼ҵ�� ���� ������ ������ �ϴ� �޼ҵ��� ��������.
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
