function userLogin() {
    //获取参数
    var name = $("#count").val().trim();
    var password = $("#password").val().trim();
    //格式检测
    var ok = true;
    if (name == ""){
        $("#name_msg").html("用户名不能为空");
        ok = false;
    }if(password == ""){
        $("#password_msg").html("密码不能为空");
        ok = false;
    }
    //发送请求
    if(ok){
        $.ajax({
            url:path+"/user/login.do",
            type:"post",
            data:{"name":name,"password":password},
            dataType:"json",
            success:function (result) {
                //result是服务器返回的JSON结果
                if(result.status == 0){
                    //将用户信息保存到Cookie
                    var userId = result.data.cn_user_id;
                    addCookie("userId",userId,2);
                    //登陆成功跳转页面
                    window.location.href = "edit.html";
                }else if(result.status == 1){
                    $("#name_msg").html(result.msg);
                }else if (result.status == 2){
                    $("#password_msg").html(result.msg);
                }
            },
            error:function(){
                alert("登录失败!");
            }
        });
    }
}