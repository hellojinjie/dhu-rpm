package jaunty.rpm.service.impl;

import jaunty.rpm.bean.TotalCard;
import jaunty.rpm.dao.FundDao;
import jaunty.rpm.service.FundManager;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class FundManagerHibernate implements FundManager {

	private FundDao fundDao;
	
	@Override
	public void delete(TotalCard card) {
		this.fundDao.delete(card);
	}

	@Override
	public List<TotalCard> getAll() {
		return this.fundDao.getAll();
	}

	@Override
	public TotalCard getById(BigDecimal id) {
		return this.fundDao.getById(id);
	}

	@Override
	public void save(TotalCard card) {
		this.fundDao.save(card);
	}

	public void setFundDao(FundDao fundDao) {
		this.fundDao = fundDao;
	}

	public FundDao getFundDao() {
		return fundDao;
	}

}
