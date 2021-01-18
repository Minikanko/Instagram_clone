package org.ksh.insta.model.vo;

import java.io.Serializable;

//계정권한
public class Authority implements Serializable {
	private static final long serialVersionUID = 5188280555844223102L;
	private String grade;
	private String id;
	public Authority() {
		super();
	}
	public Authority(String grade, String id) {
		super();
		this.grade = grade;
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Authority [grade=" + grade + ", id=" + id + "]";
	}	
	
	

}
