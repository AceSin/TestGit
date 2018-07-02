package ex001_01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarTest {
	
	@Test
	public void bread_test() {
		Car car = new Car();
		
		assertEquals("Tire : korea", car.getTireBrand());
	}

}
