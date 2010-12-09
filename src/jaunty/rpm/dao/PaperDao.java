package jaunty.rpm.dao;

import jaunty.rpm.bean.Paper;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PaperDao extends HibernateDaoSupport {

	public void save(Paper paper) {
		this.getHibernateTemplate().saveOrUpdate(paper);
	}
	
	@SuppressWarnings("unchecked")
	public List<Paper> getAll() {
		return this.getHibernateTemplate().find("from Paper order by paperId");
	}
	
	public Paper getById(BigDecimal id) {
		return this.getHibernateTemplate().load(Paper.class, id);
	}
	
	public void delete(Paper paper) {
		this.getHibernateTemplate().delete(paper);
	}
	
	public void modify(Paper paper) {
		this.getHibernateTemplate().update(paper);
	}
}
