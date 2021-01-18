package org.ksh.insta.model.service;

import java.util.List;

import javax.annotation.Resource;

import org.ksh.insta.model.mapper.MemberMapper;
import org.ksh.insta.model.vo.Authority;
import org.ksh.insta.model.vo.MemberVO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImp implements MemberService {

	@Resource
	MemberMapper memberMapper;
	
	//패스워드 암호화
	@Resource
	private BCryptPasswordEncoder passwordEncoder;
	
	//사용자 검색
	@Override
	public MemberVO findMemberById(String id) {
		return memberMapper.findMemberById(id);
	}

	//계정 권한 검색
	@Override
	public List<Authority> findAuthorityById(String id) {
		return memberMapper.findAuthorityById(id);
	}
	
	//사용자 등록
	@Transactional
	@Override
	public void registerMember(MemberVO mvo) {
		String encodePwd = passwordEncoder.encode(mvo.getPw());
		mvo.setPw(encodePwd);
		memberMapper.registerMember(mvo);
		Authority authority = new Authority("ROLE_MEMBER",mvo.getId());
		memberMapper.registerMemberGrade(authority);
	}

}
