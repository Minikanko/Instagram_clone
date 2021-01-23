package org.ksh.insta.model.service;

import java.util.List;

import org.ksh.insta.model.vo.PagingBean;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;

public interface PostService {
	void registerPost(PostVO pvo);
	void registerPostPic(PostPicVO ppvo);
	void deletePost(PostVO pvo);
	List<PostVO> selectAllPost(PagingBean pagingBean);
	int totalPostCount();
}
