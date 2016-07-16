package wl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import wl.service.ISShopService;

@Controller
@RequestMapping("/sshop")
public class SShopController extends BaseController{
	@Resource
	private ISShopService shopService;
	
	@RequestMapping(value = "/getShopByDq" , method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getShopByDq(String dq){
		return this.shopService.getShopByDq(dq);
	}
	
	@RequestMapping(value = "/addOneShop" , method = RequestMethod.POST)
	@ResponseBody
	public JSONObject addOneShop(String name, @RequestParam("sBossId")int sBossId, String dq){
		return this.shopService.addOneShop(name,sBossId,dq);
	}
	
	@RequestMapping(value = "/myShopList" , method = RequestMethod.GET)
	@ResponseBody
	public JSONObject myShopList(@RequestParam("sBossId")int sBossId){
		return this.shopService.myShopList(sBossId);
	}
	
	@RequestMapping(value = "/myShopDetail" , method = RequestMethod.GET)
	@ResponseBody
	public JSONObject myShopDetail(@RequestParam("id")int id){
		return this.shopService.myShopDetail(id);
	}
}
