package wl.dao;

import wl.pojo.SOrderServiceKey;

public interface SOrderServiceMapper {
    int deleteByPrimaryKey(SOrderServiceKey key);

    int insert(SOrderServiceKey record);

    int insertSelective(SOrderServiceKey record);
}