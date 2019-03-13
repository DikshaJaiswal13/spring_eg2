package com.pack.Controller;
import com.pack.model.User;
import com.pack.service.UserService;

//bean class
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class UserController extends SimpleFormController{//to create any forms in spring mvc use simpleformcontroller class.this is striked since it is deprecated,so we use annotation
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public UserController(){
		super();
		setCommandClass(User.class);//to inform to the controller that there is a model prog named user.class
		setCommandName("user");
	}
	protected ModelAndView onSubmit(Object command)throws Exception{//this method will be invoked only when we use post request
		User u=(User)command;
		userService.add(u);
		return new ModelAndView("userSuccess","user",u);
	}
}
