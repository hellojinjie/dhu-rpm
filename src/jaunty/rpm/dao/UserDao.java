package jaunty.rpm.dao;

import jaunty.rpm.bean.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport {

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
}
