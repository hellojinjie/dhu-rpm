package jaunty.rpm.dao;

import jaunty.rpm.bean.User;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {

	private static final Log log = LogFactory.getLog(UserDao.class);
	
	@SuppressWarnings("unchecked")
	public boolean isVaild(User user) {
		
		boolean vaild = false;
		
		List<User> users = this.getHibernateTemplate().find(
				"from User where username = ? and password = ?", 
				user.getUsername(), user.getPassword());
	
		if (users.size() == 0) {
			vaild = false;
		} else {
			vaild = true;
		}
		
		return vaild;
	}
	
	@SuppressWarnings("unchecked")
	public User getUserByName(String name) {
		List<User> users = this.getHibernateTemplate().find("from User where username = ?", name);
		
		if (users != null && users.size() > 0) {
			return users.get(0);
		} else {
			log.debug("could not find the specified user: " + name);
			return null;
		}
	}
	
	public void register(User user) {
		this.getHibernateTemplate().saveOrUpdate(user);
	}
	
	public User getById(BigDecimal id) {
		return this.getHibernateTemplate().load(User.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAll() {
		return this.getHibernateTemplate().find("from User order by userid");
	}
}
