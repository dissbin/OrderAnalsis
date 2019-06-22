package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbCustAmtRank;
import com.orderanalsis.pojo.TbCustAmtRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCustAmtRankMapper {
    int countByExample(TbCustAmtRankExample example);

    int deleteByExample(TbCustAmtRankExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustAmtRank record);

    int insertSelective(TbCustAmtRank record);

    List<TbCustAmtRank> selectByExample(TbCustAmtRankExample example);

    TbCustAmtRank selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCustAmtRank record, @Param("example") TbCustAmtRankExample example);

    int updateByExample(@Param("record") TbCustAmtRank record, @Param("example") TbCustAmtRankExample example);

    int updateByPrimaryKeySelective(TbCustAmtRank record);

    int updateByPrimaryKey(TbCustAmtRank record);
}