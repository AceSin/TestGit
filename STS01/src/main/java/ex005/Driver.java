package ex005;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("/src/main/java/ex005/expert.xml");
		Car car = (Car)context.getBean("car");
		

		
		System.out.println(car.getTireBrand());
	}

}
