package wl.dao;

import wl.pojo.Ahrecord;

public interface AhrecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ahrecord record);

    int insertSelective(Ahrecord record);

    Ahrecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ahrecord record);

    int updateByPrimaryKey(Ahrecord record);
}