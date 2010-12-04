package jaunty.rpm.service.impl;

import org.springframework.transaction.annotation.Transactional;

import jaunty.rpm.bean.ProjectMember;
import jaunty.rpm.dao.ProjectMemberDao;
import jaunty.rpm.service.ProjectMemberManager;

@Transactional
public class ProjectMemberManagerHibernate implements ProjectMemberManager {

	private ProjectMemberDao projectMemberDao;
	
	@Override
	public void add(ProjectMember projectMember) {
		this.projectMemberDao.add(projectMember);
	}

	public ProjectMemberDao getProjectMemberDao() {
		return projectMemberDao;
	}

	public void setProjectMemberDao(ProjectMemberDao projectMemberDao) {
		this.projectMemberDao = projectMemberDao;
	}
	
}
