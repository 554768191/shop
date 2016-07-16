package wl.dao;

import java.util.List;
import java.util.Map;

import wl.pojo.SUser;

public interface SUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);

	List<SUser> getUserByTel(String tel);

	List<SUser> selectByTelAndPass(Map<String,Object> map);

	List<SUser> selectBySShopId(int sShopId);
}