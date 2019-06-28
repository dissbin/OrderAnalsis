package com.orderanalsis.ordergoods.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbCategoryAmtMapper;
import com.orderanalsis.pojo.TbCategoryAmt;
import com.orderanalsis.pojo.TbCategoryAmtExample;
import com.orderanalsis.pojo.TbCategoryAmtExample.Criteria;
import com.orderanalsis.ordergoods.service.CategoryAmtService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CategoryAmtServiceImpl implements CategoryAmtService {

	@Autowired
	private TbCategoryAmtMapper categoryAmtMapper;
	
	/**
	 * 查询全部
	 * 
	 */
	@Override
	public List<TbCategoryAmt> findAll() {
		return categoryAmtMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCategoryAmt> page=   (Page<TbCategoryAmt>) categoryAmtMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCategoryAmt categoryAmt) {
		categoryAmtMapper.insert(categoryAmt);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCategoryAmt categoryAmt){
		categoryAmtMapper.updateByPrimaryKey(categoryAmt);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCategoryAmt findOne(Long id){
		return categoryAmtMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			categoryAmtMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCategoryAmt categoryAmt, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCategoryAmtExample example=new TbCategoryAmtExample();
		Criteria criteria = example.createCriteria();
		
		if(categoryAmt!=null){			
				if(categoryAmt.getCategoryName()!=null && categoryAmt.getCategoryName().length()>0){
						criteria.andCategoryNameLike("%"+categoryAmt.getCategoryName()+"%");
				}
		}
		example.setOrderByClause("'goods_sell_amt' DESC");
		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
