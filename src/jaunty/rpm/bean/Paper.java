package jaunty.rpm.bean;

// Generated Dec 1, 2010 8:29:03 PM by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;

/**
 * PaperManage generated by hbm2java
 */
public class Paper implements java.io.Serializable {

	private BigDecimal paperId;
	private String paperName;
	private BigDecimal projectId;
	private BigDecimal paperAuthor;
	private BigDecimal paperAttribute;
	private String note;

	public Paper() {
	}

	public Paper(BigDecimal paperId, String paperName,
			BigDecimal projectId, BigDecimal paperAuthor) {
		this.paperId = paperId;
		this.paperName = paperName;
		this.projectId = projectId;
		this.paperAuthor = paperAuthor;
	}

	public Paper(BigDecimal paperId, String paperName,
			BigDecimal projectId, BigDecimal paperAuthor,
			BigDecimal paperAttribute, String note) {
		this.paperId = paperId;
		this.paperName = paperName;
		this.projectId = projectId;
		this.paperAuthor = paperAuthor;
		this.paperAttribute = paperAttribute;
		this.note = note;
	}

	public BigDecimal getPaperId() {
		return this.paperId;
	}

	public void setPaperId(BigDecimal paperId) {
		this.paperId = paperId;
	}

	public String getPaperName() {
		return this.paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public BigDecimal getProjectId() {
		return this.projectId;
	}

	public void setProjectId(BigDecimal projectId) {
		this.projectId = projectId;
	}

	public BigDecimal getPaperAuthor() {
		return this.paperAuthor;
	}

	public void setPaperAuthor(BigDecimal paperAuthor) {
		this.paperAuthor = paperAuthor;
	}

	public BigDecimal getPaperAttribute() {
		return this.paperAttribute;
	}

	public void setPaperAttribute(BigDecimal paperAttribute) {
		this.paperAttribute = paperAttribute;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
