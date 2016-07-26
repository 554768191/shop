package wl.dao;

import java.util.List;
import java.util.Map;

import wl.pojo.SUserPlane;

public interface SUserPlaneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SUserPlane record);

    int insertSelective(SUserPlane record);

    SUserPlane selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SUserPlane record);

    int updateByPrimaryKey(SUserPlane record);

	List<SUserPlane> selectUserPlaneList(Map<String, Object> map);
}