package wl.service;

import com.alibaba.fastjson.JSONObject;

public interface ISCustomerService {
	public JSONObject addOneCustomer(String name,
			String sex,int sMemberId,int sShopId,int sUserId);
	
	public JSONObject customerList(int sShopId);
	
	public JSONObject customerDetail(int id);
	
}
