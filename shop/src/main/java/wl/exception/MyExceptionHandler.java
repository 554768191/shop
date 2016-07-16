package wl.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class MyExceptionHandler implements HandlerExceptionResolver {
	private static Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);
	@Override
	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3) {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		arg1.setStatus(HttpStatus.OK.value()); //设置状态码  
		arg1.setContentType(MediaType.APPLICATION_JSON_VALUE); //设置ContentType  
		arg1.setCharacterEncoding("UTF-8"); //避免乱码  
		arg1.setHeader("Cache-Control", "no-cache, must-revalidate");  
        try {  
        	arg1.getWriter().write("{\"error\":\"连接服务器失败\",\"code\":\"1000000\"}");  
        } catch (IOException e) {  
        	logger.error("与客户端通讯异常:"+ e.getMessage(), e);  
        }  

        logger.debug("异常:" + arg3.getMessage(), arg3);
        return mv;
	}

}
