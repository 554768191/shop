package wl.service;

import com.alibaba.fastjson.JSONObject;

public interface ISCustomerChildrenService {
	//新增一条孩子数据
	public JSONObject addOneChildren(String name,String birthday,int sCustomerId,String isSc,String weeks,
			String isFullterm,String isYuntu,String isRenshen);
	
	//根据客户ID获得该客户所有的孩子列表
	public JSONObject getChildrenList(int sCustomerId);
	
	//显示客户孩子的详细信息
	public JSONObject showOneChildren(int id);
}
