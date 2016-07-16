package wl.dao;

import java.util.List;

import wl.pojo.SRole;

public interface SRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SRole record);

    int insertSelective(SRole record);

    SRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SRole record);

    int updateByPrimaryKey(SRole record);

    List<SRole> selectAll();
}