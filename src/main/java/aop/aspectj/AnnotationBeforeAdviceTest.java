package aop.aspectj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationBeforeAdviceTest {
	
	@Test
	public void testAnnotationBeforeAdvice() { 
		System.out.println("======================================");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("advice2.xml");
		IHelloWorldService helloworldService = ctx.getBean("helloWorldService", IHelloWorldService.class);
		helloworldService.sayBefore("before");
		System.out.println("======================================");
	}
}

