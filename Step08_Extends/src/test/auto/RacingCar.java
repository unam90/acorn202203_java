package test.auto;

public class RacingCar extends Car{

	public RacingCar(Engine engine) {
		super(engine);
	}
	@Override
	public void drive() {
		/*
		 *  ������(�������̵�) �� �θ� �޼ҵ带 ȣ���ؾ� ���� ������
		 *  ��Ȳ�� ���� �ٸ���.
		 *  � ��쿡�� �θ��� �޼ҵ带 ȣ���� ���� ������ ��ü��
		 * 	����� ������ ���ϴ� ��찡 �ִ�.
		 *  �׷� ��쿡�� �θ��� �޼ҵ带 �ݵ�� ȣ���� �־�� �Ѵ�.
		 */
		super.drive();
		System.out.println("���ݴ� ������ �ٿ��� ��û ������ �޷���");
	}
	
}
