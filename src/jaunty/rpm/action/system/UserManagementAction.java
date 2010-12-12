package jaunty.rpm.action.system;

import jaunty.rpm.bean.User;
import jaunty.rpm.service.UserManager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class UserManagementAction extends ActionSupport {

	private static final long serialVersionUID = -934396755239711321L;

	private UserManager userManager;
	
	private List<User> users;

	private String username;
	private String password;
	private String note;
	private String permission;
	private BigDecimal deparmentId;
	
	private BigDecimal id;
	
	public String index() {
		
		users = new ArrayList<User>();
		users.addAll(this.userManager.getAll());
		
		return SUCCESS;
	}
	
	public String add() {
		User user = new User();
		user.setNote(note);
		user.setPassword(password);
		user.setPermission(permission);
		user.setUsername(username);
		userManager.register(user);
		return SUCCESS;
	}

	public String edit() {
		User user = userManager.getById(id);
		this.note = user.getNote();
		this.password = user.getPassword();
		this.permission = user.getPermission();
		this.username = user.getUsername();
		return SUCCESS;
	}
	
	public String detail() {
		
		users = new ArrayList<User>();
		users.add(this.userManager.getById(id));
		
		return SUCCESS;
	}
	
	public String modify() {

		User user = userManager.getById(id);
		user.setNote(note);
		user.setPassword(password);
		user.setPermission(permission);
		user.setUsername(username);
		userManager.register(user);
		
		return SUCCESS;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public BigDecimal getDeparmentId() {
		return deparmentId;
	}

	public void setDeparmentId(BigDecimal deparmentId) {
		this.deparmentId = deparmentId;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}
	
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	public UserManager getUserManager() {
		return userManager;
	}
}
