package wl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import wl.service.ISRoleService;

@Controller
@RequestMapping("/srole")
public class SRoleController extends BaseController{
	@Resource
	private ISRoleService roleService;
	
	@RequestMapping(value = "/getAll" , method = RequestMethod.GET)
	@ResponseBody
	public JSONObject getAll(){
		return this.roleService.getAllRole();
	}
}
