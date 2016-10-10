package aop.schema;

import org.aspectj.lang.ProceedingJoinPoint;

public class HelloWorldAspect {
        
    /**
     * 前置通知
     */
    public void beforeAdvice() {
        System.out.println("===========before advice");
    }
    
    /**
     * 前置通知带参数
     * @param param
     */
    public void beforeAdvice(String param) {
        System.out.println("===========before advice param:" + param);
    }
    
    /**
     * 后置正常返回通知。
     * @param retVal
     */
    public void afterReturningAdvice(Object retVal) {
        System.out.println("===========after returning advice retVal:" + retVal);
    }
    
    /**
     * 后置异常通知
     * @param myException
     */
    public void afterThrowingAdvice(Exception exception) {
        System.out.println("===========after throwing advice com.shen.exception:" + exception);
    }
    
    /**
     * 后置最终通知
     */
    public void afterFinallyAdvice() {
        System.out.println("===========after finally advice");
    }
    
   
    /**
     * 环绕通知第一个参数必须是org.aspectj.lang.ProceedingJoinPoint类型，在通知实现方法内部使用ProceedingJoinPoint的proceed()
     * 方法使目标方法执行，proceed 方法可以传入可选的Object[]数组，该数组的值将被作为目标方法执行时的参数。
     * @param pjp
     * @return
     * @throws Throwable
     */
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("===========around before advice");
        Object retVal = pjp.proceed(new Object[] {"replace"});
        System.out.println("===========around after advice");
        return retVal;
    }
    
}
