package aop.schema;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	
    @Test
    public void testSchemaBeforeAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("advice.xml");
        HelloWorldService helloworldService = ctx.getBean("helloWorldService", HelloWorldService.class);
        helloworldService.sayBefore("before");
        System.out.println("======================================");
    }
    
    @Test
    public void testSchemaAfterReturningAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("advice.xml");
        HelloWorldService helloworldService = ctx.getBean("helloWorldService", HelloWorldService.class);
        helloworldService.sayAfterReturning();
        System.out.println("======================================");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSchemaAfterThrowingAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("advice.xml");
        HelloWorldService helloworldService = ctx.getBean("helloWorldService", HelloWorldService.class);
        helloworldService.sayAfterThrowing();
        //最后一句不会执行了，因为上一句的业务逻辑中抛出了异常helloworldService.sayAfterThrowing()，所以程序终止了
        //但是在终止前，还是调用了切面中的afterThrowingAdvice方法，打出了===========after throwing advice com.shen.exception:java.lang.RuntimeException
        System.out.println("======================================");
    }
    
    @Test(expected = RuntimeException.class)
    public void testSchemaAfterFinallyAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("advice.xml");
        HelloWorldService helloworldService = ctx.getBean("helloWorldService", HelloWorldService.class);
        helloworldService.sayAfterFinally();
        System.out.println("======================================");
    }
    
    @Test
    public void testSchemaAroundAdvice() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("advice.xml");
        HelloWorldService helloworldService = ctx.getBean("helloWorldService", HelloWorldService.class);
        helloworldService.sayAround("haha");
        System.out.println("======================================");
    }
    
    @Test
    public void testSchemaIntroduction() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("advice.xml");
        IntroductionService introductionService = ctx.getBean("helloWorldService", IntroductionService.class);
        introductionService.induct();
        System.out.println("======================================");
    }
	
    

    @Test
    public void testSchemaAdvisor() {
        System.out.println("======================================");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("advice.xml");
        HelloWorldService helloworldService = ctx.getBean("helloWorldService", HelloWorldService.class);
        helloworldService.sayAdvisorBefore("haha");
        System.out.println("======================================");
    }
}
