package com.tiger.hotdeploy.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HotDeployController {
	@RequestMapping(value = "/say",method = RequestMethod.GET)
	public String say(HttpServletRequest req) {
		req.setAttribute("say", "Hello --> springboot");
		//模板的名字与之一样
		return "springboot";
	}
}
