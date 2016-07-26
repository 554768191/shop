package wl.service;

import java.text.ParseException;

import com.alibaba.fastjson.JSONObject;

public interface ISUserApplyService {
	public JSONObject addOneUserApply(int sUserId,String reason,String qjStartendtime,
			String sApplyType,String oldWorktime,String newWorktime,
			String hbStartendtime,String hbUserId,int sShopId) throws ParseException;
	
	public JSONObject userApplyList(int sUserId,int sShopId,String sApplyType);

	public JSONObject getOneApply(int sApplyId);
	
	public JSONObject getShopUserApply(int sShopId);
}
