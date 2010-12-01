package jaunty.rpm.bean;

// Generated Dec 1, 2010 8:29:03 PM by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;
import java.util.Date;

/**
 * BranchCardManage generated by hbm2java
 */
public class BranchCard implements java.io.Serializable {

	private BigDecimal branchCardId;
	private BigDecimal totalCardId;
	private String content;
	private String moneyUsetId;
	private Date moneyGetDate;
	private String note;

	public BranchCard() {
	}

	public BranchCard(BigDecimal branchCardId, BigDecimal totalCardId,
			String content, String moneyUsetId, Date moneyGetDate) {
		this.branchCardId = branchCardId;
		this.totalCardId = totalCardId;
		this.content = content;
		this.moneyUsetId = moneyUsetId;
		this.moneyGetDate = moneyGetDate;
	}

	public BranchCard(BigDecimal branchCardId, BigDecimal totalCardId,
			String content, String moneyUsetId, Date moneyGetDate, String note) {
		this.branchCardId = branchCardId;
		this.totalCardId = totalCardId;
		this.content = content;
		this.moneyUsetId = moneyUsetId;
		this.moneyGetDate = moneyGetDate;
		this.note = note;
	}

	public BigDecimal getBranchCardId() {
		return this.branchCardId;
	}

	public void setBranchCardId(BigDecimal branchCardId) {
		this.branchCardId = branchCardId;
	}

	public BigDecimal getTotalCardId() {
		return this.totalCardId;
	}

	public void setTotalCardId(BigDecimal totalCardId) {
		this.totalCardId = totalCardId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMoneyUsetId() {
		return this.moneyUsetId;
	}

	public void setMoneyUsetId(String moneyUsetId) {
		this.moneyUsetId = moneyUsetId;
	}

	public Date getMoneyGetDate() {
		return this.moneyGetDate;
	}

	public void setMoneyGetDate(Date moneyGetDate) {
		this.moneyGetDate = moneyGetDate;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
