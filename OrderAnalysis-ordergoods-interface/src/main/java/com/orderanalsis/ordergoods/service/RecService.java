package com.orderanalsis.ordergoods.service;
import java.util.List;
import com.orderanalsis.pojo.TbRec;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RecService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbRec> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbRec rec);
	
	
	/**
	 * 修改
	 */
	public void update(TbRec rec);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbRec findOne(Long id);
	
	
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
	public PageResult findPage(TbRec rec, int pageNum,int pageSize);
	
}
