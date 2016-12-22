//servlet+ajax+jquery+angular实例js
var app=angular.module('app',[]);
app.controller('controller', ['$scope',function($scope) {
	$scope.data='';
	$scope.name='test';
	$scope.cityName=[''];
	
	$("#province").change(//监听省份下拉菜单选择事件
			function(){
				var province=$("#province").val();//得到选择的省份
				$.ajax({
					url:"/ajax/springmvcajax",
					data:{province:province},
					type:'post',
				    dataType:"json",  
					success: function(data){
						$("#city").show();
						$scope.cityName=data;
						$scope.$apply();//需要手动刷新 
					},
				});
			}		
	);
	$("#city").hide();
}]);