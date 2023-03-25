package demo12.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


import demo12.dao.UserDao;
import demo12.model.User;

@Repository("noteUserDao1")
public class UserDaoImpl implements UserDao {
	@Autowired //按照类型进行绑定
	@Qualifier("noteUser")
	private User myuser;
	
	public User getMyuser() {
		return myuser;
	}

	public void setMyuser(User myuser) {
		this.myuser = myuser;
	}
	
	public void addUser() {
		System.out.println("添加数据到数据库成功");
		System.out.println("用户信息：");
		myuser.showInfo();
		
	}

}
