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
			/*userAction!login.action*/
			url: 'selLogin',
			type: 'POST',
			async:false,
			data:{'usercode':usercode,'userpassword':userpassword},
			dataType: 'text',
			timeout: 5000,
			/*error: function(){
				alert("服务器连接失败.....");
			},*/
			success: function(obj){
				if(obj=="success"){
					flag = true;
				}else {
					flag=false;
					alert(obj);
				}
			/*	alert(obj.message);*/
			}
			});
	}
	return flag;
}

