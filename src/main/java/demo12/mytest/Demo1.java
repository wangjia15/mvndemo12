package demo12.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo12.model.User;

public class Demo1 {

	public static void main(String[] args) {
		// 创建对象
		//User user1 = new User();
		//user1.setName("张三");
		//user1.showInfo();
		
		//Spring创建对象
		//设置配置文件的路径
		String path="demo12/mytest/bean1.xml";
		//创建Spring容器
		ApplicationContext ctx =new ClassPathXmlApplicationContext(path);
		User user2 = (User)ctx.getBean("myuser1");
        user2.showInfo();
      
        User myuser2 = (User)ctx.getBean("myuser2");
        myuser2.showInfo();
	}

}
