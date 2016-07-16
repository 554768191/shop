package wl.dao;

import java.util.List;

import wl.pojo.SShop;

public interface SShopMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SShop record);

    int insertSelective(SShop record);

    SShop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SShop record);

    int updateByPrimaryKey(SShop record);

	List<SShop> selectShopByDq(String dq);

	List<SShop> getShopByName(String name);

	List<SShop> selectByBossId(int sBossId);
}