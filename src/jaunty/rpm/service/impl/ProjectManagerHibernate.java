package jaunty.rpm.service.impl;

import jaunty.rpm.bean.ScientificResearcProject;
import jaunty.rpm.dao.ProjectDao;
import jaunty.rpm.service.ProjectManager;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class ProjectManagerHibernate implements ProjectManager {

	private ProjectDao projectDao;

	@Override
	public void add(ScientificResearcProject project) {
		projectDao.add(project);
	}

	@Override
	public void delete(ScientificResearcProject project) {
		this.projectDao.delete(project);
	}

	@Override
	public List<ScientificResearcProject> getAll() {
		return projectDao.getAll();
	}

	@Override
	public void modify(ScientificResearcProject project) {
		this.projectDao.modify(project);
	}
	
	@Override
	public ScientificResearcProject getById(BigDecimal id) {
		return projectDao.getById(id);
	}
	
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	public ProjectDao getProjectDao() {
		return projectDao;
	}

}
