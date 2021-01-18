package org.ksh.insta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("loginForm.do")
	public String login() {
		return "member/loginForm";
	}
	
}
