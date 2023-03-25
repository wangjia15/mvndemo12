package demo12.dao;

public interface UserAopDao {
	public void AddUser();
	public void DelUser();
	public void UpdateUser();
	
	public int getIdByName(String name) ;

}
