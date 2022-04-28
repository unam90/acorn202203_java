package test.main;

import test.auto.CampingCar;
import test.auto.Engine;
import test.auto.FlyingCar;

public class MainClass07 {
	public static void main(String[] args) {
		
		CampingCar car1=new CampingCar(new Engine());
		car1.drive();
		car1.sleepInCar();
		
		FlyingCar car2=new FlyingCar(new Engine());
		car2.CarFlies();
	}
}
