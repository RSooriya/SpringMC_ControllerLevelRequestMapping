package com.pack.sooriya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class GreetController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "greetForm";
	}
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "greetData";
	}
}
