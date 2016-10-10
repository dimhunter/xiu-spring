package aop.schema;

public interface HelloWorldService {
    
    public void sayHello();
    
    public void sayBefore(String param);

    public boolean sayAfterReturning();
    
    public void sayAfterThrowing();

    public boolean sayAfterFinally();
    
    public void sayAround(String param);
    
    public void sayAdvisorBefore(String param);
}
