package com.orderanalsis.ordergoods.service;
import java.util.List;
import com.orderanalsis.pojo.TbRecuser;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface RecuserService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbRecuser> findAll();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbRecuser recuser);
	
	
	/**
	 * 修改
	 */
	public void update(TbRecuser recuser);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbRecuser findOne(Long id);
	
	
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
	public PageResult findPage(TbRecuser recuser, int pageNum,int pageSize);
	
}
