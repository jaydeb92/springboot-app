package com.xworkz.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	@RequestMapping("home")

	public String getLandingPage() {
		return "index";

	}

	@RequestMapping("sendMessage")

	public String showMessage(@RequestParam String from, @RequestParam String message, Model model) {
		model.addAttribute("From", from);
		model.addAttribute("Message", message);
		return "ShowMessage";

	}

}
