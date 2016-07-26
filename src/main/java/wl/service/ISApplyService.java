package wl.service;

import com.alibaba.fastjson.JSONObject;

public interface ISApplyService {
	public JSONObject addOneTeacherApply(int sShopId,int sBossId,String reason,
			String count);
	
	public JSONObject addOneTrainApply(int sShopId,int sBossId,String theme,
			String count);
	
	public JSONObject myTeacherApply(int sShopId);
	
	public JSONObject myTrainApply(int sShopId);
	
	public JSONObject myTeacherApplyDetil(int id);
	
	public JSONObject myTrainApplyDetil(int id);
}
