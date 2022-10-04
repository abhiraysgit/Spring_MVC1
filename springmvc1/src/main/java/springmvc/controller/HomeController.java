package springmvc.controller;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Raman Tiwari");
		model.addAttribute("ID", 2334);
		List<String> frd = new ArrayList<String>();
		frd.add("Raman");
		frd.add("Raja");
		frd.add("Ajay");
		frd.add("Aniket");
		frd.add("Ankit");
		frd.add("Abhishek");
		frd.add("Raman");
		frd.add("Raja");
		frd.add("Ajay");
		frd.add("Aniket");
		frd.add("Ankit");
		frd.add("Abhishek");

		model.addAttribute("f", frd);
		System.out.println("this is a Home url.....");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About Url.......");
		return "about";
	}

}
