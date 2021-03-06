package jaunty.rpm.bean;

// Generated Dec 1, 2010 8:29:03 PM by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;

/**
 * IntellectualPropertyRights generated by hbm2java
 */
public class IntellectualPropertyRight implements java.io.Serializable {

	private BigDecimal propertyRightsId;
	private String propertyRightsName;
	private BigDecimal achievementId;
	private BigDecimal expense;
	private String note;

	public IntellectualPropertyRight() {
	}

	public IntellectualPropertyRight(BigDecimal propertyRightsId,
			String propertyRightsName, BigDecimal achievementId) {
		this.propertyRightsId = propertyRightsId;
		this.propertyRightsName = propertyRightsName;
		this.achievementId = achievementId;
	}

	public IntellectualPropertyRight(BigDecimal propertyRightsId,
			String propertyRightsName, BigDecimal achievementId,
			BigDecimal expense, String note) {
		this.propertyRightsId = propertyRightsId;
		this.propertyRightsName = propertyRightsName;
		this.achievementId = achievementId;
		this.expense = expense;
		this.note = note;
	}

	public BigDecimal getPropertyRightsId() {
		return this.propertyRightsId;
	}

	public void setPropertyRightsId(BigDecimal propertyRightsId) {
		this.propertyRightsId = propertyRightsId;
	}

	public String getPropertyRightsName() {
		return this.propertyRightsName;
	}

	public void setPropertyRightsName(String propertyRightsName) {
		this.propertyRightsName = propertyRightsName;
	}

	public BigDecimal getAchievementId() {
		return this.achievementId;
	}

	public void setAchievementId(BigDecimal achievementId) {
		this.achievementId = achievementId;
	}

	public BigDecimal getExpense() {
		return this.expense;
	}

	public void setExpense(BigDecimal expense) {
		this.expense = expense;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
