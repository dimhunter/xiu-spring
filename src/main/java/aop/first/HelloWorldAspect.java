package aop.first;

/**
 * 切面支持类
 * @author shen
 *
 */
public class HelloWorldAspect {
	
	//前置通知
    public void beforeAdvice() {
        System.out.println("===========before advice，不受异常影响");
    }
    
    //后置最终通知
    public void afterFinallyAdvice() {
        System.out.println("===========after finally advice，不受异常影响");
    }
    
}

