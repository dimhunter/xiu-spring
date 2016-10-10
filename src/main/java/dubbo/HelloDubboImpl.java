package dubbo;

public class HelloDubboImpl implements HelloDubbo {

	@Override
	public String sayHello(String name) {
		System.out.println(name);
		return "hello :"+ name;
	}

}
