package wl.dao;

import wl.pojo.SCard;

public interface SCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SCard record);

    int insertSelective(SCard record);

    SCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SCard record);

    int updateByPrimaryKey(SCard record);
}