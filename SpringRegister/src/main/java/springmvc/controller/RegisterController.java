package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.Student;
import springmvc.service.StudentService;

@Controller
public class RegisterController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/register")
public String showForm() {
	
	return "register";
}
	@RequestMapping(path="/processform",method=RequestMethod.POST) 
	public String handleForm(@ModelAttribute("student") Student student,Model model) {
		System.out.println(student);
		this.studentService.createUser(student);
		return "success";
		
		
	
/*

	@RequestMapping(path="/processform",method=RequestMethod.POST) 
	public String handleForm(@RequestParam("email") String email, @RequestParam("userName") String userName,@RequestParam("password") String password
			,Model model) {
		
		
		User user=new User();
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);
		
		model.addAttribute("user",user);
		
		System.out.println("email"+email);
		System.out.println("username"+userName);
		System.out.println("password"+password);
		
		
		
		model.addAttribute("email",email);
		model.addAttribute("username",userName);
		model.addAttribute("password",password);
		return "success";*/
	}
}
	


