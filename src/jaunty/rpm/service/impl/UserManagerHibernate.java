package jaunty.rpm.service.impl;

import jaunty.rpm.bean.User;
import jaunty.rpm.dao.UserDao;
import jaunty.rpm.service.UserManager;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

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
	public User getUserByName(String username) {
		return userDao.getUserByName(username);
	}
	
	@Override
	public boolean isVaild(User user) {
		return userDao.isVaild(user);
	}

	@Override
	public void register(User user) {
		this.userDao.register(user);
	}

	@Override
	public User getById(BigDecimal id) {
		return this.userDao.getById(id);
	}
	
	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

}
