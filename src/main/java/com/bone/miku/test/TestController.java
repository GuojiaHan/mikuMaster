package com.bone.miku.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	
	private static String PREFIX = "/";
	
	@RequestMapping("/login")
	@ResponseBody
	public int loginPage() {
		System.out.print("你好呀");
		return 232333333;
	}
	
	@RequestMapping("turn2Login")
	public String lginPage2() {
		return "login.html";
	}
}
