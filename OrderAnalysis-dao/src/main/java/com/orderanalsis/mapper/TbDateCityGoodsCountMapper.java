package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbDateCityGoodsCount;
import com.orderanalsis.pojo.TbDateCityGoodsCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbDateCityGoodsCountMapper {
    int countByExample(TbDateCityGoodsCountExample example);

    int deleteByExample(TbDateCityGoodsCountExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbDateCityGoodsCount record);

    int insertSelective(TbDateCityGoodsCount record);

    List<TbDateCityGoodsCount> selectByExample(TbDateCityGoodsCountExample example);

    TbDateCityGoodsCount selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbDateCityGoodsCount record, @Param("example") TbDateCityGoodsCountExample example);

    int updateByExample(@Param("record") TbDateCityGoodsCount record, @Param("example") TbDateCityGoodsCountExample example);

    int updateByPrimaryKeySelective(TbDateCityGoodsCount record);

    int updateByPrimaryKey(TbDateCityGoodsCount record);
}