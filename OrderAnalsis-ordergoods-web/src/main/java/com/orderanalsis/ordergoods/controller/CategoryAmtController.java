package com.orderanalsis.ordergoods.controller;
import java.util.List;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbCategoryAmt;
import com.orderanalsis.ordergoods.service.CategoryAmtService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/categoryAmt")
public class CategoryAmtController {

	@Reference
	private CategoryAmtService categoryAmtService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCategoryAmt> findAll(){			
		return categoryAmtService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return categoryAmtService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param categoryAmt
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCategoryAmt categoryAmt){
		try {
			categoryAmtService.add(categoryAmt);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param categoryAmt
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCategoryAmt categoryAmt){
		try {
			categoryAmtService.update(categoryAmt);
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
	public TbCategoryAmt findOne(Long id){
		return categoryAmtService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			categoryAmtService.delete(ids);
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
	public PageResult search(@RequestBody TbCategoryAmt categoryAmt, int page, int rows  ){
		return categoryAmtService.findPage(categoryAmt, page, rows);		
	}
	
}
