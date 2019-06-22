package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbRecMapper;
import com.orderanalsis.pojo.TbRec;
import com.orderanalsis.pojo.TbRecExample;
import com.orderanalsis.pojo.TbRecExample.Criteria;
import com.orderanalsis.ordergoods.service.RecService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RecServiceImpl implements RecService {

	@Autowired
	private TbRecMapper recMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRec> findAll() {
		return recMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRec> page=   (Page<TbRec>) recMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRec rec) {
		recMapper.insert(rec);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRec rec){
		recMapper.updateByPrimaryKey(rec);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRec findOne(Long id){
		return recMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			recMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbRec rec, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRecExample example=new TbRecExample();
		Criteria criteria = example.createCriteria();
		
		if(rec!=null){			
			if(rec.getCustId() != null) {
				criteria.andCustIdEqualTo(rec.getCustId());
			}
		}
		example.setOrderByClause("'rating' DESC");
		Page<TbRec> page= (Page<TbRec>)recMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
