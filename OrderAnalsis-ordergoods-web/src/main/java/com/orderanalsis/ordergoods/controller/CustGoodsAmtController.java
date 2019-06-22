package com.orderanalsis.ordergoods.controller;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;
import com.orderanalsis.pojo.TbCustGoodsAmt;
import com.orderanalsis.ordergoods.service.CustGoodsAmtService;

import entity.PageResult;
import entity.Result;
/**
 * controller
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/custGoodsAmt")
public class CustGoodsAmtController {

	@Reference
	private CustGoodsAmtService custGoodsAmtService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public List<TbCustGoodsAmt> findAll(){			
		return custGoodsAmtService.findAll();
	}
	
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return custGoodsAmtService.findPage(page, rows);
	}
	
	/**
	 * 增加
	 * @param custGoodsAmt
	 * @return
	 */
	@RequestMapping("/add")
	public Result add(@RequestBody TbCustGoodsAmt custGoodsAmt){
		try {
			custGoodsAmtService.add(custGoodsAmt);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param custGoodsAmt
	 * @return
	 */
	@RequestMapping("/update")
	public Result update(@RequestBody TbCustGoodsAmt custGoodsAmt){
		try {
			custGoodsAmtService.update(custGoodsAmt);
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
	public TbCustGoodsAmt findOne(Long id){
		return custGoodsAmtService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			custGoodsAmtService.delete(ids);
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
	public PageResult search(@RequestBody TbCustGoodsAmt custGoodsAmt, int page, int rows  ){
		return custGoodsAmtService.findPage(custGoodsAmt, page, rows);		
	}
	
}
