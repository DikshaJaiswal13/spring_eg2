package com.pack.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pack.model.User;
import com.pack.service.UserService;

//bean class
@Controller//used to indicate that this is a controller class
@RequestMapping("/userRegistration.htm")//matches with the url pattern if it matches with the one defined in xml file
@SessionAttributes("user")//user indicates the commandName
public class UserController{
	
	@Autowired
	private UserService userService; //this will contain the reference of userserviceimpl class
	@RequestMapping(method=RequestMethod.GET)
	public String showForm(ModelMap model){
		User u=new User();
		model.addAttribute(u);
		return "userForm";
	}
	@RequestMapping(method=RequestMethod.POST)
	public String onsubmit(@ModelAttribute("user")User u){//here user is the commandName in the form,u contains all the info from the form
		userService.add(u);
		return "userSuccess";
		
	}
}
