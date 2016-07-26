package wl.dao;

import wl.pojo.SCustomerChildren;

public interface SCustomerChildrenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SCustomerChildren record);

    int insertSelective(SCustomerChildren record);

    SCustomerChildren selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SCustomerChildren record);

    int updateByPrimaryKey(SCustomerChildren record);
}