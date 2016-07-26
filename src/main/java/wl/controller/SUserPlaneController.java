package wl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import wl.service.ISUserPlaneService;

@Controller
@RequestMapping("/userPlane")
public class SUserPlaneController extends BaseController{
	@Resource
	private ISUserPlaneService userPlaneService;
	
	@RequestMapping(value = "/addOnePlane",method = RequestMethod.POST)
	@ResponseBody
	public JSONObject addOnePlane(@RequestParam("sUserId")int sUserId, @RequestParam("sShopId")int sShopId, String title,
			String completeCycle, String startandendtime, String about){
		return this.userPlaneService.addOnePlane(sUserId, sShopId, title, completeCycle, startandendtime, about);
	}
	
	@RequestMapping(value = "/userPlaneList",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject userPlaneList(@RequestParam("sUserId")int sUserId, @RequestParam("sShopId")int sShopId){
		return this.userPlaneService.userPlaneList(sUserId, sShopId);
	}
	
	@RequestMapping(value = "/showOnePlane",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject showOnePlane(@RequestParam("id")int id){
		return this.userPlaneService.showOnePlane(id);
	}
}
