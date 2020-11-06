package com.cdac.dao;
import com.cdac.dto.Car;
import com.cdac.dto.User;
import java.util.List;
public interface UserDao {

	void insertUser(User user);
	List<User> selectAll();
	void deleteUser(int licNo);
	void updateUser(User user);
	User selectUser(int licNo);
	List<User> selectoneUser(int licNo);
	
}
