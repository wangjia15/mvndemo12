package demo12.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo12.bll.UserServiceImpl;
import demo12.dao.UserDao;
import demo12.dao.impl.UserDaoImpl;
import demo12.model.Product;

public class AnnotationTest {

	public static void main(String[] args) {
		//设置配置文件的路径
		String path="demo12/mytest/bean1.xml";
	//创建Spring容器
	ApplicationContext ctx =new ClassPathXmlApplicationContext(path);
	System.out.println("第一个产品的对象地址：");
	Product myproduct =(Product)ctx.getBean("product1");
	System.out.println(myproduct.toString());
	System.out.println(myproduct.getName());
	System.out.println("第二个产品的对象地址：");
	Product myproduct2 =(Product)ctx.getBean("product1");	
	System.out.println(myproduct2.toString());
	
	UserDao userdao = (UserDao)ctx.getBean("noteUserDao1");
	//userdao.addUser();
	
	
	UserServiceImpl userservice = 
			(UserServiceImpl)ctx.getBean("noteUserService");
	userservice.register();
	
	}

}
