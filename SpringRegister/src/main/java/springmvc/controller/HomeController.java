package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("name","Venkatesh");
		
		
		List<String> friends=new ArrayList<String> ();
		friends.add("Sharad");
		friends.add("Rajath");
		model.addAttribute("friends",friends);
		return "index";
	}
	@RequestMapping("/aboutus")
	public ModelAndView aboutUs() {
		ModelAndView modelandview=new ModelAndView();
		
		modelandview.addObject("name","Aishwarya");
		modelandview.addObject("Id",102);
		modelandview.setViewName("aboutus");
		
		return modelandview;
		
	}
}
