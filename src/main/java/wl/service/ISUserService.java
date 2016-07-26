package wl.service;

import com.alibaba.fastjson.JSONObject;

public interface ISUserService {
	public JSONObject checkLogin(String tel,String password);
	
	public JSONObject regist(String name,String password,int sShopId,int sRoleId,String tel,String selftel,String emergencyTel,String sex);
	
	public boolean isDuplicateTel(String tel);
	
	public JSONObject shopUserList(int sShopId);
	
	public JSONObject modifyPassword(String tel,String Password);
}
