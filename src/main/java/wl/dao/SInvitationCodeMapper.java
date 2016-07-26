package wl.dao;

import java.util.List;
import java.util.Map;

import wl.pojo.SInvitationCode;

public interface SInvitationCodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SInvitationCode record);

    int insertSelective(SInvitationCode record);

    SInvitationCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SInvitationCode record);

    int updateByPrimaryKey(SInvitationCode record);
    
    List<SInvitationCode> selectByCode(Map<String, Object> map);
}