package wl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import wl.service.ISUserService;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/suser")
public class SUserController extends BaseController{
	@Resource
	private ISUserService userService;
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject regist(String name, String password, @RequestParam("sShopId")int sShopId,
			@RequestParam("sRoleId")int sRoleId, String tel, String selftel, String emergencyTel,
			String sex){
		return this.userService.regist(name, password, sShopId, sRoleId, tel, selftel, emergencyTel, sex);
	}
	
	@RequestMapping(value = "/isDuplicateTel", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject isDuplicateTel(String tel){
		JSONObject obj = new JSONObject();
		String result = "";
		if(this.userService.isDuplicateTel(tel)){
			result = "true";
		}else{
			result = "false";
		}
		obj.put("isDuplicateTel",result);
		return obj;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject login(String tel,String password){
		return this.userService.checkLogin(tel, password);
	}
	
	@RequestMapping(value = "/getShopUser", method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getShopUser(@RequestParam("sShopId")int sShopId){
		return this.userService.shopUserList(sShopId);
	}
	
	@RequestMapping(value = "/modifyPassword", method = RequestMethod.POST)
	@ResponseBody
	public JSONObject modifyPassword(String tel,String password){
		return this.userService.modifyPassword(tel,password);
	}
}
