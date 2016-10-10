package aop.aspectj;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 	切面、切入点、通知全部使用注解完成：
       1）使用@Aspect将POJO声明为切面；
       2）使用@Pointcut进行命名切入点声明，同时指定目标方法第一个参数类型必须是java.lang.String，对于其他匹配的方法但参数类型不一致的将也是不匹配的，通过argNames = "param"指定了将把该匹配的目标方法参数传递给通知同名的参数上；
       3）使用@Before进行前置通知声明，其中value用于定义切入点表达式或引用命名切入点；
       4）配置文件需要使用<aop:aspectj-autoproxy/>来开启注解风格的@AspectJ支持；
       5）需要将切面注册为Bean，如“aspect”Bean；
       6）测试代码完全一样。
       
       aop切入点表达式。
       *   ：匹配所有字符
       ..  ：一般用于匹配多个包，多个参数
       +   ：表示类及其子类
 * 
 * @author shen
 *
 */
@Aspect
public class HelloWorldAspect2 {
	
	/**
	 * 定义切入点
	 * @param param
	 */
	@Pointcut(value="execution(* aop.aspectj..*.*(..)) && args(param)", argNames = "param")
	public void beforePointcut(String param) {}
	
	
	/**
	 * 定义通知
	 * @param param
	 */
	@Before(value = "beforePointcut(param)", argNames = "param")
	public void beforeAdvice(String param) {
	    System.out.println("===========before advice param:" + param);
	}
	
	@AfterReturning(
		    value="execution(* aop.aspectj..*.sayBefore(..))",
		    pointcut="execution(* aop.aspectj..*.sayAfterReturning(..))",
		    argNames="retVal", returning="retVal")
		public void afterReturningAdvice(Object retVal) {
		    System.out.println("===========after returning advice retVal:" + retVal);
		}
}
