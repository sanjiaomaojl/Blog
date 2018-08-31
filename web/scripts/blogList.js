//加载博客
function blogList() {
    //获取userId
    var bId = getCookie("bId");
    //判断是否有效
    $.ajax({
        url:path+"/blog/isLogin.do",
        type:"post",
        data:{"bId":bId},
        dataType:"json",
        success:function (result) {
            if (result.status == 0) {
                $('#linkA').text(result.data.b_user_name);
                if (result.data.b_user_name === 'demo') {
                    $('#linkB').text('博客管理').attr('href','blogManage.html');
                }
                $('#linkC').text('退出').click(function () {
                    delCookie("bId");
                    window.location.href = "blogList.html";
                });
            } else {
                $('#linkB').text('注册/登录').attr('href', 'log_in.html');
            }
        },
        error:function () {
            alert("登录失败!");
        }
    });
    //定义blog，加载HTML
    var blog = '';
    //显示日记列表
    $.ajax({
        url:path+"/blog/list.do",
        type:"post",
        dataType:"json",
        success:function (result) {
            if(result.status == 0){
                var blogs = result.data;
                for (var i = 0;i<=blogs.length; i++){
                    //获取博客日记ID
                    var diaryId = blogs[i].b_diary_id;
                    var diaryTitle = blogs[i].b_diary_title;
                    var diaryCreate = blogs[i].b_diary_create_time;
                    createDiaryList(diaryId,diaryTitle,diaryCreate);
                    addCookie("diaryId",diaryId,2);
                }
            }
        },
        error:function(){
            alert("列表加载失败!");
        }
    });
    //搜索
    $("#id_btn_search_submit").bind("click", function () {
        blog = '';
        $.ajax({
            url: path + "/blog/searchList.do",
            type: "post",
            data: {"title": $('#title').val()},
            dataType: "json",
            success: function (result) {
                if (result.status == 0) {
                    var blogs = result.data;
                    for (var i = 0; i <= blogs.length; i++) {
                        //获取博客日记ID
                        var diaryId = blogs[i].b_diary_id;
                        var diaryTitle = blogs[i].b_diary_title;
                        var diaryCreate = blogs[i].b_diary_create_time;
                        createDiaryList(diaryId, diaryTitle, diaryCreate);
                        addCookie("diaryId", diaryId, 2);
                    }
                    $('#blogPoList').html(blog);
                }
            },
            error: function () {
                alert("列表加载失败!");
            }
        });
    });
    //传参显示日记的名字和创建时间
    function createDiaryList(diaryId,diaryTitle,diaryCreate) {
        blog = blog +
            '<div class="card mt-3">\n' +
            '    <div class="card-body">\n' +
            '        <a href="blogDetail.html?id=' + diaryId + '" class="text-dark"><h4\n' +
            '                class="card-title font-weight-bold">' + diaryTitle + '</h4>\n' +
            '        </a>\n' +
            '        <p class="text-right text-secondary">' + diaryCreate + '</p>\n' +
            '    </div>\n' +
            '</div>\n';
        $('#blogPoList').html(blog);
    };
}