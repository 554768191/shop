package wl.service;

import com.alibaba.fastjson.JSONObject;

public interface ISUserPlaneService {
	
	public JSONObject addOnePlane(int sUserId,int sShopId,String title,String completeCycle,String startandendtime,String about);
	
	public JSONObject userPlaneList(int sUserId,int sShopId);
	
	public JSONObject showOnePlane(int id);
}
