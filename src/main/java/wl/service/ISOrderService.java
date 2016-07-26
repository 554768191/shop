package wl.service;

import java.util.List;

import wl.pojo.SService;

import com.alibaba.fastjson.JSONObject;

public interface ISOrderService {
	//新增一条订单
	public JSONObject addOneOrder(int SUserId,String address,String startendtime,
			String name,String tel,String money,int SShopId,List<SService> serviceList);
	
	//当前店面所有订单
	public JSONObject OrderListAll(int SShopId);
	
	//店面的详细信息
	public JSONObject OrderDetile(int id);
	
}
