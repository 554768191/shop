package wl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SRoleMapper;
import wl.pojo.SRole;
import wl.service.ISRoleService;
@Service("srole")
public class SRoleServiceImpl implements ISRoleService {
	@Resource
	private SRoleMapper sroleDao;
	@Override
	public JSONObject getAllRole() {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		List<SRole> rolelist = this.sroleDao.selectAll();
		obj.put("srolelist", rolelist);
		return obj;
	}

}
