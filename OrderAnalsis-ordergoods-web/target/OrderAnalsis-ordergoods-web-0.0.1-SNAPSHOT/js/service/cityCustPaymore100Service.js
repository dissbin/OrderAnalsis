//服务层
app.service('cityCustPaymore100Service',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../cityCustPaymore100/findAll.do');		
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../cityCustPaymore100/findPage.do?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../cityCustPaymore100/findOne.do?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../cityCustPaymore100/add.do',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../cityCustPaymore100/update.do',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../cityCustPaymore100/delete.do?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../cityCustPaymore100/search.do?page='+page+"&rows="+rows, searchEntity);
	}    	
});
