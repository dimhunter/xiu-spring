package aop.schema;

public class HelloWorldServiceImpl implements HelloWorldService {
    
    @Override
    public void sayHello() {
        System.out.println("============Hello World!");
    }
    

    @Override
    public void sayBefore(String param) {
        System.out.println("============say " + param);
    }

    @Override
    public boolean sayAfterReturning() {
        System.out.println("============after returning");
        return true;
    }

    @Override
    public void sayAfterThrowing() {
        System.out.println("============before throwing");
        throw new RuntimeException("aaaa");
    }

    @Override
    public boolean sayAfterFinally() {
        System.out.println("============before finally");
        //此处抛不抛异常切面都会执行。
//      throw new RuntimeException("fffffff");
		return false;
    }

    @Override
    public void sayAround(String param) {
        System.out.println("============around param:" + param);
    }
   
    @Override
    public void sayAdvisorBefore(String param) {
        System.out.println("============say " + param);
    }
}
