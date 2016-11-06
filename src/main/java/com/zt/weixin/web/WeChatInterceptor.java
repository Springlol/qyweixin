package com.zt.weixin.web;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;
import java.util.Set;

/**
 * 微信登录拦截器
 * @author Lisi
 *
 */
public class WeChatInterceptor extends AbstractInterceptor {
	public static final String WX_TARGET_PATH = "wxTargetPath";
	public static final String WX_TARGET_PARAMS = "wxTargetParams";
	/**
	 * 拦截器
	 * session为空则进行拦截
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		String userid = (String) WebUtil.getSession().getAttribute("userid");
		if(userid == null || userid == ""){
			String path = WebUtil.getRequest().getServletPath();
			WebUtil.getSession().setAttribute(WX_TARGET_PATH, path);
			Map<String, String[]> map = WebUtil.getRequest().getParameterMap();
			String parmStr="";
			Set<String> keys = map.keySet();
			for (String key : keys) {  
				String[] parms = map.get(key);
				for (String parm : parms) {
					parmStr += key + "=" + parm + "&";
				}
	 		}
			WebUtil.getSession().setAttribute(WX_TARGET_PARAMS, parmStr);
			return "weChat";
		}
		return this.doInvoke(actionInvocation);
	}
	  /**
     * 继续拦截器链
     * @param actionInvocation
     * @throws Exception
     */
	private String doInvoke(ActionInvocation actionInvocation) throws Exception {
        return actionInvocation.invoke();
    }

}
