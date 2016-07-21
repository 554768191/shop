package wl.service;

import com.alibaba.fastjson.JSONObject;

public interface ISServiceService {
	public JSONObject addOneService(String name,String price,String serviceTime,String tcStyle,
			String royaltyAmount,String about,int sShopId);
	
	public JSONObject MyServiceList(int sShopId);
	
	public JSONObject serviceDetil(int id);
}
