package wl.dao;

import java.util.List;

import wl.pojo.SApplyTrain;

public interface SApplyTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SApplyTrain record);

    int insertSelective(SApplyTrain record);

    SApplyTrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SApplyTrain record);

    int updateByPrimaryKey(SApplyTrain record);

	List<SApplyTrain> selectByShopId(int sShopId);
}