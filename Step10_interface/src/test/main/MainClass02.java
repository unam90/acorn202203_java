package test.main;

import test.mypac.MyRemocon2;
import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		//���� Ŭ������ test.mypac ��Ű���� ���Ϸ� ���� useRemocon() �޼ҵ带 ���⼭ ȣ���� ������.
		Remocon r = new MyRemocon2();
		useRemocon(r);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
