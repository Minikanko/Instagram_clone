<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="sec"%>
<div class="story_box">
	<div class="story_wrapper">
		<div class="user_profile">
			<div class="profile_thumb">
				<img src="imgs/thumb.jpeg" alt="프로필사진">
			</div>
			<div class="detail">
				<div class="ko_name">test</div>
			</div>
		</div>
		<div class="user_profile">
			<div class="profile_thumb">
				<img src="imgs/thumb.jpeg" alt="프로필사진">
			</div>
			<div class="detail">
				<div class="ko_name">test</div>
			</div>
		</div>
	</div>
</div>
<div class="contents_box">
<c:forEach items="${pvoList.pvoList}" var="pvo">
	<article class="contents">
		<header class="top">
			<div class="user_container">
				<div class="profile_img">
					<c:choose>
						<c:when test="${mvo.profilePic==null}">
							<img
								src="${pageContext.request.contextPath}/resources/imgs/thumb.jpeg"
								alt="프로필사진">
						</c:when>
						<c:otherwise>
							<img
								src="${pageContext.request.contextPath}/resources/imgs/${pvo.memberVO.profilePic}"
								alt="프로필사진">
						</c:otherwise>
					</c:choose>
				</div>
				<div class="user_name">
					<div class="nick_name m_text">${pvo.memberVO.nickName}</div>
					<div class="country s_text">Seoul, South Korea</div>
				</div>

			</div>
			<!-- 수정/삭제 기능(게시자만 가능하도록) -->
			<sec:authentication var="mvo" property="principal" /> 
			<c:if test="${mvo.id=pvo.memberVO.id} ">
				<div class="sprite_more_icon" data-name="more">
				<ul class="toggle_box">
					<li><input type="submit" class="follow" value="팔로우"
						data-name="follow"></li>
					<li>수정</li>
					<li>삭제</li>
				</ul>
			</div>
			</c:if>
		</header>
		<div class="img_section">
			<div class="trans_inner">
				<div>
					<c:forEach items="${pvo.postPicVOList}" end="1" var="ppvo">
						<img src="${pageContext.request.contextPath}/resources/post/${ppvo.pic}" alt="visual01">
					</c:forEach>
				</div>
			</div>
		</div>

		<div class="bottom_icons">
			<div class="left_icons">
				<div class="heart_btn">
					<div class="sprite_heart_icon_outline" name="39"
						data-name="heartbeat"></div>
				</div>
				<div class="sprite_bubble_icon"></div>
				<div class="sprite_share_icon" data-name="share"></div>
			</div>
			<div class="right_icon">
				<div class="sprite_bookmark_outline" data-name="bookmark"></div>
			</div>
		</div>

		<div class="likes m_text">
			좋아요 <span id="like-count-39">2,346</span> <span
				id="bookmark-count-39"></span> 개
		</div>

		<div class="comment_container">
			<div class="comment" id="comment-list-ajax-post37">
				<div class="comment-detail">
					<div class="nick_name m_text">${pvo.memberVO.nickName}</div>
					<div>${pvo.comments} </div>
				</div>
			</div>
			<div class="small_heart">
				<div class="sprite_small_heart_icon_outline"></div>
			</div>
		</div>

		<div class="timer">${pvo.registerDate}</div>

		<div class="comment_field" id="add-comment-post37">
			<input type="text" placeholder="댓글달기...">
			<div class="upload_btn m_text" data-name="comment">게시</div>
		</div>
	</article>
</c:forEach>
</div>