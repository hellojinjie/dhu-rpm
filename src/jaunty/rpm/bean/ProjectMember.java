package jaunty.rpm.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProjectMember implements Serializable {

	private static final long serialVersionUID = 7359361329818895034L;

	private BigDecimal id;
	private BigDecimal projectId;
	private String member;
	
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public BigDecimal getProjectId() {
		return projectId;
	}
	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	
}
