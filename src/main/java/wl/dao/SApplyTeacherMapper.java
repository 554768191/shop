package wl.dao;

import java.util.List;

import wl.pojo.SApplyTeacher;

public interface SApplyTeacherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SApplyTeacher record);

    int insertSelective(SApplyTeacher record);

    SApplyTeacher selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SApplyTeacher record);

    int updateByPrimaryKey(SApplyTeacher record);

	List<SApplyTeacher> selectByShopId(int sShopId);
}