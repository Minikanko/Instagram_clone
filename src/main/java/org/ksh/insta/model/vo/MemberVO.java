package org.ksh.insta.model.vo;

public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String pr;
	private String profilePic;
	private String tel;
	private String email;
	private String sex;
	private String status;
	private String joined;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPr() {
		return pr;
	}
	public void setPr(String pr) {
		this.pr = pr;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getJoined() {
		return joined;
	}
	public void setJoined(String joined) {
		this.joined = joined;
	}
	public MemberVO() {
		super();
	}
	public MemberVO(String id, String pw, String name, String pr, String profilePic, String tel, String email, String sex,
			String status, String joined) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pr = pr;
		this.profilePic = profilePic;
		this.tel = tel;
		this.email = email;
		this.sex = sex;
		this.status = status;
		this.joined = joined;
	}
	
	
	

}
