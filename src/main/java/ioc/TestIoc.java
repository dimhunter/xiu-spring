package ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	
	@Test
	public void testHelloWorld() {  
        //1����ȡ�����ļ�ʵ����һ��IoC����  
        ApplicationContext context = new ClassPathXmlApplicationContext("helloioc.xml");  
        //2���������л�ȡBean��ע��˴���ȫ������ӿڱ�̣�����������ʵ�֡�  
        HelloService helloApi = context.getBean("hello", HelloService.class);  
        //3��ִ��ҵ���߼�  
        helloApi.sayHello();  
  }  
}
