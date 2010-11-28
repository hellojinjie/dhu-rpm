package jaunty.rpm.action.login;

import jaunty.rpm.service.UserManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	private static final long serialVersionUID = -4560057894186646227L;
	private static final Log log = LogFactory.getLog(Login.class);
	
	private UserManager userManager;
	
	private String username;
	private String password;
	private String email;
	
	public String login() {
		
		log.debug("username is " + getUsername() + "; password is " + getPassword());
		
		if ("123".equals(getUsername())) {
			this.addFieldError("password", "password is not correct!");
			return INPUT;
		}
		
		return SUCCESS;
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
