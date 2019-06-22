package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbCityCustPaymore100;
import com.orderanalsis.pojo.TbCityCustPaymore100Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCityCustPaymore100Mapper {
    int countByExample(TbCityCustPaymore100Example example);

    int deleteByExample(TbCityCustPaymore100Example example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCityCustPaymore100 record);

    int insertSelective(TbCityCustPaymore100 record);

    List<TbCityCustPaymore100> selectByExample(TbCityCustPaymore100Example example);

    TbCityCustPaymore100 selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCityCustPaymore100 record, @Param("example") TbCityCustPaymore100Example example);

    int updateByExample(@Param("record") TbCityCustPaymore100 record, @Param("example") TbCityCustPaymore100Example example);

    int updateByPrimaryKeySelective(TbCityCustPaymore100 record);

    int updateByPrimaryKey(TbCityCustPaymore100 record);
}