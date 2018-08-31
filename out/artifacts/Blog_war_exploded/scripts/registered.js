function registered() {
    //获取参数
    var name = $("#regist_username").val().trim();
    var password = $("#regist_password").val().trim();
    var final_password = $("#final_password").val().trim();
    //检查数据格式
    var ok = true;
    if(name == ""){
        ok = false;
        $("#warning_1 span").html("用户不能为空");
        $("#warning_1").show();
    }
    if(password == ""){
        ok = false;
        $("#warning_2").html("密码不能为空");
        $("#warning_2").show();
    }else if(password.length > 0&password.length < 6){
        ok = false;
        $("#warning_2").html("密码不能小于6位");
        $("#warning_2").show();
    }
    if(final_password != password){
        ok = false;
        $("#warning_3").show();
    }
    if (ok = true){
        $.ajax({
            url:path+"/blog/addUser.do",
            type:"post",//请求发送方式
            data:{"name":name,"password":password},//发出的数据
            dataType:"json",//返回的数据
            success:function (result) {
                //注册成功
                if(result.status==0){
                    alert(result.msg);
                    //返回到登录页面
                    $("#back").click();
                }else if(result.status==1){
                    //用户名被占用
                    //alert(result.msg);
                    $("#warning_1 span").html(result.msg);
                    $("#warning_1").show();
                }
            },
            error:function () {
                alert("注册失败");
            }
        });
    }
}