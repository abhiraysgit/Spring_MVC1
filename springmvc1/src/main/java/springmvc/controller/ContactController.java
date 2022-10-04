package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Hemaji University Barwani");
		m.addAttribute("Desc", "Home For Student'S");

	}

	@RequestMapping("/contact")
	public String showform(Model m) {

		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);

		this.userService.createUser(user);
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User Created With with ID" + createUser);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String email, @RequestParam("name")
	 * String name,
	 * 
	 * @RequestParam("pswd") String pswd, Model model) {
	 * System.out.println("User Email Id Is....." + email);
	 * System.out.println("User Name Is......." + name);
	 * System.out.println("User Password is........" + pswd); // process
	 * 
	 * model.addAttribute("name", name); model.addAttribute("email", email);
	 * model.addAttribute("pswd", pswd);
	 * 
	 * return "success"; }
	 **/
}
