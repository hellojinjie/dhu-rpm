package jaunty.rpm.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import jaunty.rpm.bean.Paper;
import jaunty.rpm.dao.PaperDao;
import jaunty.rpm.service.PaperManager;

@Transactional
public class PaperManagerHibernate implements PaperManager {

	private PaperDao paperDao;
	
	@Override
	public void save(Paper paper) {
		this.paperDao.save(paper);
	}

	@Override
	public List<Paper> getAll() {
		return this.paperDao.getAll();
	}

	@Override
	public Paper getById(BigDecimal id) {
		return this.paperDao.getById(id);
	}

	@Override
	public void delete(Paper paper) {
		this.paperDao.delete(paper);
	}
	
	@Override
	public void modify(Paper paper) {
		this.paperDao.modify(paper);
	}

	public PaperDao getPaperDao() {
		return paperDao;
	}

	public void setPaperDao(PaperDao paperDao) {
		this.paperDao = paperDao;
	}

}
