package com.orderanalsis.mapper;

import com.orderanalsis.pojo.TbCustGoodsAmt;
import com.orderanalsis.pojo.TbCustGoodsAmtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCustGoodsAmtMapper {
    int countByExample(TbCustGoodsAmtExample example);

    int deleteByExample(TbCustGoodsAmtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbCustGoodsAmt record);

    int insertSelective(TbCustGoodsAmt record);

    List<TbCustGoodsAmt> selectByExample(TbCustGoodsAmtExample example);

    TbCustGoodsAmt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbCustGoodsAmt record, @Param("example") TbCustGoodsAmtExample example);

    int updateByExample(@Param("record") TbCustGoodsAmt record, @Param("example") TbCustGoodsAmtExample example);

    int updateByPrimaryKeySelective(TbCustGoodsAmt record);

    int updateByPrimaryKey(TbCustGoodsAmt record);
}