function blogDetail() {
    //获取userId
    var bId = getCookie("bId");
    //文章内容
    var diaryId = getQueryVariable('id');
    $.ajax({
        url:path+"/blog/content.do",
        type:"post",
        data:{"diaryId":diaryId},
        dataType:"json",
        success:function (result) {
            if(result.status == 0){
                diaryTitle = result.data.b_diary_title;
                diaryCreate = result.data.b_diary_create_time;
                diaryContent = result.data.b_diary_show_body;
                createDiary(diaryTitle,diaryCreate,diaryContent);
            }
        },
        error:function(){
            alert("列表加载失败!");
        }
    });
    //日记内容
    function createDiary(diaryTitle,diaryCreate,diaryContent) {
        $('#blogTitle').text(diaryTitle);
        $('#blogDate').text(diaryCreate);
        $('#blogContent').html(diaryContent);
    };
}