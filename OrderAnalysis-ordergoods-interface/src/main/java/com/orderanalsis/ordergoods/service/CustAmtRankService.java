package com.orderanalsis.ordergoods.service;
import java.util.List;
import com.orderanalsis.pojo.TbCustAmtRank;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface CustAmtRankService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbCustAmtRank> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbCustAmtRank custAmtRank);
	
	
	/**
	 * 修改
	 */
	public void update(TbCustAmtRank custAmtRank);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbCustAmtRank findOne(Long id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Long [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(TbCustAmtRank custAmtRank, int pageNum,int pageSize);
	
}
