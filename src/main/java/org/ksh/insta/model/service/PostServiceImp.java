package org.ksh.insta.model.service;

import java.util.List;

import javax.annotation.Resource;

import org.ksh.insta.model.mapper.PostMapper;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;


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
	

}
