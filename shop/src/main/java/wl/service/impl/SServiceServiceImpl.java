package wl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SServiceMapper;
import wl.dao.SShopMapper;
import wl.pojo.SService;
import wl.pojo.SShop;
import wl.service.ISServiceService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
import wl.tools.GetCode;
@Service("sservice")
public class SServiceServiceImpl implements ISServiceService{
	@Resource
	private SShopMapper shopDao;
	@Resource
	private SServiceMapper serviceDao;
	@Override
	public JSONObject addOneService(String name, String price,
			String serviceTime, String tcStyle, String royaltyAmount,
			String about, int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(name) && !Assert.isNullOrEmpty(price) && !Assert.isNullOrEmpty(serviceTime) &&
				!Assert.isNullOrEmpty(tcStyle) && !Assert.isNullOrEmpty(about) && !Assert.isNullOrEmpty(sShopId)){
			SShop shop = this.shopDao.selectByPrimaryKey(sShopId);
			if(!Assert.isNullOrEmpty(shop)){
				SService service = new SService();
				service.setCode(GetCode.getCode());
				service.setName(name);
				service.setPrice(price);
				service.setServiceTime(serviceTime);
				service.setTcStyle(tcStyle);
				service.setRoyaltyAmount(royaltyAmount);
				service.setAbout(about);
				service.setsShopId(sShopId);
				this.serviceDao.insertSelective(service);
				obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_SERVICE"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject MyServiceList(int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sShopId)){
			List<SService> serviceList = this.serviceDao.selectByShopId(sShopId);
			obj.put("serviceList", serviceList);
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject serviceDetil(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SService service = this.serviceDao.selectByPrimaryKey(id);
			if(!Assert.isNullOrEmpty(service)){
				obj.put("service", service);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

}
