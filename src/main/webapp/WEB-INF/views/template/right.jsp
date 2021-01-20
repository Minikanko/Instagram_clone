<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<sec:authorize access="isAuthenticated()">
	<sec:authentication var="mvo" property="principal" />
	<div class="side_box">
		<div class="profile_wrapper">
			<div class="user_profile">
				<div class="profile_thumb">
					<c:choose>
						<c:when test="${mvo.profilePic==null}">
							<img
								src="${pageContext.request.contextPath}/resources/imgs/thumb.jpeg"
								alt="프로필사진">
						</c:when>
						<c:otherwise>
							<img
								src="${pageContext.request.contextPath}/resources/imgs/${mvo.profilePic}"
								alt="프로필사진">
						</c:otherwise>
					</c:choose>
				</div>
				<div class="detail">
					<div class="id m_text">${mvo.nickName}</div>
					<div class="ko_name">${mvo.name}</div>
				</div>
			</div>
			<div class="new_post"><a href="registerPostForm.do">피드 작성</a></div>
		</div>
		<article class="recommand">
			<header class="reco_header">
				<div>회원님을 위한 추천</div>
				<div class="more">모두 보기</div>
			</header>

			<div class="scroll_inner">
				<div class="thumb_user">
					<div class="profile_thumb">
						<img src="imgs/thumb02.jpg" alt="프로필사진">
					</div>
					<div class="detail">
						<div class="id">kind_tigerrrr</div>
						<div class="time">1시간 전</div>
					</div>
				</div>

			</div>
		</article>

	</div>
</sec:authorize>