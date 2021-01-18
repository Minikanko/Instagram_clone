package org.ksh.insta;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ksh.insta.model.service.MemberService;
import org.ksh.insta.model.vo.MemberVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-model.xml","file:src/main/webapp/WEB-INF/spring-security.xml"})
public class MemberTest {
	
	@Resource
	MemberService memberService;
	
	/*
	회원가입 테스트
	@Test
	public void register() {
		MemberVO mvo = new MemberVO();
		mvo.setId("test");
		mvo.setPw("123fas");
		mvo.setName("테스트");
		mvo.setEmail("dsafa@safdae");
		memberService.registerMember(mvo);
	}
	*/
	
	@Test
	public void findMember() {
		MemberVO mvo = memberService.findMemberById("test");
		System.out.println(mvo);
	}
	

}
