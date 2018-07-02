package aop006;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	
	@Pointcut("execution(* housework())")
	private void iampc() {
		
	}
	
	@Before("iampc()")
	public void before(JoinPoint joinPoint) {
		System.out.println("열쇠로 문을 열고 집에 들어간다.");
	}
	
	@After("iampc()")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("문 잠궈");
	}

}
