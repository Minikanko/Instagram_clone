<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/login.css">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/imgs/instagram.png">

</head>
<body>
	<div id="container">
		<div class="wrapper">
			<div class="login_top_box">
				<div class="logo_wrapper">
					<h1 class="sprite_insta_big_logo"></h1>
				</div>
				<div class="form_container">
					<form action="#">
						<p class="login_user_name">
							<input type="text" id="user_name"
								placeholder="전화번호,사용자 이름 또는 이메일">
						</p>

						<p class="login_user_password">
							<input type="text" id="user_password" placeholder="비밀번호">
						</p>

						<input type="submit" id="submit_btn" value="로그인"
							class="submit_btn">
					</form>
				</div>
				<div class="or_wrapper">
					<hr class="or_left_box">

					<div class="or_middle_box">또는</div>
					<hr class="or_right_box">
				</div>
				<div class="forget_pw_box">
					<a href="#" class="find_pw">비밀번호를 잊으셨나요?</a>
				</div>
			</div>
			<div class="login_middle_box">
				<div class="join_container">
					<p>
						계정이 없으신가요? <a href="#" class="join_link">가입하기</a>
					</p>
				</div>
			</div>
		</div>

	</div>

</body>
</html>