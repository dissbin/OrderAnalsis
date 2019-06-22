package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbCustAmtRankMapper;
import com.orderanalsis.pojo.TbCustAmtRank;
import com.orderanalsis.pojo.TbCustAmtRankExample;
import com.orderanalsis.pojo.TbCustAmtRankExample.Criteria;
import com.orderanalsis.ordergoods.service.CustAmtRankService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CustAmtRankServiceImpl implements CustAmtRankService {

	@Autowired
	private TbCustAmtRankMapper custAmtRankMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCustAmtRank> findAll() {
		return custAmtRankMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCustAmtRank> page=   (Page<TbCustAmtRank>) custAmtRankMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCustAmtRank custAmtRank) {
		custAmtRankMapper.insert(custAmtRank);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCustAmtRank custAmtRank){
		custAmtRankMapper.updateByPrimaryKey(custAmtRank);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCustAmtRank findOne(Long id){
		return custAmtRankMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			custAmtRankMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCustAmtRank custAmtRank, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCustAmtRankExample example=new TbCustAmtRankExample();
		Criteria criteria = example.createCriteria();
		
		if(custAmtRank!=null){			
						if(custAmtRank.getMobile()!=null && custAmtRank.getMobile().length()>0){
				criteria.andMobileLike("%"+custAmtRank.getMobile()+"%");
			}
	
		}
		
		Page<TbCustAmtRank> page= (Page<TbCustAmtRank>)custAmtRankMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
