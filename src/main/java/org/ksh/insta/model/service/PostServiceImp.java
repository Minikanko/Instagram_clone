package org.ksh.insta.model.service;

import java.util.List;

import javax.annotation.Resource;

import org.ksh.insta.model.mapper.PostMapper;
import org.ksh.insta.model.vo.PagingBean;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;
import org.springframework.stereotype.Service;


@Service
public class PostServiceImp implements PostService{

	@Resource
	PostMapper postMapper;
	
	@Override	
	public void registerPost(PostVO pvo) {
		postMapper.registerPost(pvo);
	}

	@Override
	public void registerPostPic(PostPicVO ppvo) {
		postMapper.registerPostPic(ppvo);
	}
	
	//포스트 삭제
	@Override
	public void deletePost(PostVO pvo) {
		postMapper.deletePost(pvo);
	}
	
	@Override
	public List<PostVO> selectAllPost(PagingBean pagingBean){
		List<PostVO> list = postMapper.selectAllPost(pagingBean);
		for(PostVO pvo : list) {
			pvo.setPostPicVOList(postMapper.selectAllPics(pvo.getPostNo()));
		}
		return list;
	}

	//포스트 전체수량
	@Override
	public int totalPostCount() {
		return postMapper.totalPostCount();
	}
	

}
