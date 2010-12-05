package jaunty.rpm.action.project;

import jaunty.rpm.bean.ProjectMember;
import jaunty.rpm.bean.ScientificResearcProject;
import jaunty.rpm.service.ProjectManager;
import jaunty.rpm.service.ProjectMemberManager;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class ProjectVerticalManagement extends ActionSupport {

	private static final long serialVersionUID = 8220251235825319078L;
	private static final Log log = LogFactory.getLog(ProjectVerticalManagement.class);

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

	private BigDecimal id;
	
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

	public String detail() {
		ScientificResearcProject project = projectManager.getById(id);
		projects = new LinkedList<ScientificResearcProject>();
		projects.add(project);
		
		List<ProjectMember> members = projectMemberManager.getByProjectId(project.getProjectId());
		anticipator = "";
		for (ProjectMember member : members) {
			anticipator += member.getMember();
			anticipator += ", ";
		}
		log.debug("project anticiptor are:" + anticipator);
		return SUCCESS;
	}
	
	public String edit() {
		
		ScientificResearcProject project = projectManager.getById(id);
		
		this.projectAttribute = project.getProjectAttribute();
		this.projectClass = project.getProjectClass();
		this.contractFund = project.getContractFund().toPlainString();
		this.fundOrigin = project.getFundOrigin();
		this.note = project.getNote();
		this.projectName = project.getProjectName();
		
		List<ProjectMember> members = projectMemberManager.getByProjectId(project.getProjectId());
		anticipator = "";
		for (ProjectMember member : members) {
			anticipator += member.getMember();
			anticipator += ", ";
		}
		return SUCCESS;
	}
	
	public String modify() {

		ScientificResearcProject project = projectManager.getById(id);
		project.setContractFund(new BigDecimal(contractFund));
		project.setProjectFund(new BigDecimal(contractFund));
		project.setFundOrigin(fundOrigin);
		project.setNote(note);
		project.setProjectAttribute(new BigDecimal(2));
		project.setProjectName(projectName);
		project.setProjectClass(projectClass);
		projectManager.modify(project);
		
		return SUCCESS;
	}
	
	public String delete() {
		
		this.projectManager.delete(this.projectManager.getById(id));
		
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

	public void setProjects(List<ScientificResearcProject> projects) {
		this.projects = projects;
	}

	public List<ScientificResearcProject> getProjects() {
		return projects;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getId() {
		return id;
	}
	
}
