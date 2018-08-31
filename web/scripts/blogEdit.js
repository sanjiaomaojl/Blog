//增加文章
function blogEdit() {
    //获取userId
    var bId = getCookie("bId");
    //判断是否登录
    $.ajax({
        url:path+"/blog/isLogin.do",
        type:"post",
        data:{"bId":bId},
        dataType:"json",
        success:function (result) {
            if (result.status === 0) {
                $('#linkA').text(result.data.b_user_name);
                if (result.data.b_user_name === 'demo') {
                    $('#linkB').text('博客管理').attr('href','blogManage.html');
                }
                $('#linkC').text('退出').attr('href', path+'/blog/loginOut.do');
            } else {
                $('#linkB').text('注册/登录').attr('href', 'log_in.html');
            }
        },
        error:function () {
            alert("登录失败!");
        }
    });
    //增加文章
    var testEditor;
    testEditor = editormd("test-editormd", {
        width: "100%",
        height: 640,
        syncScrolling: "single",
        path: "vendor/editor/lib/",
        saveHTMLToTextarea: true
    });
    $("#id_btn_blog_submit").bind("click", function () {
        $.ajax({
            url:path+"/blog/addBlog.do",
            type:"post",
            data:{"title":$('#title').val(),"content":testEditor.getMarkdown(),"showContent":$(".markdown-body").prop('outerHTML')},
            dataType:"json",
            success:function (result) {
                if (result.status == 0){
                    alert('提交成功');
                    window.location.href = "blogList.html";
                }
            },
            error:function () {
                alert('提交失败');
            }
        });
    });
}