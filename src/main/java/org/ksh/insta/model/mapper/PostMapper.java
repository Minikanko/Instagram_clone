package org.ksh.insta.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.ksh.insta.model.vo.PagingBean;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;

@Mapper
public interface PostMapper {
	
	//게시글 등록
	void registerPost(PostVO pvo);
	void registerPostPic(PostPicVO ppvo);
	//게시물 삭제
	void deletePost(PostVO pvo);
	//게시물 전체수
	int totalPostCount();
	//전체게시물 보기
	List<PostVO> selectAllPost(PagingBean pagingBean);
	List<PostPicVO> selectAllPics(String postNo);
}
