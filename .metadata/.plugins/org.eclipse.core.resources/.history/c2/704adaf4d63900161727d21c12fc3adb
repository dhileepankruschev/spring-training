package com.cog.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class Home {

	@RequestMapping(method = RequestMethod.GET)
    public String helloWorld(Model model) {
		System.out.println("Web MVC Controller");
        model.addAttribute("message", "Hello World Get!");
        return "hello.jsp";
    }
	
}

