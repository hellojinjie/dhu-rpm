package jaunty.rpm.dao;

import jaunty.rpm.bean.ProjectMember;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProjectMemberDao extends HibernateDaoSupport {

	public void add(ProjectMember projectMember) {
		this.getHibernateTemplate().save(projectMember);
	}
	
}
