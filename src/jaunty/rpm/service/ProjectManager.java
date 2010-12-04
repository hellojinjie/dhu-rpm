package jaunty.rpm.service;

import jaunty.rpm.bean.ScientificResearcProject;

import java.util.List;

public interface ProjectManager {

	public void add(ScientificResearcProject project);
	
	public void modify(ScientificResearcProject project);
	
	public void delete(ScientificResearcProject project);
	
	public List<ScientificResearcProject> getAll();
}
