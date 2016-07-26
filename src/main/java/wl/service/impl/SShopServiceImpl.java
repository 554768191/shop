package wl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SBossMapper;
import wl.dao.SShopMapper;
import wl.pojo.SBoss;
import wl.pojo.SShop;
import wl.service.ISShopService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
import wl.tools.GetCode;
@Service("sshop")
public class SShopServiceImpl implements ISShopService {
	@Resource
	private SShopMapper sshopDao;
	@Resource
	private SBossMapper sbossDao;
	@Override
	public JSONObject addOneShop(String name, int sBossId, String dq,int style) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(name) && !Assert.isNullOrEmpty(sBossId) && !Assert.isNullOrEmpty(dq) && !Assert.isNullOrEmpty(style)){
			SBoss boss = this.sbossDao.selectByPrimaryKey(sBossId);
			if(!Assert.isNullOrEmpty(boss)){
				if(!isDuplicateName(name)){
					SShop shop = new SShop();
					shop.setName(name);
					shop.setCode(GetCode.getCode());
					shop.setsBossId(sBossId);
					shop.setsBossName(boss.getName());
					shop.setsBossPhone(boss.getPhone());
					shop.setsBossEmail(boss.getEmail());
					shop.setsBossTel(boss.getTel());
					shop.setsBossAddress(boss.getAddress());
					shop.setDq(dq);
					shop.setStyle(style);
					this.sshopDao.insertSelective(shop);
					obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_SHOP"));
				}else{
					obj.put("error", BaseInfo.getInfo("ERROR_ADD_ISHAVE"));
				}
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject getShopByDq(String dq) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(dq)){
			List<SShop> shopList = this.sshopDao.selectShopByDq(dq);
			if(shopList.size()>0){
				obj.put("sshopList", shopList);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_NOLIST"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	public boolean isDuplicateName(String name) {
		// TODO Auto-generated method stub
		List<SShop> userlist = this.sshopDao.getShopByName(name);
		if (userlist.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public JSONObject myShopList(int sBossId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sBossId)){
			List<SShop> myShopList = this.sshopDao.selectByBossId(sBossId);
			obj.put("myShopList", myShopList);
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject myShopDetail(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SShop shop = this.sshopDao.selectByPrimaryKey(id);
			if(!Assert.isNullOrEmpty(shop)){
				obj.put("shop", shop);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}
}
