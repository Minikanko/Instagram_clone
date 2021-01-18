package org.ksh.insta.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.ksh.insta.model.vo.Authority;
import org.ksh.insta.model.vo.MemberVO;

@Mapper
public interface MemberMapper {
	//사용자 검색
	MemberVO findMemberById(String id);
	//권한 검색
	List<Authority> findAuthorityById(String id);
	//사용자 등록(회원가입)
	void registerMember(MemberVO mvo);
	//사용자 권한등록
	void registerMemberGrade(Authority authority);
}
