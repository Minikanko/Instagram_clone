package org.ksh.insta.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.ksh.insta.model.service.PostService;
import org.ksh.insta.model.vo.MemberVO;
import org.ksh.insta.model.vo.PostPicVO;
import org.ksh.insta.model.vo.PostVO;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class PostController {
	@Resource
	PostService postService;

	@RequestMapping("registerPostForm.do")
	@Secured("ROLE_MEMBER")
	public String registerPostForm() {
		return "registerPost.tiles";
	}

	@PostMapping("registerPost.do")
	@Secured("ROLE_MEMBER")
	public String registerPost(PostVO postVO, MultipartHttpServletRequest request, Authentication authentication) {
		// 로그인정보 구하기(Bean에서 구하는 방법)
		// MemberVO mvo =
		// (MemberVO)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		MemberVO mvo = (MemberVO) authentication.getPrincipal();
		postVO.setMemberVO(mvo);
		List<MultipartFile> files = request.getFiles("picFile");
		System.out.println(mvo.getId()+" "+postVO.getComments());
		postService.registerPost(postVO);
		String uploadPath = request.getSession().getServletContext()
				.getRealPath("/resources/post/" + mvo.getId() + "/"+postVO.getPostNo() + "/");
		File uploadDir = new File(uploadPath);
		// 디렉토리 생성
		if (!uploadDir.exists())
			uploadDir.mkdirs();

		/*
		 * 포스트에 업로드된 사진을 포스트의 pk이름으로 폴더를 생성하여 관리하기 위해 게시글을 먼저 저장하고 file을 저장한다. 만약 파일 저장시
		 * 문제가 발생하게 되면 catch문에서 해당 포스트 게시글을 삭제하여 간접적으로 DB의 원자성을 보존한다.
		 */
		for (MultipartFile file : files) {
			if (file != null || file.isEmpty() == false) {
				File uploadFile = new File(uploadPath + file.getOriginalFilename());
				try {
					file.transferTo(uploadFile);
					PostPicVO ppvo = new PostPicVO();
					ppvo.setPostNo(postVO.getPostNo());
					ppvo.setPic(mvo.getId() + "/"+postVO.getPostNo() + "/" + file.getOriginalFilename());
					postService.registerPostPic(ppvo);
				} catch (IllegalStateException | IOException e) {
					postService.deletePost(postVO);
					System.out.println("게시물 업로드에 문제가 발생하였습니다.");
					e.printStackTrace();
					return "redirect:registerPost_result.do?result=no";
				}
			}
		}
		return "redirect:registerPost_result.do?result=yes";
	}
	
	@Secured("ROLE_MEMBER")
	@RequestMapping("registerPost_result.do")
	public String registerPostResult(String result) {
		if(result.equals("no"))
			return "post/register_post_no";
		else
			return "post/register_post_yes";
	}
}
