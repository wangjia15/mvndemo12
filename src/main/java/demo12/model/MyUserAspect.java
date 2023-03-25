package demo12.model;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//切面类--实现环绕增强
public class MyUserAspect implements MethodInterceptor {
	
	public void checkPermission() {
		   System.out.println("模拟验证权限...");
	}
	
	public void log() {
		 System.out.println("模拟写入日志...");	 
	}

	@Override
	public Object invoke(MethodInvocation invocation) 
			throws Throwable {
		checkPermission();
		//执行目标对象的方法
		Object obj = invocation.proceed();
		log();
		return obj;
	}

}
