package org.ksh.insta.model.service;

import java.util.List;

import org.ksh.insta.model.vo.Authority;
import org.ksh.insta.model.vo.MemberVO;
import org.ksh.insta.model.vo.PostVO;

public interface MemberService {
	
	MemberVO findMemberById(String id);
	List<Authority> findAuthorityById(String id);
	void registerMember(MemberVO mvo);
}
