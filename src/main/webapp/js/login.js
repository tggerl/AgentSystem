function validateLoginUserFunc(){
	var flag = false;
	
	var usercode = $.trim($("#usercode").val());
	var userpassword = $.trim($("#userpassword").val());
	
	if(usercode == "" || usercode == null){
		 $("#usercode").focus();
		 alert("对不起，登录账号不能为空。");
	}else if(userpassword == "" || userpassword == null){
		 $("#userpassword").focus();
		 alert("对不起，登录密码不能为空。");
	}else{
		$.ajax({
			url: 'userAction!login.action',
			type: 'POST',
			async:false,
			data:{'user.userCode':usercode,'user.userPassword':userpassword},
			dataType: 'json',
			timeout: 5000,
			error: function(){
				alert("服务器连接失败.....");
			},
			success: function(obj){
				if(obj.success){
					flag = true;
				}
				alert(obj.message);
			}
			});
	}
	return flag;
}

