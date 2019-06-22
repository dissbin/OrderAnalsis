package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbCustGoodsAmtMapper;
import com.orderanalsis.pojo.TbCustGoodsAmt;
import com.orderanalsis.pojo.TbCustGoodsAmtExample;
import com.orderanalsis.pojo.TbCustGoodsAmtExample.Criteria;
import com.orderanalsis.ordergoods.service.CustGoodsAmtService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class CustGoodsAmtServiceImpl implements CustGoodsAmtService {

	@Autowired
	private TbCustGoodsAmtMapper custGoodsAmtMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbCustGoodsAmt> findAll() {
		return custGoodsAmtMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbCustGoodsAmt> page=   (Page<TbCustGoodsAmt>) custGoodsAmtMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbCustGoodsAmt custGoodsAmt) {
		custGoodsAmtMapper.insert(custGoodsAmt);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbCustGoodsAmt custGoodsAmt){
		custGoodsAmtMapper.updateByPrimaryKey(custGoodsAmt);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbCustGoodsAmt findOne(Long id){
		return custGoodsAmtMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			custGoodsAmtMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbCustGoodsAmt custGoodsAmt, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbCustGoodsAmtExample example=new TbCustGoodsAmtExample();
		Criteria criteria = example.createCriteria();
		
		if(custGoodsAmt!=null){			
						if(custGoodsAmt.getGoodsName()!=null && custGoodsAmt.getGoodsName().length()>0){
				criteria.andGoodsNameLike("%"+custGoodsAmt.getGoodsName()+"%");
			}
			if(custGoodsAmt.getCategoryName()!=null && custGoodsAmt.getCategoryName().length()>0){
				criteria.andCategoryNameLike("%"+custGoodsAmt.getCategoryName()+"%");
			}
			if(custGoodsAmt.getParentName()!=null && custGoodsAmt.getParentName().length()>0){
				criteria.andParentNameLike("%"+custGoodsAmt.getParentName()+"%");
			}
	
		}
		
		Page<TbCustGoodsAmt> page= (Page<TbCustGoodsAmt>)custGoodsAmtMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
