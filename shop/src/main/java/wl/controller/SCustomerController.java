package wl.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import wl.service.ISCustomerService;
@Controller
@RequestMapping("/scustomer")
public class SCustomerController{
	@Resource
	private ISCustomerService customerService;
	
	@RequestMapping(value = "/addOneCustomer", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject addOneCustomer(String name, String sex, int sMemberId,
			int sShopId, int sUserId) {
		// TODO Auto-generated method stub
		return this.customerService.addOneCustomer(name, sex, sMemberId, sShopId, sUserId);
	}
	
	@RequestMapping(value = "/customerList", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject customerList(int sShopId) {
		// TODO Auto-generated method stub
		return this.customerService.customerList(sShopId);
	}
	
	@RequestMapping(value = "/customerDetail", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject customerDetail(int id) {
		// TODO Auto-generated method stub
		return this.customerService.customerDetail(id);
	}

}
