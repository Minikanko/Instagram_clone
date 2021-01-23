package org.ksh.insta.controller;

import java.util.Locale;

import javax.annotation.Resource;

import org.ksh.insta.model.service.PostService;
import org.ksh.insta.model.vo.PagingBean;
import org.ksh.insta.model.vo.PostVOList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Resource
	PostService postService;
	
	@Secured("ROLE_MEMBER")
	@RequestMapping(value = "home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		PagingBean pagingBean = new PagingBean(postService.totalPostCount());
		PostVOList pvoList = new PostVOList(postService.selectAllPost(pagingBean), pagingBean);
		model.addAttribute("pvoList",pvoList);
		return "home.tiles";
	}
	
}
