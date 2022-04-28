package test.auto;

public class FlyingCar extends Car{
			
	public FlyingCar(Engine engine) {
		super(engine);
	}
	public void CarFlies() {
		System.out.println("차가 날아요~!");
	}
}
