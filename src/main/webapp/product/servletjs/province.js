//servlet+ajax+jquery实例js
$("#province").change(//监听省份下拉菜单选择事件
function(){
	var province=$("#province").val();//得到选择的省份
	$.ajax({
			url:"/ajax/CityServlet",
			data:{province:province},
			type:'post',
			success: function(data){
				$("#city").show();
				$("#city").append(data);
			},
	});
}		
);
$("#city").hide();