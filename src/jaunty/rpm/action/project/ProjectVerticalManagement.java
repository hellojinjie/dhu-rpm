package jaunty.rpm.action.project;

import jaunty.rpm.bean.ProjectMember;
import jaunty.rpm.bean.ScientificResearcProject;
import jaunty.rpm.service.ProjectManager;
import jaunty.rpm.service.ProjectMemberManager;

import java.math.BigDecimal;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ProjectVerticalManagement extends ActionSupport {

	private static final long serialVersionUID = 8220251235825319078L;

	private ProjectManager projectManager;
	private ProjectMemberManager projectMemberManager;
	
	private String projectName;
	private BigDecimal projectAttribute;
	private String fundOrigin;
	private String projectClass;
	private String note;
	private String contractFund;
	private String anticipator;

	private List<ScientificResearcProject> projects;
	
	public String index() {
		
		setProjects(projectManager.getAll());
		
		return SUCCESS;
	}
	
	public String addProject() {
		
		ScientificResearcProject project = new ScientificResearcProject();
		project.setContractFund(new BigDecimal(contractFund));
		project.setProjectFund(new BigDecimal(contractFund));
		project.setFundOrigin(fundOrigin);
		project.setNote(note);
		project.setProjectAttribute(new BigDecimal(2));
		project.setProjectName(projectName);
		project.setProjectClass(projectClass);
		projectManager.add(project);

		String s[] = anticipator.split("[,，]");
		
		for (String a : s) {
			ProjectMember member = new ProjectMember();
			member.setMember(a);
			member.setProjectId(project.getProjectId());
			projectMemberManager.add(member);
		}
		
		return SUCCESS;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public BigDecimal getProjectAttribute() {
		return projectAttribute;
	}

	public void setProjectAttribute(BigDecimal projectAttribute) {
		this.projectAttribute = projectAttribute;
	}

	public String getFundOrigin() {
		return fundOrigin;
	}

	public void setFundOrigin(String fundOrigin) {
		this.fundOrigin = fundOrigin;
	}

	public String getProjectClass() {
		return projectClass;
	}

	public void setProjectClass(String projectClass) {
		this.projectClass = projectClass;
	}

	public String getContractFund() {
		return contractFund;
	}

	public void setContractFund(String contractFund) {
		this.contractFund = contractFund;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public ProjectManager getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(ProjectManager projectManager) {
		this.projectManager = projectManager;
	}

	public ProjectMemberManager getProjectMemberManager() {
		return projectMemberManager;
	}

	public void setProjectMemberManager(ProjectMemberManager projectMemberManager) {
		this.projectMemberManager = projectMemberManager;
	}

	public void setAnticipator(String anticipator) {
		this.anticipator = anticipator;
	}

	public String getAnticipator() {
		return anticipator;
	}

	/**
	 * @param projects the projects to set
	 */
	public void setProjects(List<ScientificResearcProject> projects) {
		this.projects = projects;
	}

	/**
	 * @return the projects
	 */
	public List<ScientificResearcProject> getProjects() {
		return projects;
	}
	
}
