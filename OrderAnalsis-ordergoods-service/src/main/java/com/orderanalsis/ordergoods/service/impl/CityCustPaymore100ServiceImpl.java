package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbCityCustPaymore100Mapper;
import com.orderanalsis.pojo.TbCityCustPaymore100;
import com.orderanalsis.pojo.TbCityCustPaymore100Example;
import com.orderanalsis.pojo.TbCityCustPaymore100Example.Criteria;
import com.orderanalsis.ordergoods.service.CityCustPaymore100Service;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CityCustPaymore100ServiceImpl implements CityCustPaymore100Service {

	@Autowired
	private TbCityCustPaymore100Mapper cityCustPaymore100Mapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCityCustPaymore100> findAll() {
		return cityCustPaymore100Mapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCityCustPaymore100> page=   (Page<TbCityCustPaymore100>) cityCustPaymore100Mapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCityCustPaymore100 cityCustPaymore100) {
		cityCustPaymore100Mapper.insert(cityCustPaymore100);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCityCustPaymore100 cityCustPaymore100){
		cityCustPaymore100Mapper.updateByPrimaryKey(cityCustPaymore100);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCityCustPaymore100 findOne(Long id){
		return cityCustPaymore100Mapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cityCustPaymore100Mapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCityCustPaymore100 cityCustPaymore100, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCityCustPaymore100Example example=new TbCityCustPaymore100Example();
		Criteria criteria = example.createCriteria();
		
		if(cityCustPaymore100!=null){			
						if(cityCustPaymore100.getYm()!=null && cityCustPaymore100.getYm().length()>0){
				criteria.andYMLike("%"+cityCustPaymore100.getYm()+"%");
			}
	
		}
		
		Page<TbCityCustPaymore100> page= (Page<TbCityCustPaymore100>)cityCustPaymore100Mapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
