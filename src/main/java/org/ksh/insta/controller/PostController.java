package org.ksh.insta.controller;

import javax.annotation.Resource;

import org.ksh.insta.model.service.PostService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
	@Resource
	PostService postService;
	
	@RequestMapping("registerPostForm.do")
	@Secured("ROLE_MEMBER")
	public String registerPostForm() {
		return "registerPost.tiles";
	}
}
