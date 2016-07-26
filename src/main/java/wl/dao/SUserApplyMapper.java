package wl.dao;

import java.util.List;
import java.util.Map;

import wl.pojo.SUserApply;

public interface SUserApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SUserApply record);

    int insertSelective(SUserApply record);

    SUserApply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SUserApply record);

    int updateByPrimaryKey(SUserApply record);

	List<SUserApply> selectByUserIdAndShopId(Map<String, Object> map);
	
	List<SUserApply> selectByShopId(int sShopId);
}