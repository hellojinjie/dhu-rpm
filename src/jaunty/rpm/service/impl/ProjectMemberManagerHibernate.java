package jaunty.rpm.service.impl;

import jaunty.rpm.bean.ProjectMember;
import jaunty.rpm.dao.ProjectMemberDao;
import jaunty.rpm.service.ProjectMemberManager;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ProjectMemberManagerHibernate implements ProjectMemberManager {

	private ProjectMemberDao projectMemberDao;
	
	@Override
	public void add(ProjectMember projectMember) {
		this.projectMemberDao.add(projectMember);
	}

	@Override
	public List<ProjectMember> getByProjectId(BigDecimal projectId) {
		return this.projectMemberDao.getByProjectId(projectId);
	}
	
	public ProjectMemberDao getProjectMemberDao() {
		return projectMemberDao;
	}

	public void setProjectMemberDao(ProjectMemberDao projectMemberDao) {
		this.projectMemberDao = projectMemberDao;
	}
	
}
