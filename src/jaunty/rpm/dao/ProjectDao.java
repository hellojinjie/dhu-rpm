package jaunty.rpm.dao;

import jaunty.rpm.bean.ScientificResearcProject;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProjectDao extends HibernateDaoSupport {

	public void add(ScientificResearcProject project) {
		this.getHibernateTemplate().save(project);
	}
	
	public void modify(ScientificResearcProject project) {
		this.getHibernateTemplate().saveOrUpdate(project);
	}
	
	public void delete(ScientificResearcProject project) {
		this.getHibernateTemplate().delete(project);
	}
	
	@SuppressWarnings("unchecked")
	public List<ScientificResearcProject> getAll() {
		return this.getHibernateTemplate().find("from ScientificResearcProject");
	}
}
