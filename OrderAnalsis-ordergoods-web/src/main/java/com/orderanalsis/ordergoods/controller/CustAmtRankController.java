package com.orderanalsis.ordergoods.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbCustAmtRank;
import com.orderanalsis.ordergoods.service.CustAmtRankService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/custAmtRank")
public class CustAmtRankController {

	@Reference
	private CustAmtRankService custAmtRankService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCustAmtRank> findAll(){			
		return custAmtRankService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return custAmtRankService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param custAmtRank
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCustAmtRank custAmtRank){
		try {
			custAmtRankService.add(custAmtRank);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param custAmtRank
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCustAmtRank custAmtRank){
		try {
			custAmtRankService.update(custAmtRank);
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
	public TbCustAmtRank findOne(Long id){
		return custAmtRankService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			custAmtRankService.delete(ids);
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
	public PageResult search(@RequestBody TbCustAmtRank custAmtRank, int page, int rows  ){
		return custAmtRankService.findPage(custAmtRank, page, rows);		
	}
	
}
