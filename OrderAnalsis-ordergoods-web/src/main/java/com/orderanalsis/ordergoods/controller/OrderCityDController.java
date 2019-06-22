package com.orderanalsis.ordergoods.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbOrderCityD;
import com.orderanalsis.ordergoods.service.OrderCityDService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/orderCityD")
public class OrderCityDController {

	@Reference
	private OrderCityDService orderCityDService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbOrderCityD> findAll(){			
		return orderCityDService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return orderCityDService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param orderCityD
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbOrderCityD orderCityD){
		try {
			orderCityDService.add(orderCityD);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param orderCityD
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbOrderCityD orderCityD){
		try {
			orderCityDService.update(orderCityD);
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
	public TbOrderCityD findOne(Long id){
		return orderCityDService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			orderCityDService.delete(ids);
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
	public PageResult search(@RequestBody TbOrderCityD orderCityD, int page, int rows  ){
		return orderCityDService.findPage(orderCityD, page, rows);		
	}
	
}
