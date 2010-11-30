package jaunty.rpm.interceptor;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionInterceptor implements Interceptor, SessionAware {

	private static final long serialVersionUID = 2608387092588918111L;
	private static final Log log = LogFactory.getLog(PermissionInterceptor.class);

	Map<String, Object> session = new HashMap<String, Object>();
	
	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		log.debug("permission interceptor has been invocated");
		
		if (!session.containsKey("user")) {
			return "login";
		}
		
		return arg0.invoke();
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

}
