package org.ksh.insta;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ksh.insta.model.service.PostService;
import org.ksh.insta.model.vo.MemberVO;
import org.ksh.insta.model.vo.PagingBean;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring-model.xml","file:src/main/webapp/WEB-INF/spring-security.xml"})
public class PostTest {

	@Resource
	PostService postService;
	
	/*
	@Test
	public void registerPost() {
		PostVO pvo = new PostVO();
		MemberVO mvo = new MemberVO();
		mvo.setId("bcgrhio@naver.com");
		pvo.setMemberVO(mvo);
		pvo.setComments("test");
		List<PostPicVO> ppvo = new ArrayList<>();
		ppvo.add(new PostPicVO("", "", "dfasefa"));
		ppvo.add(new PostPicVO("", "", "asdfa"));
		pvo.setPostPicVOList(ppvo);
		postService.registerPost(pvo);
	}
	*/
	
	@Test
	public void selectAllPost() {
		PagingBean pagingBean = new PagingBean(1);
		System.out.println(pagingBean.getStartRowNumber());
		System.out.println(pagingBean.getEndRowNumber());
		List<PostVO> pvoList = postService.selectAllPost(pagingBean);
		for(PostVO pvo:pvoList) {
			System.out.println(pvo);
		}
	}
}
