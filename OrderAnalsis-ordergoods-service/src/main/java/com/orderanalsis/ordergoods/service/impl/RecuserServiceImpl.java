package com.orderanalsis.ordergoods.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orderanalsis.mapper.TbRecuserMapper;
import com.orderanalsis.pojo.TbRecuser;
import com.orderanalsis.pojo.TbRecuserExample;
import com.orderanalsis.pojo.TbRecuserExample.Criteria;
import com.orderanalsis.ordergoods.service.RecuserService;

import entity.PageResult;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class RecuserServiceImpl implements RecuserService {

	@Autowired
	private TbRecuserMapper recuserMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbRecuser> findAll() {
		return recuserMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbRecuser> page=   (Page<TbRecuser>) recuserMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbRecuser recuser) {
		recuserMapper.insert(recuser);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbRecuser recuser){
		recuserMapper.updateByPrimaryKey(recuser);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbRecuser findOne(Long id){
		return recuserMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			recuserMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
		@Override
	public PageResult findPage(TbRecuser recuser, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbRecuserExample example=new TbRecuserExample();
		Criteria criteria = example.createCriteria();
		
		if(recuser!=null){			
						if(recuser.getGoodsId()!=null && recuser.getGoodsId().length()>0){
				criteria.andGoodsIdLike("%"+recuser.getGoodsId()+"%");
			}
	
		}
		
		Page<TbRecuser> page= (Page<TbRecuser>)recuserMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
