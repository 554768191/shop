package wl.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SBossMapper;
import wl.dao.SInvitationCodeMapper;
import wl.pojo.SBoss;
import wl.pojo.SInvitationCode;
import wl.service.ISBossService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
import wl.tools.GetCode;
import wl.tools.MD5Util;
@Service("bossService")
public class BossServiceImpl implements ISBossService {
	@Resource
	private SBossMapper bossDao;
	@Resource
	private SInvitationCodeMapper codeDao;
	@Override
	public JSONObject addOneBoss(String name, String phone, String email,
			String tel, String address) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(name) && !Assert.isNullOrEmpty(tel)){
			SBoss boss = new SBoss();
			boss.setCode(GetCode.getCode());
			boss.setPassword(MD5Util.MD5("123456"));
			boss.setName(name);
			boss.setTel(tel);
			boss.setPhone(phone);
			boss.setEmail(email);
			boss.setAddress(address);
			this.bossDao.insertSelective(boss);
			obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_BOSS"));
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject getNewCode() {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		obj.put("code", BaseInfo.getCharAndNumr(6));
		return obj;
	}
	
	public JSONObject saveCode(String code,int style){
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(code) && !Assert.isNullOrEmpty(style)){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("code", code);
			List<SInvitationCode> codelist = this.codeDao.selectByCode(map);
			if(codelist.size()>0){
				obj.put("error", BaseInfo.getInfo("ERROR_CODE_EXIST"));
			}else{
				SInvitationCode shopcode = new SInvitationCode();
				shopcode.setCode(code);
				shopcode.setIsUse(0);
				shopcode.setStyle(style);
				this.codeDao.insertSelective(shopcode);
				obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_CODE"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject checkCode(String code) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(code)){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("code", code);
			map.put("isUse", 0);
			List<SInvitationCode> codelist = this.codeDao.selectByCode(map);
			if(codelist.size()>0){
				SInvitationCode ycode = codelist.get(0);
				ycode.setIsUse(1);
				this.codeDao.updateByPrimaryKeySelective(ycode);
				obj.put("style", ycode.getStyle());
				obj.put("success", BaseInfo.getInfo("SUCCESS_USE_CODE"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_NO_CODE"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject getContactTel() {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		obj.put("contactName", BaseInfo.getInfo("CONTACT_NAME"));
		obj.put("contactTel", BaseInfo.getInfo("CONTACT_TEL"));
		return obj;
	}

}
