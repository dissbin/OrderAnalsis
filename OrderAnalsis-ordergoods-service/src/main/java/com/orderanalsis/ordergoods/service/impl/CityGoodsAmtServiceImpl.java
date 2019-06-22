package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbCityGoodsAmtMapper;
import com.orderanalsis.pojo.TbCityGoodsAmt;
import com.orderanalsis.pojo.TbCityGoodsAmtExample;
import com.orderanalsis.pojo.TbCityGoodsAmtExample.Criteria;
import com.orderanalsis.ordergoods.service.CityGoodsAmtService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CityGoodsAmtServiceImpl implements CityGoodsAmtService {

	@Autowired
	private TbCityGoodsAmtMapper cityGoodsAmtMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCityGoodsAmt> findAll() {
		return cityGoodsAmtMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCityGoodsAmt> page=   (Page<TbCityGoodsAmt>) cityGoodsAmtMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCityGoodsAmt cityGoodsAmt) {
		cityGoodsAmtMapper.insert(cityGoodsAmt);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCityGoodsAmt cityGoodsAmt){
		cityGoodsAmtMapper.updateByPrimaryKey(cityGoodsAmt);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCityGoodsAmt findOne(Long id){
		return cityGoodsAmtMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			cityGoodsAmtMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCityGoodsAmt cityGoodsAmt, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCityGoodsAmtExample example=new TbCityGoodsAmtExample();
		Criteria criteria = example.createCriteria();
		
		if(cityGoodsAmt!=null){			
						if(cityGoodsAmt.getGoodsName()!=null && cityGoodsAmt.getGoodsName().length()>0){
				criteria.andGoodsNameLike("%"+cityGoodsAmt.getGoodsName()+"%");
			}
			if(cityGoodsAmt.getCategoryName()!=null && cityGoodsAmt.getCategoryName().length()>0){
				criteria.andCategoryNameLike("%"+cityGoodsAmt.getCategoryName()+"%");
			}
			if(cityGoodsAmt.getParentName()!=null && cityGoodsAmt.getParentName().length()>0){
				criteria.andParentNameLike("%"+cityGoodsAmt.getParentName()+"%");
			}
	
		}
		example.setOrderByClause("'goods_sell_amt' DESC");
		Page<TbCityGoodsAmt> page= (Page<TbCityGoodsAmt>)cityGoodsAmtMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
