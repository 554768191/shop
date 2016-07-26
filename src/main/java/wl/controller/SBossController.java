package wl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import wl.service.ISBossService;

import com.alibaba.fastjson.JSONObject;
@Controller
@RequestMapping("/sboss")
public class SBossController extends BaseController {
	@Resource
	private ISBossService bossService;
	
	/**
	 * @Description: 新增老板
	 * @param name		老板姓名
	 * @param phone		老板电话
	 * @param email		老板邮箱
	 * @param tel		老板电话tel为登录帐号
	 * @param address	老板地址
	 * @return
	 */
	@RequestMapping(value = "/addOneBoss",method = RequestMethod.POST)
	@ResponseBody
	public JSONObject addOneBoss(String name,String phone,String email,
			String tel,String address){
		return this.bossService.addOneBoss(name, phone, email, tel, address);
	}
	
	/**
	 * @Description: 获得邀请码
	 * @return
	 */
	@RequestMapping(value = "/getNewCode",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getNewCode(){
		return this.bossService.getNewCode();
	}
	
	/**
	 * @Description: 把邀请码跟店面类型插入到数据库中
	 * @param code
	 * @param style
	 * @return
	 */
	@RequestMapping(value = "/addOneCode",method = RequestMethod.POST)
	@ResponseBody
	public JSONObject saveCode(String code,@RequestParam("style")int style){
		return this.bossService.saveCode(code,style);
	}
	
	/**
	 * @Description: 检测邀请码是否使用过，如果没有使用把状态改成使用
	 * @param code
	 * @return
	 */
	@RequestMapping(value = "/checkCode",method = RequestMethod.POST)
	@ResponseBody
	public JSONObject checkCode(String code){
		return this.bossService.checkCode(code);
	}
	
	/**
	 * @Description: 获得管理员联系方式
	 * @return
	 */
	@RequestMapping(value = "/getContactTel",method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getContactTel(){
		return this.bossService.getContactTel();
	}
}
