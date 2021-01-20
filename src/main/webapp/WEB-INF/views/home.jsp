<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<article class="contents">
		<header class="top">
			<div class="user_container">
				<div class="profile_img">
					<img src="imgs/thumb.jpeg" alt="프로필이미지">
				</div>
				<div class="user_name">
					<div class="nick_name m_text">KindTiger</div>
					<div class="country s_text">Seoul, South Korea</div>
				</div>

			</div>

			<div class="sprite_more_icon" data-name="more">
				<ul class="toggle_box">
					<li><input type="submit" class="follow" value="팔로우"
						data-name="follow"></li>
					<li>수정</li>
					<li>삭제</li>
				</ul>
			</div>
		</header>

		<div class="img_section">
			<div class="trans_inner">
				<div>
					<img src="imgs/img_section/img01.jpg" alt="visual01">
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
					<div class="nick_name m_text">dongdong2</div>
					<div>강아지가 너무 귀여워요~!</div>
				</div>
			</div>
			<div class="small_heart">
				<div class="sprite_small_heart_icon_outline"></div>
			</div>
		</div>

		<div class="timer">1시간 전</div>

		<div class="comment_field" id="add-comment-post37">
			<input type="text" placeholder="댓글달기...">
			<div class="upload_btn m_text" data-name="comment">게시</div>
		</div>
	</article>

</div>