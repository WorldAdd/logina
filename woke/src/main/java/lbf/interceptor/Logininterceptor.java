package lbf.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import lbf.bean.User;

public class Logininterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest 	request, HttpServletResponse response, Object object, Exception exception)
			throws Exception {
		System.out.println("最后执行！！！一般用于释放资源！！");
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView view)
			throws Exception {
		System.out.println("Action执行之后，生成视图之前执行！！");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		System.out.println("Action执行之后，生成视图之前执行！！");
		User user1=(User) request.getSession().getAttribute("user1");
		String baseUrl=request.getContextPath();
		if(StringUtils.isEmpty(user1)){
			response.sendRedirect(baseUrl);
			return false;
		}
		return true;
	}

}
