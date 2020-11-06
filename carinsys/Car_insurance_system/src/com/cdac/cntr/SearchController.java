package com.cdac.cntr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Admin;
import com.cdac.dto.Car;
import com.cdac.dto.User;
import com.cdac.dto.Ins;
import com.cdac.service.CarService;
import com.cdac.service.InsService;
import com.cdac.service.UserService;

import java.util.List;

@Controller
public class SearchController {

	@Autowired
	private CarService carService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private InsService insService;
	
	@RequestMapping(value = "/prep_search_car.htm",method = RequestMethod.GET)
	public String prepRegcar(ModelMap map) {
		map.put("car", new Car());
		return "search";
	}
	
	
	@RequestMapping(value = "/search_car.htm",method = RequestMethod.POST)
	public String userUpdateForm(@RequestParam String carNo,ModelMap map) {
		
		List<Car> exp = carService.oneCar(carNo);
		
		
		map.put("carlist", exp);
		
		return "all_details";
	}
	
	@RequestMapping(value = "/prep_search_user.htm",method = RequestMethod.GET)
	public String prepReguser(ModelMap map) {
		map.put("user", new User());
		return "search_user";
	}
	
	@RequestMapping(value = "/search_user.htm",method = RequestMethod.POST)
	public String selectuser(@RequestParam int licNo,ModelMap map) {
		
		List<User> exp = userService.oneUser(licNo);
		
		
		map.put("userlist", exp);
		
		return "all_details_user";
	}
	
	
	
	
}
