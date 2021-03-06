package com.cdac.service;
import com.cdac.dto.Car;
import com.cdac.dto.User;
import java.util.List;
public interface UserService {

	void addUser(User user);
	List<User> selectAll();
	void removeUser(int licNo);
	void modifyUser(User user);
	User findUser(int licNo);
	List<User> oneUser(int licNo);
	
}
