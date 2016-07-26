package wl.dao;

import java.util.List;
import java.util.Map;

import wl.pojo.SBoss;

public interface SBossMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SBoss record);

    int insertSelective(SBoss record);

    SBoss selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SBoss record);

    int updateByPrimaryKey(SBoss record);
    
    List<SBoss> selectByTelAndPassword(Map<String,Object> map);
}