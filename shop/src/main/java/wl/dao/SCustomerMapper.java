package wl.dao;

import java.util.List;

import wl.pojo.SCustomer;

public interface SCustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SCustomer record);

    int insertSelective(SCustomer record);

    SCustomer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SCustomer record);

    int updateByPrimaryKey(SCustomer record);

	List<SCustomer> selectBySShopId(int sShopId);
}