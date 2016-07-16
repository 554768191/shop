package wl.service;

import com.alibaba.fastjson.JSONObject;

public interface ISShopService {
	public JSONObject addOneShop(String name,int sBossId,String dq);
	
	public JSONObject getShopByDq(String dq);
	
	public JSONObject myShopList(int sBossId);
	
	public JSONObject myShopDetail(int id);
}
