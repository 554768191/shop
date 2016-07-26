package wl.service;
import com.alibaba.fastjson.JSONObject;


public interface ISBossService {
	public JSONObject addOneBoss(String name,String phone,String email,
			String tel,String address);
	
	public JSONObject getNewCode();
	
	public JSONObject saveCode(String code,int style);
	
	public JSONObject checkCode(String code);
	
	public JSONObject getContactTel();
}
