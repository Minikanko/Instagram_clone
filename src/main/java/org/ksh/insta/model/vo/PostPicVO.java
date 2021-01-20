package org.ksh.insta.model.vo;

public class PostPicVO {
	private String picNo;
	private String postNo;
	private String pic;
	
	public String getPicNo() {
		return picNo;
	}
	public void setPicNo(String picNo) {
		this.picNo = picNo;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public PostPicVO() {
		super();
	}
	public PostPicVO(String picNo, String postNo, String pic) {
		super();
		this.picNo = picNo;
		this.postNo = postNo;
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "PostPicVO [picNo=" + picNo + ", postNo=" + postNo + ", pic=" + pic + "]";
	}
	
	
	
}
