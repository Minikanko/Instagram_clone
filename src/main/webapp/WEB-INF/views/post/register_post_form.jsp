<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <div id="main_container">

        <div class="post_form_container">
            <form action="#" class="post_form">
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
                    <input type="file" name="photo" id="id_photo" required="required">
                </p>
                <p>
                    <textarea name="content" id="text_field" cols="50" rows="5" placeholder="140자 까지 등록 가능합니다.
#태그명 을 통해서 검색 태그를 등록할 수 있습니다.
예시 : I # love # insta!"></textarea>

                </p>
                <input class="submit_btn" type="submit" value="저장">
            </form>

        </div>

    </div>
