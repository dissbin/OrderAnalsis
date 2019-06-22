package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbRec;
import com.orderanalsis.pojo.TbRecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRecMapper {
    int countByExample(TbRecExample example);

    int deleteByExample(TbRecExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRec record);

    int insertSelective(TbRec record);

    List<TbRec> selectByExample(TbRecExample example);

    TbRec selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRec record, @Param("example") TbRecExample example);

    int updateByExample(@Param("record") TbRec record, @Param("example") TbRecExample example);

    int updateByPrimaryKeySelective(TbRec record);

    int updateByPrimaryKey(TbRec record);
}