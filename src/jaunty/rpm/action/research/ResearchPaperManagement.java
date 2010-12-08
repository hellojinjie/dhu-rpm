package jaunty.rpm.action.research;

import java.math.BigDecimal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class ResearchPaperManagement extends ActionSupport {

	private static final long serialVersionUID = 8220251235825319078L;
	private static final Log log = LogFactory.getLog(ResearchPaperManagement.class);

	private BigDecimal id;
	private String paperName;
	private String paperAuthor;
	private BigDecimal paperAttribute;
	private String note;
	
	public String index() {
		
		return SUCCESS;
	}
	
	public String detail() {
		
		return SUCCESS;
	}
	
	public String addPaper() {
		
		return SUCCESS;
	}
	
	public String modify() {
		
		return SUCCESS;
	}
	
	public String delete() {
		
		return SUCCESS;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public String getPaperAuthor() {
		return paperAuthor;
	}

	public void setPaperAuthor(String paperAuthor) {
		this.paperAuthor = paperAuthor;
	}

	public BigDecimal getPaperAttribute() {
		return paperAttribute;
	}

	public void setPaperAttribute(BigDecimal paperAttribute) {
		this.paperAttribute = paperAttribute;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}
