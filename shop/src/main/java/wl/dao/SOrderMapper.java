package wl.dao;

import java.util.List;
import java.util.Map;

import wl.pojo.SOrder;

public interface SOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SOrder record);

    int insertSelective(SOrder record);

    SOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SOrder record);

    int updateByPrimaryKey(SOrder record);

	int insertMap(Map<String, Object> map);

	List<SOrder> selectByShopId(int sShopId);
}