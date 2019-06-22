package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbCityCgyAmt;
import com.orderanalsis.pojo.TbCityCgyAmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCityCgyAmtMapper {
    int countByExample(TbCityCgyAmtExample example);

    int deleteByExample(TbCityCgyAmtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCityCgyAmt record);

    int insertSelective(TbCityCgyAmt record);

    List<TbCityCgyAmt> selectByExample(TbCityCgyAmtExample example);

    TbCityCgyAmt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCityCgyAmt record, @Param("example") TbCityCgyAmtExample example);

    int updateByExample(@Param("record") TbCityCgyAmt record, @Param("example") TbCityCgyAmtExample example);

    int updateByPrimaryKeySelective(TbCityCgyAmt record);

    int updateByPrimaryKey(TbCityCgyAmt record);
}