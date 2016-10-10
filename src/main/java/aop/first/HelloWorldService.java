package aop.first;

/**
 * 目标接口实现
 * @author shen
 *
 */
public class HelloWorldService implements IHelloWorldService {

	public void sayHello() {
		 System.out.println("============Hello World!");
		 
		 //此处虽然抛异常了，但是aop不会受到影响。before和after方法都会继续执行。！！！
		 throw new RuntimeException("业务逻辑异常！！！");
	}

}
