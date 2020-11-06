package com.cdac.cntr;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.User;
import com.cdac.service.UserService;
import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping(value = "/prep_add_user_form1.htm",method = RequestMethod.GET)
	public String prepRegForm1(ModelMap map) {
		map.put("user", new User());
		return "adduser";
	}
	
	@RequestMapping(value = "/add_user.htm",method = RequestMethod.POST)
	public String register(User user,ModelMap map) {
		userService.addUser(user);
		return "userpage";
	}
	
	@RequestMapping(value="/user_list.htm",method = RequestMethod.GET)
	public String showcourse(ModelMap map) {
		List<User> li=userService.selectAll();
		
		map.put("userList", li);
		
		return "userlist";
	}
	
	@RequestMapping(value = "/user_delete.htm",method = RequestMethod.GET)
	public String userDelete(@RequestParam int licNo,ModelMap map,HttpSession session) {
		
		userService.removeUser(licNo); 
		
		
		List<User> li = userService.selectAll();
		map.put("userList", li);
		return "userlist";
	}
	
	@RequestMapping(value = "/user_update_form.htm",method = RequestMethod.GET)
	public String userUpdateForm(@RequestParam int licNo,ModelMap map) {
		
		User exp = userService.findUser(licNo);
		map.put("user", exp);
		
		return "user_update_form";
	}
	
	@RequestMapping(value = "/user_update.htm",method = RequestMethod.POST)
	public String expenseUpdate(User user,ModelMap map,HttpSession session) {
		
		
		userService.modifyUser(user);
			
		List<User> li = userService.selectAll();
		map.put("userList", li);
		return "userlist";
	}
	
}
