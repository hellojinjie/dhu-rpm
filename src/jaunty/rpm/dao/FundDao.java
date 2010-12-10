package jaunty.rpm.dao;

import jaunty.rpm.bean.TotalCard;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class FundDao extends HibernateDaoSupport {
	
	public void save(TotalCard card) {
		
		this.getHibernateTemplate().saveOrUpdate(card);
	}
	
	public void delete(TotalCard card) {
		this.getHibernateTemplate().delete(card);
	}
	
	public TotalCard getById(BigDecimal id) {
		return this.getHibernateTemplate().load(TotalCard.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<TotalCard> getAll() {
		return this.getHibernateTemplate().find("from TotalCard order by cardId");
	}
}
