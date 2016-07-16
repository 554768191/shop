package wl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
@Controller
public class BaseController {
	
	@ExceptionHandler								
	public JSONObject exception(Exception e){
		//打印出异常信息
		System.out.println(e.getMessage());
		e.printStackTrace();
		JSONObject obj = new JSONObject();
		obj.put("exception","数据异常");
		return obj;
	}
	
	/**
	 * 请求异常
	 * @return
	 * @throws Exception
	 * String
	 */
	@RequestMapping(value = "/error_404")
	@ResponseBody
	public JSONObject error_404() throws Exception { 
		 JSONObject obj = new JSONObject();
		 obj.put("error", "找不到页面");
		 obj.put("code", "1000001");
		 return obj;
	}
	/**
	 * 请求参数异常
	 * @return
	 * @throws Exception
	 * String
	 */
	@RequestMapping(value = "/error_400")
	@ResponseBody
	public JSONObject error_400() throws Exception { 
		 JSONObject obj = new JSONObject();
		 obj.put("error", "请求参数异常");
		 obj.put("code", "1000002");
		 return obj;
	}
	
	/**
	 * 服务器异常
	 * @return
	 * String
	 */
	@RequestMapping(value ="/error_500")
	@ResponseBody
	public JSONObject error_500() {		
		JSONObject obj = new JSONObject();
		 obj.put("error", "服务器处理失败");
		 obj.put("code", "1000003");
		 return obj;
	}
	
}
