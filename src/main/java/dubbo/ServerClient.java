package dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServerClient {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hellodubbo.xml");
//        context.start();
        System.out.println("dubbo server start ok");
        System.in.read(); // 按任意键退出
	}
	
}
