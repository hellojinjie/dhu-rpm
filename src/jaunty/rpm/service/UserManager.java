package jaunty.rpm.service;

import jaunty.rpm.bean.User;

import java.math.BigDecimal;
import java.util.List;

public interface UserManager {
	
	public boolean isVaild(String username, String password);
	
	public boolean isVaild(User user);
	
	public User getUserByName(String username);
	
	public void register(User user);
	
	public User getById(BigDecimal id);
	
	public List<User> getAll();
}
