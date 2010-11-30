package jaunty.rpm.dao;

import jaunty.rpm.bean.User;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {

	private static final Log log = LogFactory.getLog(UserDao.class);
	
	public boolean isVaild(User user) {
		
		boolean vaild = false;
		
		this.getHibernateTemplate().findByValueBean(
				"from user where username = :username and password = :password", user);
		if (this.getHibernateTemplate().getFetchSize() == 0) {
			vaild = false;
		} else {
			vaild = true;
		}
		
		return vaild;
	}
	
	@SuppressWarnings("unchecked")
	public User getUserByName(String name) {
		List<User> users = this.getHibernateTemplate().find("from user where username = ?", name);
		
		if (users != null && users.size() > 0) {
			return users.get(0);
		} else {
			log.debug("could not find the specified user: " + name);
			return null;
		}
	}
}
