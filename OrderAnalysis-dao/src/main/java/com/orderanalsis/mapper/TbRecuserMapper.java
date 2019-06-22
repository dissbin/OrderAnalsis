package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbRecuser;
import com.orderanalsis.pojo.TbRecuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRecuserMapper {
    int countByExample(TbRecuserExample example);

    int deleteByExample(TbRecuserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbRecuser record);

    int insertSelective(TbRecuser record);

    List<TbRecuser> selectByExample(TbRecuserExample example);

    TbRecuser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbRecuser record, @Param("example") TbRecuserExample example);

    int updateByExample(@Param("record") TbRecuser record, @Param("example") TbRecuserExample example);

    int updateByPrimaryKeySelective(TbRecuser record);

    int updateByPrimaryKey(TbRecuser record);
}