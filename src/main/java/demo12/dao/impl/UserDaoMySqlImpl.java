package demo12.dao.impl;

import demo12.dao.UserDao;
import demo12.model.User;

public class UserDaoMySqlImpl implements UserDao  {
	private User myuser;
	
	public User getMyuser() {
		return myuser;
	}

	public void setMyuser(User myuser) {
		this.myuser = myuser;
	}
	
	public void addUser() {
		System.out.println("MySql：添加数据到数据库成功");
		System.out.println("用户信息：");
		myuser.showInfo();
		
	}

}
