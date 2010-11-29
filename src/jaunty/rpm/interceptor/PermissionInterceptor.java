package jaunty.rpm.interceptor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class PermissionInterceptor implements Interceptor {

	private static final long serialVersionUID = 2608387092588918111L;
	private static final Log log = LogFactory.getLog(PermissionInterceptor.class);
		
	@Override
	public void destroy() {

	}

	@Override
	public void init() {

	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		log.debug("permission interceptor has been invocated");
		return arg0.invoke();
	}

}
