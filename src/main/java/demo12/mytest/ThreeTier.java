package demo12.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo12.bll.UserServiceImpl;


public class ThreeTier {

	public static void main(String[] args) {
		//设置配置文件的路径
		String path="demo12/mytest/bean1.xml";
		//创建Spring容器
		ApplicationContext ctx =new ClassPathXmlApplicationContext(path);
		UserServiceImpl userservice = 
				(UserServiceImpl)ctx.getBean("myuserservice");
		userservice.register();

	}

}
