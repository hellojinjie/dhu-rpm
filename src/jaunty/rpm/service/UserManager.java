package jaunty.rpm.service;

import jaunty.rpm.bean.User;

public interface UserManager {
	
	public boolean isVaild(String username, String password);
	
	public boolean isVaild(User user);
	
	public User getUserByName(String username);
	
	public void register(User user);
}
