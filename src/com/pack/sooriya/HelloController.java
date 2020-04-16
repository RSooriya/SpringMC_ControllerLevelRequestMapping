package com.pack.sooriya;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping("/showForm")
	public String showForm()
	{
		return "showForm";
	}
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "confirmData";
	}
}
