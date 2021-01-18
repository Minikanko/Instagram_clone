package org.ksh.insta.model.service;

import java.util.List;

import org.ksh.insta.model.vo.Authority;
import org.ksh.insta.model.vo.MemberVO;

public interface MemberService {
	
	MemberVO findMemberById(String id);
	List<Authority> findAuthorityById(String id);
	void registerMember(MemberVO mvo);
}
