package wl.controller;

import java.text.ParseException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import wl.service.ISUserApplyService;

@Controller
@RequestMapping("/userApply")
public class SUserApplyController extends BaseController{
	@Resource
	private ISUserApplyService userApplyService;
	
	@RequestMapping(value = "/addOneUserApply",method = RequestMethod.POST)
	@ResponseBody
	public JSONObject addOneUserApply(@RequestParam("sUserId")int sUserId,String reason,String qjStartendtime,
			String sApplyType,String oldWorktime,String newWorktime,
			String hbStartendtime,String hbUserId,@RequestParam("sShopId")int sShopId) throws ParseException{
		return this.userApplyService.addOneUserApply(sUserId, reason, qjStartendtime, sApplyType, oldWorktime, newWorktime, hbStartendtime, hbUserId, sShopId);
	}
	
	@RequestMapping(value = "/userApplyList",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject userApplyList(@RequestParam("sUserId")int sUserId,@RequestParam("sShopId")int sShopId,String sApplyType){
		return this.userApplyService.userApplyList(sUserId, sShopId, sApplyType);
	}
	
	@RequestMapping(value = "/getOneApply",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getOneApply(@RequestParam("id")int id){
		return this.userApplyService.getOneApply(id);
	}
	
	@RequestMapping(value = "/getShopUserApply",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getShopUserApply(@RequestParam("sShopId")int sShopId){
		return this.userApplyService.getShopUserApply(sShopId);
	}
}
