package demo12.mytest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo12.dao.UserAopDao;

public class AopTest {

	public static void main(String[] args) {
		//设置配置文件的路径
   String path="demo12/mytest/aopbean.xml";
	//创建Spring容器
	ApplicationContext ctx =new ClassPathXmlApplicationContext(path);
	
	//UserAopDao aopuserdao = (UserAopDao)ctx.getBean("userDaoProxy");
	UserAopDao  aopuserdao =(UserAopDao)ctx.getBean("useraop");
	aopuserdao.AddUser();
	aopuserdao.UpdateUser();
	aopuserdao.DelUser();
	aopuserdao.getIdByName(null);
	aopuserdao.getIdByName("");

	}

}
