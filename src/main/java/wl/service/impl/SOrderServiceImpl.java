package wl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SOrderMapper;
import wl.dao.SServiceMapper;
import wl.dao.SShopMapper;
import wl.dao.SUserMapper;
import wl.pojo.SOrder;
import wl.pojo.SService;
import wl.pojo.SShop;
import wl.pojo.SUser;
import wl.service.ISOrderService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
import wl.tools.GetCode;
@Service("orderService")
public class SOrderServiceImpl implements ISOrderService {
	@Resource
	private SUserMapper userDao;
	@Resource
	private SShopMapper shopDao;
	@Resource
	private SServiceMapper serviceDao;
	@Resource
	private SOrderMapper orderDao;
	@Override
	public JSONObject addOneOrder(int SUserId, String address,
			String startendtime, String name, String tel, String money,
			int SShopId, List<SService> serviceList) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(SUserId) && !Assert.isNullOrEmpty(address) && !Assert.isNullOrEmpty(startendtime) &&
				!Assert.isNullOrEmpty(name) && !Assert.isNullOrEmpty(tel) && !Assert.isNullOrEmpty(money) && !Assert.isNullOrEmpty(SShopId)
				&& !Assert.isNullOrEmpty(serviceList)){
			SUser user = this.userDao.selectByPrimaryKey(SUserId);
			SShop shop = this.shopDao.selectByPrimaryKey(SShopId);
			if(!Assert.isNullOrEmpty(user) && !Assert.isNullOrEmpty(shop) && !Assert.isNullOrEmpty(serviceList)){
				SOrder order = new SOrder();
				order.setCode(GetCode.getCode());
				order.setsUserId(SUserId);
				order.setsUserName(user.getName());
				order.setAddress(address);
				order.setStartendtime(startendtime);
				order.setName(name);
				order.setTel(tel);
				order.setMoney(money);
				order.setIsOver(0);
				order.setsShopId(SShopId);
				this.orderDao.insertSelective(order);
				if(serviceList.size()>0){
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("sOrderId", order.getId());
					map.put("serviceList", serviceList);
					this.orderDao.insertMap(map);
				}else{
					obj.put("error", BaseInfo.getInfo("ERROR_FF"));
					return obj;
				}
				obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_ORDER"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
			
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject OrderListAll(int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sShopId)){
			List<SOrder> orderList = this.orderDao.selectByShopId(sShopId);
			if(orderList.size()>0){
				obj.put("orderList",orderList);
			}else{
				obj.put("orderList",BaseInfo.getInfo("ERROR_NOLIST"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject OrderDetile(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SOrder order = this.orderDao.selectByPrimaryKey(id);
			obj.put("order", order);
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

}
