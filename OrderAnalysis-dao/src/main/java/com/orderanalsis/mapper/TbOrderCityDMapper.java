package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbOrderCityD;
import com.orderanalsis.pojo.TbOrderCityDExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderCityDMapper {
    int countByExample(TbOrderCityDExample example);

    int deleteByExample(TbOrderCityDExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbOrderCityD record);

    int insertSelective(TbOrderCityD record);

    List<TbOrderCityD> selectByExample(TbOrderCityDExample example);

    TbOrderCityD selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbOrderCityD record, @Param("example") TbOrderCityDExample example);

    int updateByExample(@Param("record") TbOrderCityD record, @Param("example") TbOrderCityDExample example);

    int updateByPrimaryKeySelective(TbOrderCityD record);

    int updateByPrimaryKey(TbOrderCityD record);
}