package wl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import wl.dao.SCustomerMapper;
import wl.dao.SMemberMapper;
import wl.dao.SShopMapper;
import wl.dao.SUserMapper;
import wl.pojo.SCustomer;
import wl.pojo.SMember;
import wl.pojo.SShop;
import wl.pojo.SUser;
import wl.service.ISCustomerService;
import wl.tools.Assert;
import wl.tools.BaseInfo;
@Service("scustomer")
public class SCustomerServiceImpl implements ISCustomerService {
	@Resource
	private SCustomerMapper customerDao;
	@Resource
	private SShopMapper shopDao;
	@Resource
	private SMemberMapper memberDao;
	@Resource
	private SUserMapper userDao;
	@Override
	public JSONObject addOneCustomer(String name, String sex,
			int sMemberId, int sShopId , int sUserId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(name) && !Assert.isNullOrEmpty(sex) && !Assert.isNullOrEmpty(sMemberId)
				&& !Assert.isNullOrEmpty(sShopId) && !Assert.isNullOrEmpty(sUserId)){
			SMember member = this.memberDao.selectByPrimaryKey(sMemberId);
			SShop   shop   = this.shopDao.selectByPrimaryKey(sShopId);
			SUser   user   = this.userDao.selectByPrimaryKey(sUserId);
			if(!Assert.isNullOrEmpty(member) && !Assert.isNullOrEmpty(shop) && !Assert.isNullOrEmpty(user)){
				SCustomer customer = new SCustomer();
				customer.setName(name);
				customer.setSex(sex);
				customer.setsMemberId(sMemberId);
				customer.setsMemberName(member.getName());
				customer.setsShopId(sShopId);
				customer.setsUserId(sUserId);
				customer.setsUserName(user.getName());
				this.customerDao.insertSelective(customer);
				obj.put("success", BaseInfo.getInfo("SUCCESS_ADD_CUSTOMER"));
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject customerList(int sShopId) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(sShopId)){
			SShop   shop   = this.shopDao.selectByPrimaryKey(sShopId);
			if(!Assert.isNullOrEmpty(shop)){
				List<SCustomer> customerList = this.customerDao.selectBySShopId(sShopId);
				obj.put("customerList", customerList);
			}else{
				obj.put("error", BaseInfo.getInfo("ERROR_FF"));
			}
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

	@Override
	public JSONObject customerDetail(int id) {
		// TODO Auto-generated method stub
		JSONObject obj = new JSONObject();
		if(!Assert.isNullOrEmpty(id)){
			SCustomer customer = this.customerDao.selectByPrimaryKey(id);
			obj.put("customer", customer);
		}else{
			obj.put("error", BaseInfo.getInfo("ERROR_FF"));
		}
		return obj;
	}

}
