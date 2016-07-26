package wl.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import wl.pojo.SService;
import wl.service.ISOrderService;

/**
 * @author wangl
 * @date:日期:2016年7月20日 时间:下午3:43:39
 * @description:TODO
 * @version 1.0
 */
@Controller
@RequestMapping("/sorder")
public class SOrderController extends BaseController {
	@Resource
	private ISOrderService orderService;
	
	/**
	 * @Description: 新增一条订单
	 * @param SUserId		指派的员工Id
	 * @param address		服务地址
	 * @param startendtime	开始结束时间
	 * @param name			服务客户名字
	 * @param tel			客户手机号码
	 * @param money			本单金额
	 * @param SShopId		店面ID
	 * @param serviceList	服务的列表
	 * @return
	 */
	@RequestMapping(value = "/addOneOrder", method = RequestMethod.POST)
    @ResponseBody
	public JSONObject addOneOrder(@RequestParam("SUserId")int SUserId,String address,String startendtime,
			String name,String tel,String money,@RequestParam("SShopId")int SShopId,@RequestParam("serviceList[]")List<SService> serviceList){
		return this.orderService.addOneOrder(SUserId, address, startendtime, name, tel, money, SShopId, serviceList);
	}
	
	/**
	 * @Description: 当前店面的所有订单列表
	 * @param SShopId	当前店面的SShopId
	 * @return
	 */
	@RequestMapping(value = "/OrderListAll", method = RequestMethod.GET)
    @ResponseBody
	public JSONObject OrderListAll(int SShopId){
		return this.orderService.OrderListAll(SShopId);
	}
	
	
	/**
	 * @Description: 订单详细信息
	 * @param id     订单id
	 * @return
	 */
	@RequestMapping(value = "/OrderDetile", method = RequestMethod.GET)
    @ResponseBody
	public JSONObject OrderDetile(int id){
		return this.orderService.OrderDetile(id);
	}
}
