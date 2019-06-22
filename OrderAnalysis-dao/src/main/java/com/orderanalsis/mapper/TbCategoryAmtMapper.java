package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbCategoryAmt;

import com.orderanalsis.pojo.TbCategoryAmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCategoryAmtMapper {
    int countByExample(TbCategoryAmtExample example);

    int deleteByExample(TbCategoryAmtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCategoryAmt record);

    int insertSelective(TbCategoryAmt record);

    List<TbCategoryAmt> selectByExample(TbCategoryAmtExample example);

    TbCategoryAmt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCategoryAmt record, @Param("example") TbCategoryAmtExample example);

    int updateByExample(@Param("record") TbCategoryAmt record, @Param("example") TbCategoryAmtExample example);

    int updateByPrimaryKeySelective(TbCategoryAmt record);

    int updateByPrimaryKey(TbCategoryAmt record);
}