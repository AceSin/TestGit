package ex004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	Tire tire;
	
	public String getTireBrand() {
		return "Tire : " + tire.getBrand();
	}

}
