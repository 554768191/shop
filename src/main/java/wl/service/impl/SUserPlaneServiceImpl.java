package wl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SShopMapper;
import wl.dao.SUserMapper;
import wl.dao.SUserPlaneMapper;
import wl.pojo.SShop;
import wl.pojo.SUser;
import wl.pojo.SUserPlane;
import wl.service.ISUserPlaneService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
@Service("suserplane")
public class SUserPlaneServiceImpl implements ISUserPlaneService {
	@Resource
	private SUserMapper userDao;
	@Resource
	private SShopMapper shopDao;
	@Resource
	private SUserPlaneMapper userPlaneDao;
	@Override
	public JSONObject addOnePlane(int sUserId, int sShopId, String title,
			String completeCycle, String startandendtime, String about) {
		// TODO Auto-generated method stub7
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sUserId) && !Assert.isNullOrEmpty(sShopId) && !Assert.isNullOrEmpty(title)
				&& !Assert.isNullOrEmpty(completeCycle) && !Assert.isNullOrEmpty(startandendtime)
				&& !Assert.isNullOrEmpty(about)){
			SUser user = this.userDao.selectByPrimaryKey(sUserId);
			SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
			if(!Assert.isNullOrEmpty(user) && !Assert.isNullOrEmpty(shop)){
				SUserPlane userPlane = new SUserPlane();
				userPlane.setsUserId(sUserId);
				userPlane.setsUserName(user.getName());
				userPlane.setTitle(title);
				userPlane.setCompleteCycle(completeCycle);
				userPlane.setStartandendtime(startandendtime);
				userPlane.setAbout(about);
				userPlane.setShopId(sShopId);
				this.userPlaneDao.insertSelective(userPlane);
				obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_PLANE"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject userPlaneList(int sUserId, int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sUserId) && !Assert.isNullOrEmpty(sShopId)){
			SUser user = this.userDao.selectByPrimaryKey(sUserId);
			SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
			if(!Assert.isNullOrEmpty(user) && !Assert.isNullOrEmpty(shop)){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("sUserId", sUserId);
				map.put("shopId", sShopId);
				List<SUserPlane> userPlaneList = this.userPlaneDao.selectUserPlaneList(map);
				obj.put("userPlaneList", userPlaneList);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject showOnePlane(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SUserPlane userPlane = this.userPlaneDao.selectByPrimaryKey(id);
			if(!Assert.isNullOrEmpty(userPlane)){
				obj.put("userPlane", userPlane);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

}
