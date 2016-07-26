package wl.dao;


import java.util.List;

import wl.pojo.SService;

public interface SServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SService record);

    int insertSelective(SService record);

    SService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SService record);

    int updateByPrimaryKey(SService record);

	List<SService> selectByShopId(int sShopId);

}