package jaunty.rpm.service;

import jaunty.rpm.bean.TotalCard;

import java.math.BigDecimal;
import java.util.List;

public interface FundManager {

	public void save(TotalCard card);
	
	public void delete(TotalCard card);
	
	public TotalCard getById(BigDecimal id);
	
	public List<TotalCard> getAll();
}
