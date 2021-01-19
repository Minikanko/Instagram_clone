<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">

<!-- Facebook Meta Tags / 페이스북 오픈 그래프 -->
<meta property="og:url" content="http://kindtiger.dothome.co.kr/insta">
<meta property="og:type" content="website">
<meta property="og:title" content="instagram">
<meta property="og:description" content="instagram clone">

.
<!-- Twitter Meta Tags / 트위터 -->
<meta name="twitter:card" content="instagram clone">
<meta name="twitter:title" content="instagram">
<meta name="twitter:description" content="instagram clone">


<!-- Google / Search Engine Tags / 구글 검색 엔진 -->
<meta itemprop="name" content="instagram">
<meta itemprop="description" content="instagram clone">

<title>Instagram</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/common.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/login.css">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/resources/imgs/instagram.png">

</head>
<body>
	<div id="container">
		<div class="wrapper">
			<div class="login_top_box">
				<div class="logo_wrapper">
					<h1 class="sprite_insta_big_logo"></h1>
				</div>
				<div class="form_container">
					<h2 class="register_comments">친구들의 사진과 동영상을 보려면 가입하세요.</h2>
					<form action="registerMember.do" method="post">
						<sec:csrfInput />
						<p class="login_user_name">
							<input type="email" name="id" id="id" placeholder="이메일" required="required">
						</p>
						<p class="login_user_name">
							<input type="text" name="name" placeholder="사용자 이름" required="required">
						</p>
						<p class="login_user_name">
							<input type="text" name="nickName" placeholder="사용자 닉네임" required="required">
						</p>
						<p class="login_user_password">
							<input type="password" name="pw" placeholder="비밀번호" required="required">
						</p>
						<input type="submit" id="submit_btn" value="가입" class="submit_btn">
					</form>
				</div>

			</div>
			<div class="login_middle_box">
				<div class="join_container">
					<p>
						계정이 있으신가요? 
						<a href="${pageContext.request.contextPath}/loginForm.do" class="join_link">로그인</a>
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>