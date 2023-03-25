package demo12.bll;



import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import demo12.dao.UserDao;

@Service("noteUserService")
public class UserServiceImpl {
	//@Autowired
	//@Qualifier("noteUserDao1")
	@Resource(name="noteUserDao1")
	private UserDao userdao;
	
	public UserDao getUserdao() {
		return userdao;
	}

   public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	public void register() {
		System.out.println("注册用户：");
		userdao.addUser();
	}

}
