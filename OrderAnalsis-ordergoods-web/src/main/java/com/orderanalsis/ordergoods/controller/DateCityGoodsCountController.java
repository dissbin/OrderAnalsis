package com.orderanalsis.ordergoods.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbDateCityGoodsCount;
import com.orderanalsis.ordergoods.service.DateCityGoodsCountService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/dateCityGoodsCount")
public class DateCityGoodsCountController {

	@Reference
	private DateCityGoodsCountService dateCityGoodsCountService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbDateCityGoodsCount> findAll(){			
		return dateCityGoodsCountService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return dateCityGoodsCountService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param dateCityGoodsCount
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbDateCityGoodsCount dateCityGoodsCount){
		try {
			dateCityGoodsCountService.add(dateCityGoodsCount);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param dateCityGoodsCount
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbDateCityGoodsCount dateCityGoodsCount){
		try {
			dateCityGoodsCountService.update(dateCityGoodsCount);
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
	public TbDateCityGoodsCount findOne(Long id){
		return dateCityGoodsCountService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			dateCityGoodsCountService.delete(ids);
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
	public PageResult search(@RequestBody TbDateCityGoodsCount dateCityGoodsCount, int page, int rows  ){
		return dateCityGoodsCountService.findPage(dateCityGoodsCount, page, rows);		
	}
	
}
