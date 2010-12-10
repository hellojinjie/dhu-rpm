package jaunty.rpm.action.fund;

import jaunty.rpm.bean.TotalCard;
import jaunty.rpm.service.FundManager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class HorizontalAction extends ActionSupport {

	private static final long serialVersionUID = 2424845293925034559L;

	private FundManager fundManager;
	private List<TotalCard> cards;
	
	private BigDecimal id;
	private BigDecimal projectId;
	private String note;
	private BigDecimal inclusionFund;
	private BigDecimal cardAttribute;
	
	public String index() {
		
		cards = new ArrayList<TotalCard>();
		cards.addAll(fundManager.getAll());
		
		return SUCCESS;
	}
	
	public String add() {
		TotalCard card = new TotalCard();
		card.setCardAttribute(cardAttribute);
		card.setInclusionFund(inclusionFund);
		card.setNote(note);
		card.setProjectId(projectId);
		fundManager.save(card);
		return SUCCESS;
	}
	
	public String detail() {
		cards = new ArrayList<TotalCard>();
		cards.add(fundManager.getById(id));
		return SUCCESS;
	}
	
	public String edit() {
		TotalCard card = this.fundManager.getById(id);
		this.cardAttribute = card.getCardAttribute();
		this.inclusionFund = card.getInclusionFund();
		this.note = card.getNote();
		this.projectId = card.getProjectId();
		
		return SUCCESS;
	}
	
	public String modify() {
		TotalCard card = this.fundManager.getById(id);
		card.setCardAttribute(cardAttribute);
		card.setInclusionFund(inclusionFund);
		card.setNote(note);
		card.setProjectId(projectId);
		fundManager.save(card);
		return SUCCESS;
	}
	
	public String delete() {
		this.fundManager.delete(this.fundManager.getById(id));
		return SUCCESS;
	}

	public void setCards(List<TotalCard> cards) {
		this.cards = cards;
	}

	public List<TotalCard> getCards() {
		return cards;
	}

	public void setFundManager(FundManager fundManager) {
		this.fundManager = fundManager;
	}

	public FundManager getFundManager() {
		return fundManager;
	}

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

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public BigDecimal getInclusionFund() {
		return inclusionFund;
	}

	public void setInclusionFund(BigDecimal inclusionFund) {
		this.inclusionFund = inclusionFund;
	}

	public BigDecimal getCardAttribute() {
		return cardAttribute;
	}

	public void setCardAttribute(BigDecimal cardAttribute) {
		this.cardAttribute = cardAttribute;
	}
	
}
