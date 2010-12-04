package jaunty.rpm.dao;

import jaunty.rpm.bean.ProjectMember;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProjectMemberDao extends HibernateDaoSupport {

	public void add(ProjectMember projectMember) {
		this.getHibernateTemplate().save(projectMember);
	}
	
	@SuppressWarnings("unchecked")
	public List<ProjectMember> getByProjectId(BigDecimal projectId) {
		return this.getHibernateTemplate().find("from ProjectMember wher projectId = ?", projectId);
	}
	
}
