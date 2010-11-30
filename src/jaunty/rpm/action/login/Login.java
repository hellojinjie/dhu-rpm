package jaunty.rpm.action.login;

import jaunty.rpm.bean.User;
import jaunty.rpm.service.UserManager;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = -4560057894186646227L;
	private static final Log log = LogFactory.getLog(Login.class);
	
	private UserManager userManager;
	private Map<String, Object> session = new HashMap<String, Object>();
	
	private String username;
	private String password;
	private String email;
	
	public String login() {
		
		log.debug("in login page, username is " + getUsername() + "; password is " + getPassword());
		
		if (!userManager.isVaild(getUsername(), getPassword())) {
			this.addFieldError("password", "username or password incorrect!");
			return INPUT;
		}
		
		User user = userManager.getUserByName(getUsername());
		
		session.put("user", user);
		
		return SUCCESS;
	}	
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
