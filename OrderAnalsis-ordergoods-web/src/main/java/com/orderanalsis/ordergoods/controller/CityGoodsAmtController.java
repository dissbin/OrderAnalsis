package com.orderanalsis.ordergoods.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbCityGoodsAmt;
import com.orderanalsis.ordergoods.service.CityGoodsAmtService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cityGoodsAmt")
public class CityGoodsAmtController {

	@Reference
	private CityGoodsAmtService cityGoodsAmtService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCityGoodsAmt> findAll(){			
		return cityGoodsAmtService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return cityGoodsAmtService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param cityGoodsAmt
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCityGoodsAmt cityGoodsAmt){
		try {
			cityGoodsAmtService.add(cityGoodsAmt);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param cityGoodsAmt
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCityGoodsAmt cityGoodsAmt){
		try {
			cityGoodsAmtService.update(cityGoodsAmt);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	public TbCityGoodsAmt findOne(Long id){
		return cityGoodsAmtService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cityGoodsAmtService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/search")
	public PageResult search(@RequestBody TbCityGoodsAmt cityGoodsAmt, int page, int rows  ){
		return cityGoodsAmtService.findPage(cityGoodsAmt, page, rows);		
	}
	
}
