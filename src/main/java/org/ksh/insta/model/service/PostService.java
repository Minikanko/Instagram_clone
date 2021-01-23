package org.ksh.insta.model.service;

import java.util.List;

import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;
import org.springframework.web.multipart.MultipartFile;

public interface PostService {
	void registerPost(PostVO pvo);
	void registerPostPic(PostPicVO ppvo);
	void deletePost(PostVO pvo);
}
