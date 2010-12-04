package jaunty.rpm.service;

import jaunty.rpm.bean.ProjectMember;

import java.math.BigDecimal;
import java.util.List;

public interface ProjectMemberManager {

	public void add(ProjectMember projectMember);
	
	public List<ProjectMember> getByProjectId(BigDecimal projectId);
}
