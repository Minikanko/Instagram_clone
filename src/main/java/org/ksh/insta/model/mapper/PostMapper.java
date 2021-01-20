package org.ksh.insta.model.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;

@Mapper
public interface PostMapper {
	
	//게시글 등록
	void registerPost(PostVO postVO);
	void registerPostPic(PostPicVO postPicVO);
}
