package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbCityGoodsAmt;
import com.orderanalsis.pojo.TbCityGoodsAmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCityGoodsAmtMapper {
    int countByExample(TbCityGoodsAmtExample example);

    int deleteByExample(TbCityGoodsAmtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCityGoodsAmt record);

    int insertSelective(TbCityGoodsAmt record);

    List<TbCityGoodsAmt> selectByExample(TbCityGoodsAmtExample example);

    TbCityGoodsAmt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCityGoodsAmt record, @Param("example") TbCityGoodsAmtExample example);

    int updateByExample(@Param("record") TbCityGoodsAmt record, @Param("example") TbCityGoodsAmtExample example);

    int updateByPrimaryKeySelective(TbCityGoodsAmt record);

    int updateByPrimaryKey(TbCityGoodsAmt record);
}