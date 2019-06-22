package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbCityCgyAmtMapper;
import com.orderanalsis.pojo.TbCityCgyAmt;
import com.orderanalsis.pojo.TbCityCgyAmtExample;
import com.orderanalsis.pojo.TbCityCgyAmtExample.Criteria;
import com.orderanalsis.ordergoods.service.CityCgyAmtService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CityCgyAmtServiceImpl implements CityCgyAmtService {

	@Autowired
	private TbCityCgyAmtMapper cityCgyAmtMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCityCgyAmt> findAll() {
		return cityCgyAmtMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCityCgyAmt> page=   (Page<TbCityCgyAmt>) cityCgyAmtMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCityCgyAmt cityCgyAmt) {
		cityCgyAmtMapper.insert(cityCgyAmt);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCityCgyAmt cityCgyAmt){
		cityCgyAmtMapper.updateByPrimaryKey(cityCgyAmt);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCityCgyAmt findOne(Long id){
		return cityCgyAmtMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cityCgyAmtMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCityCgyAmt cityCgyAmt, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCityCgyAmtExample example=new TbCityCgyAmtExample();
		Criteria criteria = example.createCriteria();
		
		if(cityCgyAmt!=null){			
						if(cityCgyAmt.getCategoryName()!=null && cityCgyAmt.getCategoryName().length()>0){
				criteria.andCategoryNameLike("%"+cityCgyAmt.getCategoryName()+"%");
			}
			if(cityCgyAmt.getParentName()!=null && cityCgyAmt.getParentName().length()>0){
				criteria.andParentNameLike("%"+cityCgyAmt.getParentName()+"%");
			}
	
		}
		
		Page<TbCityCgyAmt> page= (Page<TbCityCgyAmt>)cityCgyAmtMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
