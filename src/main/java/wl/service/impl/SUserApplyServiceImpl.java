package wl.service.impl;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SShopMapper;
import wl.dao.SUserApplyMapper;
import wl.dao.SUserMapper;
import wl.pojo.SShop;
import wl.pojo.SUser;
import wl.pojo.SUserApply;
import wl.service.ISUserApplyService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
import wl.tools.DateUtil;
@Service("sUserApply")
public class SUserApplyServiceImpl implements ISUserApplyService {
	@Resource
	private SUserMapper userDao;
	@Resource
	private SShopMapper shopDao;
	@Resource
	private SUserApplyMapper userApplyDao;
	@Override
	public JSONObject addOneUserApply(int sUserId, String reason,
			String qjStartendtime, String sApplyType, String oldWorktime,
			String newWorktime, String hbStartendtime, String hbUserId, int sShopId) throws ParseException {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sUserId) && !Assert.isNullOrEmpty(reason) && !Assert.isNullOrEmpty(sApplyType) && !Assert.isNullOrEmpty(sShopId)){
			SUser user = this.userDao.selectByPrimaryKey(sUserId);
			SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
			if(!Assert.isNullOrEmpty(user) && !Assert.isNullOrEmpty(shop) && !Assert.isNullOrEmpty(sApplyType)){
				SUserApply userApply = new SUserApply();
				if(sApplyType.equals(BaseInfo.getInfo("APPLY_TYPE_QJ"))){
					if(!Assert.isNullOrEmpty(qjStartendtime)){
						userApply.setQjStartendtime(qjStartendtime);
					}else{
						obj.put("error", BaseInfo.getInfo("ERROR_FF"));
						return obj;
					}
				}else if(sApplyType.equals(BaseInfo.getInfo("APPLY_TYPE_TX"))){
					if(!Assert.isNullOrEmpty(oldWorktime) && !Assert.isNullOrEmpty(newWorktime)){
						userApply.setOldWorktime(DateUtil.parse(oldWorktime));
						userApply.setNewWorktime(DateUtil.parse(newWorktime));
					}else{
						obj.put("error", BaseInfo.getInfo("ERROR_FF"));
						return obj;
					}	
				}else{
					if(!Assert.isNullOrEmpty(hbStartendtime) && !Assert.isNullOrEmpty(hbUserId)){
						SUser hbuser = this.userDao.selectByPrimaryKey(Integer.parseInt(hbUserId));
						if(!Assert.isNullOrEmpty(hbuser)){
							userApply.setHbStartendtime(hbStartendtime);
						}else{
							obj.put("error", BaseInfo.getInfo("ERROR_FF"));
							return obj;
						}
					}else{
						obj.put("error", BaseInfo.getInfo("ERROR_FF"));
						return obj;
					}
				}
				userApply.setsUserId(sUserId);
				userApply.setsUserName(user.getName());
				userApply.setReason(reason);
				userApply.setsShopId(sShopId);
				userApply.setsApplyType(sApplyType);
				userApply.setIsPass(0);
				this.userApplyDao.insertSelective(userApply);
				obj.put("success", sApplyType+BaseInfo.getInfo("SUCCESS_APPLY"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject userApplyList(int sUserId, int sShopId,String sApplyType) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sUserId) && !Assert.isNullOrEmpty(sShopId) && !Assert.isNullOrEmpty(sApplyType)){
			SUser user = this.userDao.selectByPrimaryKey(sUserId);
			SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
			if(!Assert.isNullOrEmpty(user) && !Assert.isNullOrEmpty(shop)){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("sUserId", sUserId);
				map.put("sShopId", sShopId);
				map.put("sApplyType", sApplyType);
				List<SUserApply> applyList = this.userApplyDao.selectByUserIdAndShopId(map);
				obj.put("applyList", applyList);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject getOneApply(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SUserApply userApply = this.userApplyDao.selectByPrimaryKey(id);
			obj.put("userApply", userApply);
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject getShopUserApply(int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sShopId)){
			List<SUserApply> userApplyList = this.userApplyDao.selectByShopId(sShopId);
			obj.put("userApplyList", userApplyList);
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

}
