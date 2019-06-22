package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbDateCityGoodsCountMapper;
import com.orderanalsis.pojo.TbDateCityGoodsCount;
import com.orderanalsis.pojo.TbDateCityGoodsCountExample;
import com.orderanalsis.pojo.TbDateCityGoodsCountExample.Criteria;
import com.orderanalsis.ordergoods.service.DateCityGoodsCountService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DateCityGoodsCountServiceImpl implements DateCityGoodsCountService {

	@Autowired
	private TbDateCityGoodsCountMapper dateCityGoodsCountMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbDateCityGoodsCount> findAll() {
		return dateCityGoodsCountMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbDateCityGoodsCount> page=   (Page<TbDateCityGoodsCount>) dateCityGoodsCountMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbDateCityGoodsCount dateCityGoodsCount) {
		dateCityGoodsCountMapper.insert(dateCityGoodsCount);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbDateCityGoodsCount dateCityGoodsCount){
		dateCityGoodsCountMapper.updateByPrimaryKey(dateCityGoodsCount);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbDateCityGoodsCount findOne(Long id){
		return dateCityGoodsCountMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			dateCityGoodsCountMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbDateCityGoodsCount dateCityGoodsCount, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbDateCityGoodsCountExample example=new TbDateCityGoodsCountExample();
		Criteria criteria = example.createCriteria();
		
		if(dateCityGoodsCount!=null){			
						if(dateCityGoodsCount.getCdate()!=null && dateCityGoodsCount.getCdate().length()>0){
				criteria.andCdateLike("%"+dateCityGoodsCount.getCdate()+"%");
			}
	
		}
		
		Page<TbDateCityGoodsCount> page= (Page<TbDateCityGoodsCount>)dateCityGoodsCountMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
