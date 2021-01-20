package org.ksh.insta.model.service;

import javax.annotation.Resource;

import org.ksh.insta.model.mapper.PostMapper;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PostServiceImp implements PostService{

	@Resource
	PostMapper postMapper;
	
	@Transactional
	@Override	
	public void registerPost(PostVO pvo) {
		postMapper.registerPost(pvo);
		for(PostPicVO ppvo : pvo.getPostPicVOList()) {
			ppvo.setPostNo(pvo.getPostNo());
			System.out.println(ppvo.getPostNo());
			System.out.println(ppvo);
			postMapper.registerPostPic(ppvo);
		}
	}
	

}
