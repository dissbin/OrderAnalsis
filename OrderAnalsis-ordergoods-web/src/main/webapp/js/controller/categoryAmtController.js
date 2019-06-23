 //控制层 
app.controller('categoryAmtController' ,function($scope,$controller,categoryAmtService,cityGoodsAmtService,orderCityDService,recService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
	

	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		categoryAmtService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		categoryAmtService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		categoryAmtService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=categoryAmtService.update( $scope.entity ); //修改  
		}else{
			serviceObject=categoryAmtService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询 
		        	$scope.reloadList();//重新加载
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		categoryAmtService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	
	//搜索
	
	$scope.search=function(page,rows){			
		categoryAmtService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
				$scope.indexDataViewStatus = 1;
				onclick1();
			}			
		);
	}
    
	$scope.findCategoryAmt = function(){
		categoryAmtService.search(1,200,$scope.searchEntity).success(
				function(response){
					$scope.list=response.rows;	
					$scope.paginationConf.totalItems=response.total;//更新总记录数
					onclick1();
					
				}			
		);
	} 
	
	
	//Top5
	$scope.findSellTop5 = function(){
		cityGoodsAmtService.findAll().success(
				function(response){
					$scope.top5List = response;
					showSellTop5();
					
				}
		);
	}
	//city
	$scope.findCityTop = function(){
		orderCityDService.findAll().success(
			function(response){
				$scope.cityList = response;
				showCityTop();
				
			}
		);
	}
	//rec
	$scope.recSearchEntity = {custId:0};
	$scope.searchStatus = 0;
	$scope.dataViewStatus = 1;
	$scope.searchEntity={searchCustId:0};
	isRecommend = false;
	$scope.goodsRecommend = function(){
		isRecommend = true;
		$scope.recSearchEntity['custId'] = $scope.searchEntity['searchCustId'];
		//alert($scope.searchEntity['searchCustId']);
		
		recService.search(1,10,$scope.recSearchEntity).success(
				function(response){
					$scope.recommendGoods=response.rows;	
					$scope.paginationConf.totalItems=response.total;//更新总记录数
					
					showRecommendGoods();
					$scope.dataViewStatus = 1;
				}			
		);
	}

});	
