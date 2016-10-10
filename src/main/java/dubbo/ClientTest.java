package dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hellodubboconsumer.xml");
		HelloDubbo service = context.getBean("clientHelloService", HelloDubbo.class);
		service.sayHello("�۹���");
		Thread.currentThread().join();
	}
}
