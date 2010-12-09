package jaunty.rpm.dao;

import jaunty.rpm.bean.Paper;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PaperDao extends HibernateDaoSupport {

	public void save(Paper paper) {
		this.getHibernateTemplate().save(paper);
	}
	
	@SuppressWarnings("unchecked")
	public List<Paper> getAll() {
		return this.getHibernateTemplate().find("from Paper");
	}
}
