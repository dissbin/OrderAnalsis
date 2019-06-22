package com.orderanalsis.ordergoods.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbCityCgyAmt;
import com.orderanalsis.ordergoods.service.CityCgyAmtService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/cityCgyAmt")
public class CityCgyAmtController {

	@Reference
	private CityCgyAmtService cityCgyAmtService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCityCgyAmt> findAll(){			
		return cityCgyAmtService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return cityCgyAmtService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param cityCgyAmt
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCityCgyAmt cityCgyAmt){
		try {
			cityCgyAmtService.add(cityCgyAmt);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param cityCgyAmt
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCityCgyAmt cityCgyAmt){
		try {
			cityCgyAmtService.update(cityCgyAmt);
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
	public TbCityCgyAmt findOne(Long id){
		return cityCgyAmtService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			cityCgyAmtService.delete(ids);
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
	public PageResult search(@RequestBody TbCityCgyAmt cityCgyAmt, int page, int rows  ){
		return cityCgyAmtService.findPage(cityCgyAmt, page, rows);		
	}
	
}
