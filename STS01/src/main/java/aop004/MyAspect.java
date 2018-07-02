package aop004;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집에 들어간다.");
	}
	
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("문 잠궈");
	}

}
