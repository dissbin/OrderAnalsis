package com.orderanalsis.ordergoods.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbCityCustPaymore100;
import com.orderanalsis.ordergoods.service.CityCustPaymore100Service;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cityCustPaymore100")
public class CityCustPaymore100Controller {

	@Reference
	private CityCustPaymore100Service cityCustPaymore100Service;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCityCustPaymore100> findAll(){			
		return cityCustPaymore100Service.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return cityCustPaymore100Service.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param cityCustPaymore100
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCityCustPaymore100 cityCustPaymore100){
		try {
			cityCustPaymore100Service.add(cityCustPaymore100);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param cityCustPaymore100
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCityCustPaymore100 cityCustPaymore100){
		try {
			cityCustPaymore100Service.update(cityCustPaymore100);
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
	public TbCityCustPaymore100 findOne(Long id){
		return cityCustPaymore100Service.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cityCustPaymore100Service.delete(ids);
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
	public PageResult search(@RequestBody TbCityCustPaymore100 cityCustPaymore100, int page, int rows  ){
		return cityCustPaymore100Service.findPage(cityCustPaymore100, page, rows);		
	}
	
}
