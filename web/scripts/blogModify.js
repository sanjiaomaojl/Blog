function blogModify() {
    //获取文章ID
    var diaryId = getQueryVariable('id');
    //获取userId
    var bId = getCookie("bId");
    //判断是否有效
    $.ajax({
        url:path+"/blog/isLogin.do",
        type:"post",
        data:{"bId":bId},
        dataType:"json",
        success:function (result) {
            if (result.status != 0)
                alert('用户未登录')
        }
    });
    //先加载博客日记内容
    $.ajax({
        url:path+"/blog/content.do",
        type:"post",
        data:{"diaryId":diaryId},
        dataType:"json",
        success:function (result) {
            var testEditor;
            testEditor = editormd("test-editormd", {
                width: "100%",
                height: 640,
                syncScrolling: "single",
                path: "vendor/editor/lib/",
                saveHTMLToTextarea: true
            });
            if (result.status == 0) {
                $('#title').attr('value', result.data.b_diary_title);
                $('#content').html(result.data.b_diary_body);
                $('#content2').html(result.data.b_diary_show_body);
            }
            //修改内容的ajax请求
            $("#id_btn_blog_submit").bind("click", function () {
                $.ajax({
                    url:path+"/blog/modifyBlog.do",
                    type:"post",
                    data:{"diaryId":diaryId,"title":$('#title').val(),"content":testEditor.getMarkdown(),"showContent":$(".markdown-body").prop('outerHTML')},
                    dataType:"json",
                    success:function (result) {
                        if(result.status == 0){
                            alert('更新成功');
                            window.location.reload();
                        }
                    },
                    error:function () {
                        alert("更新失败");
                    }
                });
            });
        },
        error:function () {
            alert("查询失败");
        }
    });
}