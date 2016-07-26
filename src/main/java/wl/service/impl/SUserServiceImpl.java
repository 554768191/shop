package wl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SBossMapper;
import wl.dao.SRoleMapper;
import wl.dao.SShopMapper;
import wl.dao.SUserMapper;
import wl.pojo.SBoss;
import wl.pojo.SRole;
import wl.pojo.SShop;
import wl.pojo.SUser;
import wl.service.ISUserService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
import wl.tools.GetCode;
import wl.tools.MD5Util;
@Service("suser")
public class SUserServiceImpl implements ISUserService {
	@Resource
	private SUserMapper suserDao;
	@Resource
	private SRoleMapper sroleDao;
	@Resource
	private SShopMapper sshopDao;
	@Resource
	private SBossMapper sbossDao;
	@Override
	public JSONObject checkLogin(String tel, String password) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(tel) && !Assert.isNullOrEmpty(password)){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("tel", tel);
			map.put("password", MD5Util.MD5(password));
			List<SUser> userlist = this.suserDao.selectByTelAndPass(map);
			List<SBoss> bosslist = this.sbossDao.selectByTelAndPassword(map);
			if(userlist.size()>0 || bosslist.size()>0){
				if(userlist.size()>0){
					map.put("user",userlist.get(0));
				}else{
					map.put("user",new SUser());
				}
				if(bosslist.size()>0){
					map.put("boss",bosslist.get(0));
				}else{
					map.put("boss",new SBoss());
				}
				obj.put("resultUser", map);
				obj.put("success", BaseInfo.getInfo("SUCCESS_LOGIN"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_TEL_PASSWORD"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject regist(String name, String password, int sShopId,
			int sRoleId, String tel, String selftel, String emergencyTel,
			String sex) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(name) && !Assert.isNullOrEmpty(password) && !Assert.isNullOrEmpty(sShopId) && !Assert.isNullOrEmpty(sRoleId) && 
			!Assert.isNullOrEmpty(tel) && !Assert.isNullOrEmpty(selftel) && !Assert.isNullOrEmpty(emergencyTel) && !Assert.isNullOrEmpty(sex)){
			SShop shop = this.sshopDao.selectByPrimaryKey(sShopId);
			SRole role = this.sroleDao.selectByPrimaryKey(sRoleId);
			if(!isDuplicateTel(tel)){
				if(!Assert.isNullOrEmpty(shop) && !Assert.isNullOrEmpty(role)){
					SUser user = new SUser();
					user.setCode(GetCode.getCode());
					user.setName(name);
					user.setsShopId(sShopId);
					user.setPassword(MD5Util.MD5(password));
					user.setsShopName(shop.getName());
					user.setsRoleId(sRoleId);
					user.setsRoleName(role.getName());
					user.setTel(tel);
					user.setSelftel(selftel);
					user.setEmergencyTel(emergencyTel);
					user.setSex(sex);
					this.suserDao.insertSelective(user);
					obj.put("success", BaseInfo.getInfo("SUCCESS_REGIST"));
				}else{
					obj.put("error", BaseInfo.getInfo("ERROR_FF"));
				}
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_TEL_ISHAVE"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}
	
	//根据手机号或者用户名验证是否存在这些数据
	public boolean isDuplicateTel(String tel) {
		// TODO Auto-generated method stub
		List<SUser> userlist = this.suserDao.getUserByTel(tel);
		if (userlist.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public JSONObject shopUserList(int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sShopId)){
			List<SUser> userList = this.suserDao.selectBySShopId(sShopId);
			obj.put("userList", userList);
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject modifyPassword(String tel, String Password) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(tel) && !Assert.isNullOrEmpty(Password)){
			List<SUser> userlist = this.suserDao.getUserByTel(tel);
			if(tel.length()>0){
				SUser user = userlist.get(0);
				user.setPassword(MD5Util.MD5(Password));
				this.suserDao.updateByPrimaryKeySelective(user);
				obj.put("success", BaseInfo.getInfo("SUCCESS_MODIFY_PASSWORD"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_TEL_ISHAVE"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}
}
