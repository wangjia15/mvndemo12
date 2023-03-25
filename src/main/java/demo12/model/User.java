package demo12.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("noteUser")
public class User {
	
	public User() {}
	
	public  User(String username) {
		this.name =username;
	}
	
	public  User(String username,Address myaddress) {
		this.name =username;
		this.address = myaddress;
	}
	
	@Value("Lucy")
	private String name;
	@Autowired
	@Qualifier("myaddress")
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("学生名字："+this.name);
		System.out.println("城市："+this.address.getCity());
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
