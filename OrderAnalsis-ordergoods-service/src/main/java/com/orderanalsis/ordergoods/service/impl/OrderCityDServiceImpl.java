package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbOrderCityDMapper;
import com.orderanalsis.pojo.TbOrderCityD;
import com.orderanalsis.pojo.TbOrderCityDExample;
import com.orderanalsis.pojo.TbOrderCityDExample.Criteria;
import com.orderanalsis.ordergoods.service.OrderCityDService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class OrderCityDServiceImpl implements OrderCityDService {

	@Autowired
	private TbOrderCityDMapper orderCityDMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbOrderCityD> findAll() {
		return orderCityDMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbOrderCityD> page=   (Page<TbOrderCityD>) orderCityDMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbOrderCityD orderCityD) {
		orderCityDMapper.insert(orderCityD);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbOrderCityD orderCityD){
		orderCityDMapper.updateByPrimaryKey(orderCityD);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbOrderCityD findOne(Long id){
		return orderCityDMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			orderCityDMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbOrderCityD orderCityD, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbOrderCityDExample example=new TbOrderCityDExample();
		Criteria criteria = example.createCriteria();
		
		if(orderCityD!=null){			
				
		}
		
		Page<TbOrderCityD> page= (Page<TbOrderCityD>)orderCityDMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
