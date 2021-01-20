package org.ksh.insta.model.vo;

import java.util.List;

public class PostVO {
	private String postNo;
	private MemberVO memberVO;
	private String comments;
	private List<PostPicVO> postPicVOList;
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public MemberVO getMemberVO() {
		return memberVO;
	}
	public void setMemberVO(MemberVO memberVO) {
		this.memberVO = memberVO;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<PostPicVO> getPostPicVOList() {
		return postPicVOList;
	}
	public void setPostPicVOList(List<PostPicVO> postPicVOList) {
		this.postPicVOList = postPicVOList;
	}
	public PostVO() {
		super();
	}
	public PostVO(String postNo, MemberVO memberVO, String comments, List<PostPicVO> postPicVOList) {
		super();
		this.postNo = postNo;
		this.memberVO = memberVO;
		this.comments = comments;
		this.postPicVOList = postPicVOList;
	}
	@Override
	public String toString() {
		return "PostVO [postNo=" + postNo + ", memberVO=" + memberVO + ", comments=" + comments + ", postPicVOList="
				+ postPicVOList + "]";
	}
	
	
	
}
