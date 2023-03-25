package demo12.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

//实现AspectJ所使用的切面类
public class MyAspectJ {
	
	//前置增强             连接点---获取目标对象的信息
	public void mybefore(JoinPoint jp) {
		System.out.println("前置增强被调用");
		System.out.println("获取目标对象的信息，类名："+jp.getTarget());
		System.out.println("获取目标对象被增强的方法："+jp.getSignature().getName());
		
	}
	
	//后置增强             连接点---获取目标对象的信息
	public void myafterReturning(JoinPoint jp,Object returnObj) {
		System.out.println("后置增强被调用");
		System.out.println("获取目标对象的信息，类名："+jp.getTarget());
		System.out.println("获取目标对象被增强的方法："+jp.getSignature().getName());
		System.out.println("获取返回值："+returnObj);
	}
	
	//环绕增强             连接点---获取目标对象的信息
	public Object myAround(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("环绕增强被调用");
		//调用目标对象的方法，并且获取对象
		Object obj =jp.proceed();
		//Object obj = null;
		System.out.println("环绕增强调用完成");
		return obj;
	
	}

}
