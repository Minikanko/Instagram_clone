<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

 <div id="main_container">
        <div class="post_form_container">
            <form action="registerPost.do" class="post_form" enctype="multipart/form-data" method="post">
            <sec:csrfInput/>
                <div class="title">
                    NEW POST
                </div>
                <div class="preview">
                    <div class="upload">
                        <div class="post_btn">
                            <div class="plus_icon">
                                <span></span>
                                <span></span>
                            </div>
                            <p>포스트 이미지 추가</p>
                            <canvas id="imageCanvas"></canvas>
                            <!--<p><img id="img_id" src="#" style="width: 300px; height: 300px; object-fit: cover" alt="thumbnail"></p>-->
                        </div>
                    </div>
                </div>
                <p>
                    <input multiple="multiple"  type="file" name="picFile" id="id_photo" required="required">
                </p>
                <p>
                    <textarea id="text_field" name="comments" cols="50" rows="5" required="required" placeholder="140자 까지 등록 가능합니다.
#태그명 을 통해서 검색 태그를 등록할 수 있습니다.
예시 : I # love # insta!"></textarea>

                </p>
                <input class="submit_btn" type="submit" value="업로드">
            </form>

        </div>

    </div>
