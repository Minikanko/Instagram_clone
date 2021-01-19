package org.ksh.insta.controller;

import javax.annotation.Resource;

import org.ksh.insta.model.service.MemberService;
import org.ksh.insta.model.vo.MemberVO;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Resource
	MemberService memberService;
	
	//로그인 폼으로 이동
	@RequestMapping("loginForm.do")
	public String loginForm() {
		return "member/loginForm";
	}
	
	//회원가입 폼으로 이동
	@RequestMapping("registerForm.do")
	public String registerForm() {
		return "member/registerForm"; 
	}
	
	//회원가입
	@PostMapping("registerMember.do")
	public String registerMember(MemberVO mvo) {
		memberService.registerMember(mvo);
		return "redirect:registerMember_ok.do"; 
	}
	
	//회원가입 폼으로 이동
	@RequestMapping("registerMember_ok.do")
	public String registerMemberOk(MemberVO mvo) {
		return "member/registerMember_ok"; 
	}
	
	//아이디 중복확인
	@Async
	@PostMapping("findMemberById.do")
	public Boolean findMemberById(String id) {
		MemberVO mvo = memberService.findMemberById(id);
		if(mvo != null)
			return false;
		else
			return true;
	}
	

	
}
