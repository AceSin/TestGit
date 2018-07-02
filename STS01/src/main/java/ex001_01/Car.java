package ex001_01;

public class Car {
	Tire tire;
	
	public Car() {
		tire = new KoreaTire();
	}
	
	public String getTireBrand() {
		return "Tire : " + tire.getBrand();
	}

}
