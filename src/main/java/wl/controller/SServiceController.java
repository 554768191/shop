package wl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import wl.service.ISServiceService;

import com.alibaba.fastjson.JSONObject;
@Controller
@RequestMapping("/sService")
public class SServiceController extends BaseController {
	
	@Resource
	private ISServiceService serviceService;
	
	/**
	 * @Description: 新增一条服务
	 * @param name			服务名称
	 * @param price			服务价格
	 * @param serviceTime	服务时间
	 * @param tcStyle		提成类型
	 * @param royaltyAmount	提成额度
	 * @param about			服务简介
	 * @param sShopId		店面ID
	 * @return
	 */
	@RequestMapping(value = "/addOneService", method = RequestMethod.POST)
    @ResponseBody
	public JSONObject addOneService(String name,String price,String serviceTime,String tcStyle,
			String royaltyAmount,String about,@RequestParam("sShopId")int sShopId){
		return this.serviceService.addOneService(name, price, serviceTime, tcStyle, royaltyAmount, about, sShopId);
	}
	
	/**
	 * @Description: 当前店面的列表LIST
	 * @param sShopId	当前店面的ID
	 * @return
	 */
	@RequestMapping(value = "/MyServiceList", method = RequestMethod.GET)
    @ResponseBody
	public JSONObject MyServiceList(int sShopId){
		return this.serviceService.MyServiceList(sShopId);
	}
	
	/**
	 * @Description: 显示服务详细信息
	 * @param id     服务ID
	 * @return
	 */
	@RequestMapping(value = "/serviceDetil", method = RequestMethod.GET)
    @ResponseBody
	public JSONObject serviceDetil(int id){
		return this.serviceService.serviceDetil(id);
	}
}
