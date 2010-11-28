package jaunty.rpm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import jaunty.rpm.bean.User;
import jaunty.rpm.dao.UserDao;
import jaunty.rpm.service.UserManager;

@Transactional
public class UserManagerHibernate implements UserManager {

	private UserDao userDao;
	
	@Override
	public boolean isVaild(String username, String password) {
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		return this.isVaild(user);
	}

	@Override
	public boolean isVaild(User user) {
		return userDao.isVaild(user);
	}

	@Override
	public void register(User user) {
		
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

}
