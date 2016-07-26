package wl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import wl.service.ISApplyService;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/sapply")
public class SApplyController extends BaseController {
	@Resource
	private ISApplyService applyService;
	
	/**
	 * @Description: 新增专家指导申请
	 * @param sShopId   店面id
	 * @param sBossId	老板id
	 * @param reason	申请原因
	 * @param count		申请专家的数量
	 * @return
	 */
	@RequestMapping(value = "/addOneTeacherApply", method =RequestMethod.POST )
	@ResponseBody
	public JSONObject addOneTeacherApply(@RequestParam("sShopId")int sShopId,@RequestParam("sBossId")int sBossId,String reason,
			String count){
		return this.applyService.addOneTeacherApply(sShopId, sBossId, reason, count);
	}
	
	/**
	 * @Description: 新增报名培训申请
	 * @param sShopId	店面ID
	 * @param sBossId	老板ID
	 * @param theme		申请主题
	 * @param count		申请学员数量
	 * @return
	 */
	@RequestMapping(value = "/addOneTrainApply", method =RequestMethod.POST )
	@ResponseBody
	public JSONObject addOneTrainApply(@RequestParam("sShopId")int sShopId,@RequestParam("sBossId")int sBossId,String theme,
			String count){
		return this.applyService.addOneTrainApply(sShopId, sBossId, theme, count);
	}
	
	/**
	 * @Description: 当前店面所有的专家指导申请
	 * @param sShopId	当前店面ID
	 * @return
	 */
	@RequestMapping(value = "/myTeacherApplyList", method =RequestMethod.GET )
	@ResponseBody
	public JSONObject myTeacherApplyList(@RequestParam("sShopId")int sShopId){
		return this.applyService.myTeacherApply(sShopId);
	}
	
	/**
	 * @Description: 当前店面所有的学员培训申请
	 * @param sShopId
	 * @return
	 */
	@RequestMapping(value = "/myTrainApplyList", method =RequestMethod.GET )
	@ResponseBody
	public JSONObject myTrainApplyList(@RequestParam("sShopId")int sShopId){
		return this.applyService.myTrainApply(sShopId);
	}
	
	/**
	 * @Description: 专家指导申请的详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/myTeacherApplyDetil", method =RequestMethod.GET )
	@ResponseBody
	public JSONObject myTeacherApplyDetil(@RequestParam("id")int id){
		return this.applyService.myTeacherApplyDetil(id);
	}
	
	
	/**
	 * @Description: 学员培训申请详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/myTrainApplyDetil", method =RequestMethod.GET )
	@ResponseBody
	public JSONObject myTrainApplyDetil(@RequestParam("id")int id){
		return this.applyService.myTrainApplyDetil(id);
	}
}
