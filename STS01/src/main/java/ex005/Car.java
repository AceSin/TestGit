package ex005;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier("tire2")
	Tire tire;
	
	public String getTireBrand() {
		return "Tire : " + tire.getBrand();
	}

}
