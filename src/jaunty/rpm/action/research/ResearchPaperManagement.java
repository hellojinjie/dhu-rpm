package jaunty.rpm.action.research;

import jaunty.rpm.bean.Paper;
import jaunty.rpm.service.PaperManager;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;

public class ResearchPaperManagement extends ActionSupport {

	private static final long serialVersionUID = 8220251235825319078L;
	private static final Log log = LogFactory.getLog(ResearchPaperManagement.class);

	private PaperManager paperManager;
	
	List<Paper> papers;
	
	private BigDecimal id;
	private String paperName;
	private String paperAuthor;
	private BigDecimal paperAttribute;
	private String note;
	
	public String index() {
		papers = this.paperManager.getAll();
		return SUCCESS;
	}
	
	public String detail() {
		
		return SUCCESS;
	}
	
	public String addPaper() {
		
		Paper paper = new Paper();
		paper.setPaperName(paperName);
		paper.setPaperAttribute(paperAttribute);
		paper.setPaperAuthor(paperAuthor);
		paper.setNote(note);
		
		paperManager.save(paper);
		
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

	public void setPaperManager(PaperManager paperManager) {
		this.paperManager = paperManager;
	}

	public PaperManager getPaperManager() {
		return paperManager;
	}

	public List<Paper> getPapers() {
		return papers;
	}

	public void setPapers(List<Paper> papers) {
		this.papers = papers;
	}
	
}
