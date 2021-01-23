package org.ksh.insta.model.vo;

import java.util.List;

public class PostVOList {
	List<PostVO> pvoList;
	PagingBean pagingBean;
	public PostVOList() {
		super();
	}
	public PostVOList(List<PostVO> pvoList, PagingBean pagingBean) {
		super();
		this.pvoList = pvoList;
		this.pagingBean = pagingBean;
	}
	public List<PostVO> getPvoList() {
		return pvoList;
	}
	public void setPvoList(List<PostVO> pvoList) {
		this.pvoList = pvoList;
	}
	public PagingBean getPagingBean() {
		return pagingBean;
	}
	public void setPagingBean(PagingBean pagingBean) {
		this.pagingBean = pagingBean;
	}
	@Override
	public String toString() {
		return "PostVOList [pvoList=" + pvoList + ", pagingBean=" + pagingBean + "]";
	}
	
	
}
