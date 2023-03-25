package demo12.dao.impl;

import demo12.dao.UserAopDao;

public class UserAopDaoImpl  implements UserAopDao{

	@Override
	public void AddUser() {
	
	   System.out.println("模拟添加用户");		
	}

	@Override
	public void DelUser() {	  
		   System.out.println("模拟删除用户");	 
	}

	@Override
	public void UpdateUser() {
		   System.out.println("模拟更新用户");
	}

	@Override
	public int getIdByName(String name) {
		if(name!=null) {
			return 456;
		}else {
		return 123;
		}
	}

}
