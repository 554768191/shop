package wl.dao;

import wl.pojo.SMember;

public interface SMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SMember record);

    int insertSelective(SMember record);

    SMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SMember record);

    int updateByPrimaryKey(SMember record);
}